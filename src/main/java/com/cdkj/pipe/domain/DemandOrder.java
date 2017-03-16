package com.cdkj.pipe.domain;

import java.util.Date;
import java.util.List;

import com.cdkj.pipe.dao.base.ABaseDO;
import com.cdkj.pipe.dto.res.XN805901Res;

/**
* 需求订单
* @author: haiqingzheng
* @since: 2017年03月12日 14:19:50
* @history:
*/
public class DemandOrder extends ABaseDO {

    private static final long serialVersionUID = 1L;

    // 订单编号
    private String code;

    // 订单类型
    private String type;

    // 需求编号
    private String demandCode;

    // 经销商编号
    private String dealerCode;

    // 接单时间
    private Date receiveDatetime;

    // 接单人
    private String receiver;

    // 状态
    private String status;

    // 更新人
    private String updater;

    // 更新时间
    private Date updateDatetime;

    // 备注
    private String remark;

    // 赠送积分
    private Long giveIntegral;

    /******查询条件*******/
    // 状态list
    private List<String> statusList;

    private Demand demand;

    private Dealer dealer;

    private XN805901Res user;

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setDemandCode(String demandCode) {
        this.demandCode = demandCode;
    }

    public String getDemandCode() {
        return demandCode;
    }

    public void setDealerCode(String dealerCode) {
        this.dealerCode = dealerCode;
    }

    public String getDealerCode() {
        return dealerCode;
    }

    public Date getReceiveDatetime() {
        return receiveDatetime;
    }

    public void setReceiveDatetime(Date receiveDatetime) {
        this.receiveDatetime = receiveDatetime;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public String getUpdater() {
        return updater;
    }

    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return remark;
    }

    public Long getGiveIntegral() {
        return giveIntegral;
    }

    public void setGiveIntegral(Long giveIntegral) {
        this.giveIntegral = giveIntegral;
    }

    public List<String> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<String> statusList) {
        this.statusList = statusList;
    }

    public Demand getDemand() {
        return demand;
    }

    public void setDemand(Demand demand) {
        this.demand = demand;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public XN805901Res getUser() {
        return user;
    }

    public void setUser(XN805901Res user) {
        this.user = user;
    }

}
