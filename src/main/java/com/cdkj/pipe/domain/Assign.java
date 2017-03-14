package com.cdkj.pipe.domain;

import java.util.Date;

import com.cdkj.pipe.dao.base.ABaseDO;

/**
* 派单
* @author: haiqingzheng
* @since: 2017年03月12日 14:15:20
* @history:
*/
public class Assign extends ABaseDO {

    private static final long serialVersionUID = 1L;

    // ID主键
    private Long id;

    // 水电工编号
    private String userId;

    // 需求编号
    private String demandCode;

    // 经销商编号
    private String dealerCode;

    // 指派时间
    private Date createDatetime;

    // 状态
    private String status;

    private Demand demand;

    private Dealer dealer;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDemandCode() {
        return demandCode;
    }

    public void setDemandCode(String demandCode) {
        this.demandCode = demandCode;
    }

    public String getDealerCode() {
        return dealerCode;
    }

    public void setDealerCode(String dealerCode) {
        this.dealerCode = dealerCode;
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
