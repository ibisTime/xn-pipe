package com.cdkj.pipe.ao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdkj.pipe.ao.IDemandAO;
import com.cdkj.pipe.bo.IDemandBO;
import com.cdkj.pipe.bo.base.Paginable;
import com.cdkj.pipe.domain.Demand;
import com.cdkj.pipe.exception.BizException;




@Service
public class DemandAOImpl implements IDemandAO {

	@Autowired
	private IDemandBO demandBO;

	@Override
	public String addDemand(Demand data) {
		return demandBO.saveDemand(data);
	}

	@Override
	public int editDemand(Demand data) {
		if (!demandBO.isDemandExist(data.getCode())) {
			throw new BizException("xn0000", "记录编号不存在");
		}
		return demandBO.refreshDemand(data);
	}

	@Override
	public int dropDemand(String code) {
		if (!demandBO.isDemandExist(code)) {
			throw new BizException("xn0000", "记录编号不存在");
		}
		return demandBO.removeDemand(code);
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