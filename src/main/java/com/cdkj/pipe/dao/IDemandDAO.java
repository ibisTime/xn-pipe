package com.cdkj.pipe.dao;

import com.cdkj.pipe.dao.base.IBaseDAO;
import com.cdkj.pipe.domain.Demand;

public interface IDemandDAO extends IBaseDAO<Demand> {
	String NAMESPACE = IDemandDAO.class.getName().concat(".");
}