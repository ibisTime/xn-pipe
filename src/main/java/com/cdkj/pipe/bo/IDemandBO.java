package com.cdkj.pipe.bo;

import java.util.List;

import com.cdkj.pipe.bo.base.IPaginableBO;
import com.cdkj.pipe.domain.Demand;



public interface IDemandBO extends IPaginableBO<Demand> {


	public boolean isDemandExist(String code);


	public String saveDemand(Demand data);


	public int removeDemand(String code);


	public int refreshDemand(Demand data);


	public List<Demand> queryDemandList(Demand condition);


	public Demand getDemand(String code);


}