package com.cdkj.pipe.dao;

import com.cdkj.pipe.dao.base.IBaseDAO;
import com.cdkj.pipe.domain.Dealer;

public interface IDealerDAO extends IBaseDAO<Dealer> {
    String NAMESPACE = IDealerDAO.class.getName().concat(".");

    public int platEdit(Dealer data);

    public int selfEdit(Dealer data);

    public int update_putOnOff(Dealer data);
}
