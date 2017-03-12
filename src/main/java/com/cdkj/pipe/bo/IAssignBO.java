package com.cdkj.pipe.bo;

import java.util.List;

import com.cdkj.pipe.bo.base.IPaginableBO;
import com.cdkj.pipe.domain.Assign;



public interface IAssignBO extends IPaginableBO<Assign> {


	public boolean isAssignExist(String code);


	public String saveAssign(Assign data);


	public int removeAssign(String code);


	public int refreshAssign(Assign data);


	public List<Assign> queryAssignList(Assign condition);


	public Assign getAssign(String code);


}