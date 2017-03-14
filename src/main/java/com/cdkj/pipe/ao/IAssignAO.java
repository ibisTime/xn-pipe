package com.cdkj.pipe.ao;

import java.util.List;

import com.cdkj.pipe.bo.base.Paginable;
import com.cdkj.pipe.domain.Assign;

public interface IAssignAO {
    static final String DEFAULT_ORDER_COLUMN = "code";

    public String addAssign(Assign data);

    public int dropAssign(String code);

    public int editAssign(Assign data);

    public Paginable<Assign> queryAssignPage(int start, int limit,
            Assign condition);

    public List<Assign> queryAssignList(Assign condition);

    public Assign getAssign(String code);

    public Assign getCurrentAssign(String userId);

}
