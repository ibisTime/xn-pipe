package com.cdkj.pipe.ao;

import java.util.List;

import com.cdkj.pipe.bo.base.Paginable;
import com.cdkj.pipe.domain.Demand;



public interface IDemandAO {
	static final String DEFAULT_ORDER_COLUMN = "code";


	public String addDemand(Demand data);

	public int dropDemand(String code);

	public int editDemand(Demand data);

	public Paginable<Demand> queryDemandPage(int start, int limit, Demand condition);

	public List<Demand> queryDemandList(Demand condition);

	public Demand getDemand(String code);

}