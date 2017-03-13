package com.cdkj.pipe.ao;

import java.util.List;

import com.cdkj.pipe.bo.base.Paginable;
import com.cdkj.pipe.domain.Demand;
import com.cdkj.pipe.dto.req.XN619020Req;
import com.cdkj.pipe.dto.req.XN619022Req;

public interface IDemandAO {
    static final String DEFAULT_ORDER_COLUMN = "code";

    public String addDemand(XN619020Req req);

    public int dropDemand(String code);

    public int editDemand(XN619022Req req);

    public int putOn(String code, String updater, String remark);

    public int putOff(String code, String updater, String remark);

    /**
     * 水电工直接接活
     * @param code
     * @param userId 
     * @create: 2017年3月13日 上午12:48:27 haiqingzheng
     * @history:
     */
    public void takeDirectly(String code, String userId);

    public Paginable<Demand> queryDemandPage(int start, int limit,
            Demand condition);

    public List<Demand> queryDemandList(Demand condition);

    public Demand getDemand(String code);

    /**
     * 分页查询一定范围内已发布的需求
     * @param start
     * @param limit
     * @param condition
     * @return 
     * @create: 2017年3月13日 下午1:11:43 haiqingzheng
     * @history:
     */
    public Paginable<Demand> queryRangeDemandPage(int start, int limit,
            Demand condition);

}
