package com.cdkj.pipe.ao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdkj.pipe.ao.IDemandOrderAO;
import com.cdkj.pipe.bo.IDemandOrderBO;
import com.cdkj.pipe.bo.base.Paginable;
import com.cdkj.pipe.domain.DemandOrder;
import com.cdkj.pipe.exception.BizException;

@Service
public class DemandOrderAOImpl implements IDemandOrderAO {

    @Autowired
    private IDemandOrderBO demandOrderBO;

    @Override
    public int editDemandOrder(DemandOrder data) {
        if (!demandOrderBO.isDemandOrderExist(data.getCode())) {
            throw new BizException("xn0000", "记录编号不存在");
        }
        return demandOrderBO.refreshDemandOrder(data);
    }

    @Override
    public int dropDemandOrder(String code) {
        if (!demandOrderBO.isDemandOrderExist(code)) {
            throw new BizException("xn0000", "记录编号不存在");
        }
        return demandOrderBO.removeDemandOrder(code);
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
}
