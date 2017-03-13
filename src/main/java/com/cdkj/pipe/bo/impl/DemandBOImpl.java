package com.cdkj.pipe.bo.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cdkj.pipe.bo.IDemandBO;
import com.cdkj.pipe.bo.base.PaginableBOImpl;
import com.cdkj.pipe.core.EGeneratePrefix;
import com.cdkj.pipe.core.OrderNoGenerater;
import com.cdkj.pipe.dao.IDemandDAO;
import com.cdkj.pipe.domain.Demand;
import com.cdkj.pipe.enums.EDealerStatus;
import com.cdkj.pipe.enums.EDemandStatus;
import com.cdkj.pipe.exception.BizException;

@Component
public class DemandBOImpl extends PaginableBOImpl<Demand> implements IDemandBO {

    @Autowired
    private IDemandDAO demandDAO;

    @Override
    public boolean isDemandExist(String code) {
        Demand condition = new Demand();
        condition.setCode(code);
        if (demandDAO.selectTotalCount(condition) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public String saveDemand(Demand data) {
        String code = null;
        if (data != null) {
            Date now = new Date();
            code = OrderNoGenerater.generateM(EGeneratePrefix.DEMAND.getCode());
            data.setCode(code);
            data.setCreateDatetime(now);
            data.setUpdateDatetime(now);
            data.setStatus(EDealerStatus.NEW.getCode());
            demandDAO.insert(data);
        }
        return code;
    }

    @Override
    public int removeDemand(String code) {
        int count = 0;
        if (StringUtils.isNotBlank(code)) {
            Demand data = new Demand();
            data.setCode(code);
            count = demandDAO.delete(data);
        }
        return count;
    }

    @Override
    public int refreshDemand(Demand data) {
        int count = 0;
        if (StringUtils.isNotBlank(data.getCode())) {
            data.setUpdateDatetime(new Date());
            count = demandDAO.update(data);
        }
        return count;
    }

    @Override
    public int putOn(String code, String updater, String remark) {
        Demand data = new Demand();
        data.setCode(code);
        data.setUpdater(updater);
        data.setUpdateDatetime(new Date());
        data.setRemark(remark);
        data.setStatus(EDealerStatus.PUT_ON.getCode());
        return demandDAO.updatePutOnOff(data);
    }

    @Override
    public int putOff(String code, String updater, String remark) {
        Demand data = new Demand();
        data.setCode(code);
        data.setUpdater(updater);
        data.setUpdateDatetime(new Date());
        data.setRemark(remark);
        data.setStatus(EDealerStatus.PUT_OFF.getCode());
        return demandDAO.updatePutOnOff(data);
    }

    @Override
    public List<Demand> queryDemandList(Demand condition) {
        return demandDAO.selectList(condition);
    }

    @Override
    public Demand getDemand(String code) {
        Demand data = null;
        if (StringUtils.isNotBlank(code)) {
            Demand condition = new Demand();
            condition.setCode(code);
            data = demandDAO.select(condition);
            if (data == null) {
                throw new BizException("xn0000", "需求编号不存在");
            }
        }
        return data;
    }

    @Override
    public int take(String code, String userId) {
        Demand data = new Demand();
        data.setStatus(EDemandStatus.RECEIVE.getCode());
        data.setCode(code);
        data.setUpdater(userId);
        data.setUpdateDatetime(new Date());
        data.setRemark("用户接单");
        return demandDAO.updateTake(data);
    }
}
