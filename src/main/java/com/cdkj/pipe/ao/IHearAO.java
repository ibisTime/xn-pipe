package com.cdkj.pipe.ao;

import java.util.List;

import com.cdkj.pipe.bo.base.Paginable;
import com.cdkj.pipe.domain.Hear;



public interface IHearAO {
	static final String DEFAULT_ORDER_COLUMN = "code";


	public String addHear(Hear data);

	public int dropHear(String code);

	public int editHear(Hear data);

	public Paginable<Hear> queryHearPage(int start, int limit, Hear condition);

	public List<Hear> queryHearList(Hear condition);

	public Hear getHear(String code);

}