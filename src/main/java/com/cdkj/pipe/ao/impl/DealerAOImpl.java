package com.cdkj.pipe.ao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdkj.pipe.ao.IDealerAO;
import com.cdkj.pipe.bo.IDealerBO;
import com.cdkj.pipe.bo.base.Paginable;
import com.cdkj.pipe.domain.Dealer;
import com.cdkj.pipe.exception.BizException;




@Service
public class DealerAOImpl implements IDealerAO {

	@Autowired
	private IDealerBO dealerBO;

	@Override
	public String addDealer(Dealer data) {
		return dealerBO.saveDealer(data);
	}

	@Override
	public int editDealer(Dealer data) {
		if (!dealerBO.isDealerExist(data.getCode())) {
			throw new BizException("xn0000", "记录编号不存在");
		}
		return dealerBO.refreshDealer(data);
	}

	@Override
	public int dropDealer(String code) {
		if (!dealerBO.isDealerExist(code)) {
			throw new BizException("xn0000", "记录编号不存在");
		}
		return dealerBO.removeDealer(code);
	}

	@Override
	public Paginable<Dealer> queryDealerPage(int start, int limit,
			Dealer condition) {
		return dealerBO.getPaginable(start, limit, condition);
	}

	@Override
	public List<Dealer> queryDealerList(Dealer condition) {
		return dealerBO.queryDealerList(condition);
	}

	@Override
	public Dealer getDealer(String code) {
		return dealerBO.getDealer(code);
	}
}