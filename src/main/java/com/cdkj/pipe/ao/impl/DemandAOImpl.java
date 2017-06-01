package com.cdkj.pipe.ao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdkj.pipe.ao.IDemandAO;
import com.cdkj.pipe.api.converter.ReqConverter;
import com.cdkj.pipe.bo.IAssignBO;
import com.cdkj.pipe.bo.IDealerBO;
import com.cdkj.pipe.bo.IDemandBO;
import com.cdkj.pipe.bo.IDemandOrderBO;
import com.cdkj.pipe.bo.IHearBO;
import com.cdkj.pipe.bo.ISYSConfigBO;
import com.cdkj.pipe.bo.ISmsOutBO;
import com.cdkj.pipe.bo.base.Paginable;
import com.cdkj.pipe.common.SysConstants;
import com.cdkj.pipe.core.StringValidater;
import com.cdkj.pipe.domain.Dealer;
import com.cdkj.pipe.domain.Demand;
import com.cdkj.pipe.domain.Hear;
import com.cdkj.pipe.dto.req.XN619020Req;
import com.cdkj.pipe.dto.req.XN619022Req;
import com.cdkj.pipe.enums.EDealerStatus;
import com.cdkj.pipe.enums.EDemandOrderType;
import com.cdkj.pipe.enums.EDemandStatus;
import com.cdkj.pipe.enums.EHearStatus;
import com.cdkj.pipe.enums.ESystemCode;
import com.cdkj.pipe.exception.BizException;

@Service
public class DemandAOImpl implements IDemandAO {

    @Autowired
    private IDemandBO demandBO;

    @Autowired
    private IDealerBO dealerBO;

    @Autowired
    private IDemandOrderBO demandOrderBO;

    @Autowired
    private ISYSConfigBO sysConfigBO;

    @Autowired
    private IAssignBO assignBO;

    @Autowired
    private IHearBO hearBO;

    @Autowired
    private ISmsOutBO smsOutBO;

    @Override
    public String addDemand(XN619020Req req) {
        Demand data = ReqConverter.converter(req);
        Dealer dealer = dealerBO.getDealer(req.getDealerCode());
        if (!EDealerStatus.PUT_ON.getCode().equals(dealer.getStatus())) {
            throw new BizException("xn0000", "很抱歉，您还未上架或已被下架，请联系平台管理人员！");
        }
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
                && !EDemandStatus.PUT_OFF.getCode().equals(demand.getStatus())
                && !EDemandStatus.CANCEL.getCode().equals(demand.getStatus())) {
            throw new BizException("xn0000", "只有未发布、已下架、已取消的需求可以发布上架");
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
        // 取得系统参数
        Long limit = 1L;
        try {
            limit = StringValidater.toLong(sysConfigBO.getConfig(
                SysConstants.LIMIT).getCvalue());
        } catch (Exception e) {

        }
        if (demandOrderBO.getTakeCountToday(userId) >= limit) {
            throw new BizException("xn0000", "今日接单次数已达上限");
        }
        // 修改需求状态
        demandBO.take(code, userId);
        // 形成需求订单
        demandOrderBO.saveDemandOrder(EDemandOrderType.RECEIVE.getCode(), code,
            demand.getDealerCode(), userId, "订单进行中");
        // 短信通知经销商
        Dealer dealer = dealerBO.getDealer(demand.getDealerCode());
        smsOutBO.sendSmsOut(dealer.getMobile(), "您最新发布的需求已经被接单，请及时登录后台查看详情！",
            ESystemCode.QNSDGZS.getCode());
    }

    @Override
    @Transactional
    public void assgin(String code, String updater, String userId) {
        Demand demand = demandBO.getDemand(code);
        // 未上架 已上架 已下架 已取消 的需求可以进行派单
        if (!EDemandStatus.NEW.getCode().equals(demand.getStatus())
                && !EDemandStatus.PUT_ON.getCode().equals(demand.getStatus())
                && !EDemandStatus.PUT_OFF.getCode().equals(demand.getStatus())
                && !EDemandStatus.CANCEL.getCode().equals(demand.getStatus())) {
            throw new BizException("xn0000", "需求状态不允许派单操作");
        }
        Hear hear = hearBO.getHear(userId);
        if (!EHearStatus.ING.getCode().equals(hear.getStatus())) {
            throw new BizException("xn0000", "水电工已经不处于听单状态");
        }
        // 修改需求状态
        demandBO.assign(code, updater);
        // 形成派单记录
        assignBO.saveAssign(demand, userId);
        // 修改水电工听单状态
        hearBO.assign(userId);
        // 短信通知水电工（上线前停用）
        smsOutBO.sentContent(userId, "亲，您有一个新订单了，请登录微信端及时处理！");
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

    @Override
    public Paginable<Demand> queryRangeDemandPage(int start, int limit,
            Demand condition) {
        condition.setDistance(StringValidater.toDouble(sysConfigBO
            .getConfigValue("distance")));
        return demandBO.queryRangeDemandPage(start, limit, condition);
    }

}
