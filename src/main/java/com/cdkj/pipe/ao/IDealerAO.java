package com.cdkj.pipe.ao;

import java.util.List;

import com.cdkj.pipe.bo.base.Paginable;
import com.cdkj.pipe.domain.Dealer;



public interface IDealerAO {
	static final String DEFAULT_ORDER_COLUMN = "code";


	public String addDealer(Dealer data);

	public int dropDealer(String code);

	public int editDealer(Dealer data);

	public Paginable<Dealer> queryDealerPage(int start, int limit, Dealer condition);

	public List<Dealer> queryDealerList(Dealer condition);

	public Dealer getDealer(String code);

}