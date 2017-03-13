package com.cdkj.pipe.ao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdkj.pipe.ao.IDemandAO;
import com.cdkj.pipe.api.converter.ReqConverter;
import com.cdkj.pipe.bo.IDemandBO;
import com.cdkj.pipe.bo.IDemandOrderBO;
import com.cdkj.pipe.bo.base.Paginable;
import com.cdkj.pipe.domain.Demand;
import com.cdkj.pipe.dto.req.XN619020Req;
import com.cdkj.pipe.dto.req.XN619022Req;
import com.cdkj.pipe.enums.EDemandOrderType;
import com.cdkj.pipe.enums.EDemandStatus;
import com.cdkj.pipe.exception.BizException;

@Service
public class DemandAOImpl implements IDemandAO {

    @Autowired
    private IDemandBO demandBO;

    @Autowired
    private IDemandOrderBO demandOrderBO;

    @Override
    public String addDemand(XN619020Req req) {
        Demand data = ReqConverter.converter(req);
        return demandBO.saveDemand(data);
    }

    @Override
    public int editDemand(XN619022Req req) {
        Demand demand = demandBO.getDemand(req.getCode());
        if (!EDemandStatus.NEW.getCode().equals(demand.getStatus())
                && !EDemandStatus.PUT_OFF.getCode().equals(demand.getStatus())) {
            throw new BizException("xn0000", "只有未发布或者已下架的需求可以修改");
        }
        Demand data = ReqConverter.converter(req);
        return demandBO.refreshDemand(data);
    }

    @Override
    public int dropDemand(String code) {
        Demand demand = demandBO.getDemand(code);
        if (!EDemandStatus.NEW.getCode().equals(demand.getStatus())
                && !EDemandStatus.PUT_OFF.getCode().equals(demand.getStatus())) {
            throw new BizException("xn0000", "只有未发布或者已下架的需求可以删除");
        }
        return demandBO.removeDemand(code);
    }

    @Override
    public int putOn(String code, String updater, String remark) {
        Demand demand = demandBO.getDemand(code);
        if (!EDemandStatus.NEW.getCode().equals(demand.getStatus())
                && !EDemandStatus.PUT_OFF.getCode().equals(demand.getStatus())) {
            throw new BizException("xn0000", "只有未发布或者已下架的需求可以发布");
        } else {
            return demandBO.putOn(code, updater, remark);
        }
    }

    @Override
    public int putOff(String code, String updater, String remark) {
        Demand demand = demandBO.getDemand(code);
        if (EDemandStatus.PUT_ON.getCode().equals(demand.getStatus())) {
            return demandBO.putOff(code, updater, remark);
        } else {
            throw new BizException("xn0000", "需求已经不处于发布状态，不允许下架操作");
        }

    }

    @Override
    @Transactional
    public void takeDirectly(String code, String userId) {
        Demand demand = demandBO.getDemand(code);
        if (!EDemandStatus.PUT_ON.getCode().equals(demand.getStatus())) {
            throw new BizException("xn0000", "需求状态不允许接单操作");
        }
        // 修改需求状态
        demandBO.take(code, userId);
        // 形成需求订单
        demandOrderBO.saveDemandOrder(EDemandOrderType.RECEIVE.getCode(), code,
            demand.getDealerCode(), userId, "订单进行中");
    }

    @Override
    public Paginable<Demand> queryDemandPage(int start, int limit,
            Demand condition) {
        return demandBO.getPaginable(start, limit, condition);
    }

    @Override
    public List<Demand> queryDemandList(Demand condition) {
        return demandBO.queryDemandList(condition);
    }

    @Override
    public Demand getDemand(String code) {
        return demandBO.getDemand(code);
    }

}
