package com.cdkj.pipe.dao;

import com.cdkj.pipe.dao.base.IBaseDAO;
import com.cdkj.pipe.domain.Assign;

public interface IAssignDAO extends IBaseDAO<Assign> {
    String NAMESPACE = IAssignDAO.class.getName().concat(".");

    public int updateAssignReceive(Assign data);

    public int updateAssignReject(Assign data);
}
