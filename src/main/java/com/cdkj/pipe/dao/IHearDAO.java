package com.cdkj.pipe.dao;

import com.cdkj.pipe.dao.base.IBaseDAO;
import com.cdkj.pipe.domain.Hear;

public interface IHearDAO extends IBaseDAO<Hear> {
    String NAMESPACE = IHearDAO.class.getName().concat(".");

    public int updateStartHear(Hear data);

    public int updateStopHear(Hear data);
}
