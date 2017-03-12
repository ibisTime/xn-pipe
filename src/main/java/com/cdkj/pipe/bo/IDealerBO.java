package com.cdkj.pipe.bo;

import java.util.List;

import com.cdkj.pipe.bo.base.IPaginableBO;
import com.cdkj.pipe.domain.Dealer;



public interface IDealerBO extends IPaginableBO<Dealer> {


	public boolean isDealerExist(String code);


	public String saveDealer(Dealer data);


	public int removeDealer(String code);


	public int refreshDealer(Dealer data);


	public List<Dealer> queryDealerList(Dealer condition);


	public Dealer getDealer(String code);


}