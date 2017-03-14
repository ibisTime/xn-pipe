/**
 * @Title XN619040.java 
 * @Package com.cdkj.tour.api.impl 
 * @Description 
 * @author leo(haiqing)  
 * @date 2017年3月12日 下午1:03:55 
 * @version V1.0   
 */
package com.cdkj.pipe.api.impl;

import com.cdkj.pipe.ao.IHearAO;
import com.cdkj.pipe.api.AProcessor;
import com.cdkj.pipe.common.JsonUtil;
import com.cdkj.pipe.core.StringValidater;
import com.cdkj.pipe.dto.req.XN619040Req;
import com.cdkj.pipe.dto.res.BooleanRes;
import com.cdkj.pipe.exception.BizException;
import com.cdkj.pipe.exception.ParaException;
import com.cdkj.pipe.spring.SpringContextHolder;

/** 
 * 开始听单
 * @author: haiqingzheng 
 * @since: 2017年3月12日 下午1:03:55 
 * @history:
 */
public class XN619040 extends AProcessor {

    private IHearAO hearAO = SpringContextHolder.getBean(IHearAO.class);

    private XN619040Req req = null;

    /** 
     * @see com.cdkj.tour.api.IProcessor#doBusiness()
     */
    @Override
    public Object doBusiness() throws BizException {
        hearAO.startHear(req.getUserId(), req.getContent());
        return new BooleanRes(true);
    }

    /** 
     * @see com.cdkj.tour.api.IProcessor#doCheck(java.lang.String)
     */
    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN619040Req.class);
        StringValidater.validateBlank(req.getUserId(), req.getContent());
    }

}
