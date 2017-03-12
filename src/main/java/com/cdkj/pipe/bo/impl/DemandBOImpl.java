package com.cdkj.pipe.bo.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cdkj.pipe.bo.IDemandBO;
import com.cdkj.pipe.bo.base.PaginableBOImpl;
import com.cdkj.pipe.dao.IDemandDAO;
import com.cdkj.pipe.domain.Demand;
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
            // code = OrderNoGenerater.generateM(EGeneratePrefix.CT.getCode());
            data.setCode(code);
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
            // count = demandDAO.update(data);
        }
        return count;
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
                throw new BizException("xn0000", "记录不存在");
            }
        }
        return data;
    }
}
