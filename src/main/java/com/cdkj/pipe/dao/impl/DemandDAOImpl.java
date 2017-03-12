package com.cdkj.pipe.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cdkj.pipe.dao.IDemandDAO;
import com.cdkj.pipe.dao.base.support.AMybatisTemplate;
import com.cdkj.pipe.domain.Demand;



@Repository("demandDAOImpl")
public class DemandDAOImpl extends AMybatisTemplate implements IDemandDAO {


	@Override
	public int insert(Demand data) {
		return super.insert(NAMESPACE.concat("insert_demand"), data);
	}


	@Override
	public int delete(Demand data) {
		return super.delete(NAMESPACE.concat("delete_demand"), data);
	}


	@Override
	public Demand select(Demand condition) {
		return super.select(NAMESPACE.concat("select_demand"), condition,Demand.class);
	}


	@Override
	public Long selectTotalCount(Demand condition) {
		return super.selectTotalCount(NAMESPACE.concat("select_demand_count"),condition);
	}


	@Override
	public List<Demand> selectList(Demand condition) {
		return super.selectList(NAMESPACE.concat("select_demand"), condition,Demand.class);
	}


	@Override
	public List<Demand> selectList(Demand condition, int start, int count) {
		return super.selectList(NAMESPACE.concat("select_demand"), start, count,condition, Demand.class);
	}


}