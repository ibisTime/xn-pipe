package com.cdkj.pipe.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cdkj.pipe.dao.IDealerDAO;
import com.cdkj.pipe.dao.base.support.AMybatisTemplate;
import com.cdkj.pipe.domain.Dealer;



@Repository("dealerDAOImpl")
public class DealerDAOImpl extends AMybatisTemplate implements IDealerDAO {


	@Override
	public int insert(Dealer data) {
		return super.insert(NAMESPACE.concat("insert_dealer"), data);
	}


	@Override
	public int delete(Dealer data) {
		return super.delete(NAMESPACE.concat("delete_dealer"), data);
	}


	@Override
	public Dealer select(Dealer condition) {
		return super.select(NAMESPACE.concat("select_dealer"), condition,Dealer.class);
	}


	@Override
	public Long selectTotalCount(Dealer condition) {
		return super.selectTotalCount(NAMESPACE.concat("select_dealer_count"),condition);
	}


	@Override
	public List<Dealer> selectList(Dealer condition) {
		return super.selectList(NAMESPACE.concat("select_dealer"), condition,Dealer.class);
	}


	@Override
	public List<Dealer> selectList(Dealer condition, int start, int count) {
		return super.selectList(NAMESPACE.concat("select_dealer"), start, count,condition, Dealer.class);
	}


}