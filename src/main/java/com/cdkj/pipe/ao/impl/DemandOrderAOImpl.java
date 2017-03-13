package com.cdkj.pipe.ao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdkj.pipe.ao.IDemandOrderAO;
import com.cdkj.pipe.bo.IAccountBO;
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
    private IAccountBO accountBO;

    @Override
    public void complete(String code, String evaluate, Long giveIntegral,
            String updater, String remark) {
        DemandOrder demandOrder = demandOrderBO.getDemandOrder(code);
        if (!EDemandOrderStatus.ING.getCode().equals(demandOrder.getStatus())) {
            throw new BizException("xn0000", "当前订单状态不允许进行完成操作");
        }
        // 添加水电工评价

        // 赠送相应积分
        doGivePresent(demandOrder.getReceiver(), giveIntegral);

        // 修改订单状态
        demandOrderBO.complete(demandOrder, evaluate, giveIntegral, updater,
            remark);
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
