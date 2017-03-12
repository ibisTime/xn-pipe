package com.cdkj.pipe.domain;

import com.cdkj.pipe.dao.base.ABaseDO;

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
	private String receiveDatetime;

	// 接单人
	private String receiver;

	// 状态
	private String status;

	// 更新人
	private String updater;

	// 更新时间
	private String updateDatetime;

	// 备注
	private String remark;

	// 赠送积分
	private String giveIntegral;

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

	public void setReceiveDatetime(String receiveDatetime) {
		this.receiveDatetime = receiveDatetime;
	}

	public String getReceiveDatetime() {
		return receiveDatetime;
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

	public void setUpdateDatetime(String updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	public String getUpdateDatetime() {
		return updateDatetime;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return remark;
	}

	public void setGiveIntegral(String giveIntegral) {
		this.giveIntegral = giveIntegral;
	}

	public String getGiveIntegral() {
		return giveIntegral;
	}

}