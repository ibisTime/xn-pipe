package com.cdkj.pipe.bo;

import java.util.List;

import com.cdkj.pipe.bo.base.IPaginableBO;
import com.cdkj.pipe.domain.Assign;
import com.cdkj.pipe.domain.Demand;

public interface IAssignBO extends IPaginableBO<Assign> {

    public boolean isAssignExist(String code);

    public void saveAssign(Demand demand, String userId);

    public int removeAssign(String code);

    public int refreshAssign(Assign data);

    public List<Assign> queryAssignList(Assign condition);

    public Assign getAssign(String code);

    public Assign getCurrentAssign(String userId);

    public void assignReceive(Assign assign);

    public void assignReject(Assign assign);

}
