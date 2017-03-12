package com.cdkj.pipe.dao;

import com.cdkj.pipe.dao.base.IBaseDAO;
import com.cdkj.pipe.domain.DemandOrder;

public interface IDemandOrderDAO extends IBaseDAO<DemandOrder> {
	String NAMESPACE = IDemandOrderDAO.class.getName().concat(".");
}