package com.cdkj.pipe.ao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdkj.pipe.ao.IDemandOrderAO;
import com.cdkj.pipe.bo.IAccountBO;
import com.cdkj.pipe.bo.ICommentBO;
import com.cdkj.pipe.bo.IDemandBO;
import com.cdkj.pipe.bo.IDemandOrderBO;
import com.cdkj.pipe.bo.base.Paginable;
import com.cdkj.pipe.domain.DemandOrder;
import com.cdkj.pipe.enums.EBizType;
import com.cdkj.pipe.enums.ECurrency;
import com.cdkj.pipe.enums.EDemandOrderStatus;
import com.cdkj.pipe.enums.ESystemUser;
import com.cdkj.pipe.exception.BizException;

@Service
public class DemandOrderAOImpl implements IDemandOrderAO {

    @Autowired
    private IDemandOrderBO demandOrderBO;

    @Autowired
    private IDemandBO demandBO;

    @Autowired
    private IAccountBO accountBO;

    @Autowired
    private ICommentBO commentBO;

    @Override
    @Transactional
    public void complete(String code, String evaluate, Long giveIntegral,
            String updater, String remark) {
        DemandOrder demandOrder = demandOrderBO.getDemandOrder(code);
        if (!EDemandOrderStatus.ING.getCode().equals(demandOrder.getStatus())) {
            throw new BizException("xn0000", "当前订单状态不允许进行完成操作");
        }
        // 添加水电工评价
        commentBO.saveComment(null, evaluate, null,
            demandOrder.getDealerCode(), demandOrder.getReceiver());

        // 赠送相应积分
        doGivePresent(demandOrder.getReceiver(), giveIntegral);

        // 修改订单状态
        demandOrderBO.complete(demandOrder, evaluate, giveIntegral, updater,
            remark);

        // 修改需求状态
        demandBO.complete(code, updater);
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
        return demandOrderBO.getPaginable(start, limit, condition);
    }

    @Override
    public List<DemandOrder> queryDemandOrderList(DemandOrder condition) {
        return demandOrderBO.queryDemandOrderList(condition);
    }

    @Override
    public DemandOrder getDemandOrder(String code) {
        return demandOrderBO.getDemandOrder(code);
    }

    private void doGivePresent(String userId, Long giveIntegral) {
        if (giveIntegral > 0) {
            accountBO.doTransferAmount(ESystemUser.SYS_USER.getCode(), userId,
                giveIntegral, ECurrency.XNB, "", EBizType.AJ_WCDDSJF);
        }
    }

}
