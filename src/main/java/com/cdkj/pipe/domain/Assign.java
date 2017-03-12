package com.cdkj.pipe.domain;

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
	private String id;

	// 水电工编号
	private String userId;

	// 需求编号
	private String demandCode;

	// 经销商编号
	private String dealerCode;

	// 指派时间
	private String createDatetime;

	// 状态
	private String status;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserId() {
		return userId;
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

	public void setCreateDatetime(String createDatetime) {
		this.createDatetime = createDatetime;
	}

	public String getCreateDatetime() {
		return createDatetime;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

}