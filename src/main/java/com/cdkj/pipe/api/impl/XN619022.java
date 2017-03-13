/**
 * @Title XN619022.java 
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
import com.cdkj.pipe.dto.req.XN619022Req;
import com.cdkj.pipe.dto.res.BooleanRes;
import com.cdkj.pipe.exception.BizException;
import com.cdkj.pipe.exception.ParaException;
import com.cdkj.pipe.spring.SpringContextHolder;

/** 
 * 修改需求
 * @author: haiqingzheng 
 * @since: 2017年3月12日 上午11:21:20 
 * @history:
 */
public class XN619022 extends AProcessor {

    private IDemandAO demandAO = SpringContextHolder.getBean(IDemandAO.class);

    private XN619022Req req = null;

    /** 
     * @see com.cdkj.pipe.api.IProcessor#doBusiness()
     */
    @Override
    public Object doBusiness() throws BizException {
        demandAO.editDemand(req);
        return new BooleanRes(true);
    }

    /** 
     * @see com.cdkj.pipe.api.IProcessor#doCheck(java.lang.String)
     */
    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN619022Req.class);
        StringValidater.validateBlank(req.getCode(), req.getDealerCode(),
            req.getStartDatetime(), req.getEndDatetime(), req.getProvince(),
            req.getCity(), req.getArea(), req.getAddress(), req.getLongitude(),
            req.getLatitude(), req.getPrice(), req.getSummary(),
            req.getDetail(), req.getUpdater());
    }

}
