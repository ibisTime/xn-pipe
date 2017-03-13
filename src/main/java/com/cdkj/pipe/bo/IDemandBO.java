package com.cdkj.pipe.bo;

import java.util.List;

import com.cdkj.pipe.bo.base.IPaginableBO;
import com.cdkj.pipe.bo.base.Paginable;
import com.cdkj.pipe.domain.Demand;

public interface IDemandBO extends IPaginableBO<Demand> {

    public boolean isDemandExist(String code);

    public String saveDemand(Demand data);

    public int removeDemand(String code);

    public int refreshDemand(Demand data);

    public int putOn(String code, String updater, String remark);

    public int putOff(String code, String updater, String remark);

    public int take(String code, String userId);

    public void cancel(String code, String userId);

    public void complete(String code, String userId);

    public List<Demand> queryDemandList(Demand condition);

    public Demand getDemand(String code);

    public Paginable<Demand> queryRangeDemandPage(int start, int limit,
            Demand condition);

}
