/**
 * @Title XN619020.java 
 * @Package com.cdkj.pipe.api.impl 
 * @Description 
 * @author leo(haiqing)  
 * @date 2017年3月12日 上午11:21:20 
 * @version V1.0   
 */
package com.cdkj.pipe.api.impl;

import com.cdkj.pipe.ao.IDemandAO;
import com.cdkj.pipe.api.AProcessor;
import com.cdkj.pipe.common.JsonUtil;
import com.cdkj.pipe.core.StringValidater;
import com.cdkj.pipe.dto.req.XN619020Req;
import com.cdkj.pipe.dto.res.PKCodeRes;
import com.cdkj.pipe.exception.BizException;
import com.cdkj.pipe.exception.ParaException;
import com.cdkj.pipe.spring.SpringContextHolder;

/** 
 * 新增需求
 * @author: haiqingzheng 
 * @since: 2017年3月12日 上午11:21:20 
 * @history:
 */
public class XN619020 extends AProcessor {

    private IDemandAO demandAO = SpringContextHolder.getBean(IDemandAO.class);

    private XN619020Req req = null;

    /** 
     * @see com.cdkj.pipe.api.IProcessor#doBusiness()
     */
    @Override
    public Object doBusiness() throws BizException {
        return new PKCodeRes(demandAO.addDemand(req));
    }

    /** 
     * @see com.cdkj.pipe.api.IProcessor#doCheck(java.lang.String)
     */
    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN619020Req.class);
        StringValidater.validateBlank(req.getDealerCode(),
            req.getStartDatetime(), req.getEndDatetime(), req.getProvince(),
            req.getCity(), req.getArea(), req.getAddress(), req.getLongitude(),
            req.getLatitude(), req.getPrice(), req.getSummary(),
            req.getDetail(), req.getUpdater());
    }

}
