/**
 * @Title XN619033.java 
 * @Package com.cdkj.pipe.api.impl 
 * @Description 
 * @author leo(haiqing)  
 * @date 2017年3月12日 下午12:55:11 
 * @version V1.0   
 */
package com.cdkj.pipe.api.impl;

import java.util.ArrayList;
import java.util.List;

import com.cdkj.pipe.ao.IDemandAO;
import com.cdkj.pipe.api.AProcessor;
import com.cdkj.pipe.common.JsonUtil;
import com.cdkj.pipe.core.StringValidater;
import com.cdkj.pipe.domain.Demand;
import com.cdkj.pipe.dto.req.XN619033Req;
import com.cdkj.pipe.enums.EDemandStatus;
import com.cdkj.pipe.exception.BizException;
import com.cdkj.pipe.exception.ParaException;
import com.cdkj.pipe.spring.SpringContextHolder;

/** 
 * 分页查询附近需求
 * @author: haiqingzheng 
 * @since: 2017年3月12日 下午12:55:11 
 * @history:
 */
public class XN619033 extends AProcessor {

    private IDemandAO demandAO = SpringContextHolder.getBean(IDemandAO.class);

    private XN619033Req req = null;

    /** 
     * @see com.cdkj.pipe.api.IProcessor#doBusiness()
     */
    @Override
    public Object doBusiness() throws BizException {
        Demand condition = new Demand();
        List<String> statusList = new ArrayList<String>();
        statusList.add(EDemandStatus.PUT_ON.getCode());
        statusList.add(EDemandStatus.FINISH.getCode());
        condition.setStatusList(statusList);
        condition.setOrder("status", "asc");
        condition.setLongitude(req.getLongitude());
        condition.setLatitude(req.getLatitude());
        condition.setType(req.getType());
        int start = StringValidater.toInteger(req.getStart());
        int limit = StringValidater.toInteger(req.getLimit());
        return demandAO.queryRangeDemandPage(start, limit, condition);
    }

    /** 
     * @see com.cdkj.pipe.api.IProcessor#doCheck(java.lang.String)
     */
    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN619033Req.class);
        StringValidater.validateBlank(req.getStart(), req.getLimit(),
            req.getLongitude(), req.getLatitude());
    }

}
