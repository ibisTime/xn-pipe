package com.cdkj.pipe.bo.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cdkj.pipe.bo.IDemandOrderBO;
import com.cdkj.pipe.bo.base.PaginableBOImpl;
import com.cdkj.pipe.dao.IDemandOrderDAO;
import com.cdkj.pipe.domain.DemandOrder;
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
    public String saveDemandOrder(DemandOrder data) {
        String code = null;
        if (data != null) {
            // code = OrderNoGenerater.generateM(EGeneratePrefix.CT.getCode());
            data.setCode(code);
            demandOrderDAO.insert(data);
        }
        return code;
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
}
