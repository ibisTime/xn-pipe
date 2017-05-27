package com.cdkj.pipe.bo.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cdkj.pipe.bo.IDemandOrderBO;
import com.cdkj.pipe.bo.base.PaginableBOImpl;
import com.cdkj.pipe.core.EGeneratePrefix;
import com.cdkj.pipe.core.OrderNoGenerater;
import com.cdkj.pipe.dao.IDemandOrderDAO;
import com.cdkj.pipe.domain.DemandOrder;
import com.cdkj.pipe.enums.EDemandOrderStatus;
import com.cdkj.pipe.exception.BizException;

@Component
public class DemandOrderBOImpl extends PaginableBOImpl<DemandOrder> implements
        IDemandOrderBO {

    @Autowired
    private IDemandOrderDAO demandOrderDAO;

    @Override
    public boolean isDemandOrderExist(String code) {
        DemandOrder condition = new DemandOrder();
        condition.setCode(code);
        if (demandOrderDAO.selectTotalCount(condition) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public String saveDemandOrder(String type, String demandCode,
            String dealerCode, String receiver, String remark) {
        String code = null;
        DemandOrder data = new DemandOrder();
        Date now = new Date();
        code = OrderNoGenerater.generateM(EGeneratePrefix.DEMAND_ORDER
            .getCode());
        data.setCode(code);
        data.setType(type);
        data.setDemandCode(demandCode);
        data.setDealerCode(dealerCode);
        data.setReceiver(receiver);
        data.setReceiveDatetime(now);
        data.setStatus(EDemandOrderStatus.ING.getCode());
        data.setUpdater(receiver);
        data.setUpdateDatetime(now);
        data.setRemark(remark);
        data.setGiveIntegral(0L);
        demandOrderDAO.insert(data);
        return code;
    }

    @Override
    public void complete(DemandOrder order, String evaluate, Long giveIntegral,
            String updater, String remark) {
        order.setGiveIntegral(giveIntegral);
        order.setStatus(EDemandOrderStatus.FINISH.getCode());
        order.setUpdater(updater);
        order.setUpdateDatetime(new Date());
        order.setRemark(remark);
        demandOrderDAO.updateComplete(order);
    }

    @Override
    public int removeDemandOrder(String code) {
        int count = 0;
        if (StringUtils.isNotBlank(code)) {
            DemandOrder data = new DemandOrder();
            data.setCode(code);
            count = demandOrderDAO.delete(data);
        }
        return count;
    }

    @Override
    public int refreshDemandOrder(DemandOrder data) {
        int count = 0;
        if (StringUtils.isNotBlank(data.getCode())) {
            // count = demandOrderDAO.update(data);
        }
        return count;
    }

    @Override
    public List<DemandOrder> queryDemandOrderList(DemandOrder condition) {
        return demandOrderDAO.selectList(condition);
    }

    @Override
    public DemandOrder getDemandOrder(String code) {
        DemandOrder data = null;
        if (StringUtils.isNotBlank(code)) {
            DemandOrder condition = new DemandOrder();
            condition.setCode(code);
            data = demandOrderDAO.select(condition);
            if (data == null) {
                throw new BizException("xn0000", "记录不存在");
            }
        }
        return data;
    }

    @Override
    public void userCancel(DemandOrder order, String userId) {
        order.setStatus(EDemandOrderStatus.USER_CANCEL.getCode());
        order.setUpdater(userId);
        order.setUpdateDatetime(new Date());
        order.setRemark("水电工原因取消");
        demandOrderDAO.updateUserCancel(order);

    }

    @Override
    public void dealerCancel(DemandOrder order, String dealerCode) {
        order.setStatus(EDemandOrderStatus.DEALER_CACEL.getCode());
        order.setUpdater(dealerCode);
        order.setUpdateDatetime(new Date());
        order.setRemark("经销商原因取消");
        demandOrderDAO.updateDealerCancel(order);

    }

    @Override
    public Long getTakeCountToday(String userId) {
        DemandOrder condition = new DemandOrder();
        condition.setReceiver(userId);
        condition.setReceiveDatetime(new Date());
        return this.getTotalCount(condition);
    }

    @Override
    public int uploadPic(DemandOrder data) {
        int count = 0;
        if (data != null) {
            count = demandOrderDAO.updateUploadPic(data);
        }
        return count;
    }
}
