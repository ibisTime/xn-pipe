/**
 * @Title XN619032.java 
 * @Package com.cdkj.pipe.api.impl 
 * @Description 
 * @author leo(haiqing)  
 * @date 2017年3月12日 下午12:04:39 
 * @version V1.0   
 */
package com.cdkj.pipe.api.impl;

import com.cdkj.pipe.ao.IDemandAO;
import com.cdkj.pipe.api.AProcessor;
import com.cdkj.pipe.common.JsonUtil;
import com.cdkj.pipe.core.StringValidater;
import com.cdkj.pipe.dto.req.XNCodeReq;
import com.cdkj.pipe.exception.BizException;
import com.cdkj.pipe.exception.ParaException;
import com.cdkj.pipe.spring.SpringContextHolder;

/** 
 * 详情查询需求
 * @author: haiqingzheng 
 * @since: 2017年3月12日 下午12:04:39 
 * @history:
 */
public class XN619032 extends AProcessor {

    private IDemandAO demandAO = SpringContextHolder.getBean(IDemandAO.class);

    private XNCodeReq req = null;

    /** 
     * @see com.cdkj.pipe.api.IProcessor#doBusiness()
     */
    @Override
    public Object doBusiness() throws BizException {
        return demandAO.getDemand(req.getCode());
    }

    /** 
     * @see com.cdkj.pipe.api.IProcessor#doCheck(java.lang.String)
     */
    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XNCodeReq.class);
        StringValidater.validateBlank(req.getCode());
    }

}
