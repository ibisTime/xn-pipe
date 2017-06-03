package com.cdkj.pipe.ao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdkj.pipe.ao.IDemandOrderAO;
import com.cdkj.pipe.bo.IAccountBO;
import com.cdkj.pipe.bo.ICommentBO;
import com.cdkj.pipe.bo.IDealerBO;
import com.cdkj.pipe.bo.IDemandBO;
import com.cdkj.pipe.bo.IDemandOrderBO;
import com.cdkj.pipe.bo.IUserBO;
import com.cdkj.pipe.bo.base.Paginable;
import com.cdkj.pipe.domain.DemandOrder;
import com.cdkj.pipe.enums.EBizType;
import com.cdkj.pipe.enums.ECurrency;
import com.cdkj.pipe.enums.EDemandOrderStatus;
import com.cdkj.pipe.exception.BizException;

@Service
public class DemandOrderAOImpl implements IDemandOrderAO {

    @Autowired
    private IDemandOrderBO demandOrderBO;

    @Autowired
    private IDemandBO demandBO;

    @Autowired
    private IDealerBO dealerBO;

    @Autowired
    private IAccountBO accountBO;

    @Autowired
    private ICommentBO commentBO;

    @Autowired
    private IUserBO userBO;

    @Override
    @Transactional
    public void complete(String code, String evaluate, Long giveIntegral,
            String updater, String remark) {
        DemandOrder demandOrder = demandOrderBO.getDemandOrder(code);
        if (!EDemandOrderStatus.ING.getCode().equals(demandOrder.getStatus())) {
            throw new BizException("xn0000", "当前订单状态不允许进行完成操作");
        }
        // 修改订单状态
        demandOrderBO.complete(demandOrder, evaluate, giveIntegral, updater,
            remark);

        // 修改需求状态
        demandBO.complete(code, updater);

        // 添加水电工评价
        commentBO.saveComment(null, evaluate, null,
            demandOrder.getDealerCode(), demandOrder.getReceiver());

        // 赠送相应积分
        doGivePresent(demandOrder.getDealerCode(), demandOrder.getReceiver(),
            giveIntegral);
    }

    @Override
    @Transactional
    public void userCancel(String code, String userId) {
        DemandOrder demandOrder = demandOrderBO.getDemandOrder(code);
        if (!EDemandOrderStatus.ING.getCode().equals(demandOrder.getStatus())) {
            throw new BizException("xn0000", "当前订单状态不允许进行取消操作");
        }
        // 修改需求状态
        demandBO.cancel(demandOrder.getDemandCode(), userId);

        // 修改订单状态
        demandOrderBO.userCancel(demandOrder, userId);
    }

    @Override
    @Transactional
    public void dealerCancel(String code, String dealerCode) {
        DemandOrder demandOrder = demandOrderBO.getDemandOrder(code);
        if (!EDemandOrderStatus.ING.getCode().equals(demandOrder.getStatus())) {
            throw new BizException("xn0000", "当前订单状态不允许进行取消操作");
        }
        // 修改需求状态
        demandBO.cancel(demandOrder.getDemandCode(), dealerCode);

        // 修改订单状态
        demandOrderBO.dealerCancel(demandOrder, dealerCode);
    }

    @Override
    public Paginable<DemandOrder> queryDemandOrderPage(int start, int limit,
            DemandOrder condition) {
        Paginable<DemandOrder> results = demandOrderBO.getPaginable(start,
            limit, condition);
        for (DemandOrder order : results.getList()) {
            order.setUser(userBO.getRemoteUser(order.getReceiver()));
        }
        return results;
    }

    @Override
    public List<DemandOrder> queryDemandOrderList(DemandOrder condition) {
        return demandOrderBO.queryDemandOrderList(condition);
    }

    @Override
    public DemandOrder getDemandOrder(String code) {
        DemandOrder demandOrder = demandOrderBO.getDemandOrder(code);
        if (null != demandOrder) {
            demandOrder
                .setUser(userBO.getRemoteUser(demandOrder.getReceiver()));
        }
        return demandOrder;
    }

    private void doGivePresent(String dealerCode, String userId,
            Long giveIntegral) {
        if (giveIntegral > 0) {
            String fromUserId = dealerBO.getDealerUserId(dealerCode);
            accountBO.doTransferAmountRemote(fromUserId, userId, ECurrency.JF,
                giveIntegral, EBizType.GD_WCDDSJF,
                EBizType.GD_WCDDSJF.getValue(), EBizType.GD_WCDDSJF.getValue());
        }
    }

    @Override
    public void uploadPic(String code, String pic) {
        DemandOrder demandOrder = demandOrderBO.getDemandOrder(code);
        if (!EDemandOrderStatus.ING.getCode().equals(demandOrder.getStatus())) {
            throw new BizException("xn0000", "当前订单状态不允许进行上传图片操作");
        }
        demandOrder.setPic(pic);
        demandOrderBO.uploadPic(demandOrder);
    }

}
