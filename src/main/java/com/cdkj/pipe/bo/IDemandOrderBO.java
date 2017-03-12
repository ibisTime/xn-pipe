package com.cdkj.pipe.bo;

import java.util.List;

import com.cdkj.pipe.bo.base.IPaginableBO;
import com.cdkj.pipe.domain.DemandOrder;



public interface IDemandOrderBO extends IPaginableBO<DemandOrder> {


	public boolean isDemandOrderExist(String code);


	public String saveDemandOrder(DemandOrder data);


	public int removeDemandOrder(String code);


	public int refreshDemandOrder(DemandOrder data);


	public List<DemandOrder> queryDemandOrderList(DemandOrder condition);


	public DemandOrder getDemandOrder(String code);


}