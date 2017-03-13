/**
 * @Title XN619060.java 
 * @Package com.cdkj.pipe.api.impl 
 * @Description 
 * @author leo(haiqing)  
 * @date 2017年3月12日 下午2:26:59 
 * @version V1.0   
 */
package com.cdkj.pipe.api.impl;

import com.cdkj.pipe.ao.IDemandOrderAO;
import com.cdkj.pipe.api.AProcessor;
import com.cdkj.pipe.common.JsonUtil;
import com.cdkj.pipe.core.StringValidater;
import com.cdkj.pipe.dto.req.XNCodeReq;
import com.cdkj.pipe.exception.BizException;
import com.cdkj.pipe.exception.ParaException;
import com.cdkj.pipe.spring.SpringContextHolder;

/** 
 * 订单分页查询
 * @author: haiqingzheng 
 * @since: 2017年3月12日 下午2:26:59 
 * @history:
 */
public class XN619072 extends AProcessor {

    private IDemandOrderAO demandOrderAO = SpringContextHolder
        .getBean(IDemandOrderAO.class);

    private XNCodeReq req = null;

    /** 
     * @see com.cdkj.pipe.api.IProcessor#doBusiness()
     */
    @Override
    public Object doBusiness() throws BizException {
        return demandOrderAO.getDemandOrder(req.getCode());
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
