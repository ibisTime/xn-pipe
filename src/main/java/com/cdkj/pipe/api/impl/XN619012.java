/**
 * @Title XN619012.java 
 * @Package com.cdkj.pipe.api.impl 
 * @Description 
 * @author leo(haiqing)  
 * @date 2017年3月12日 上午10:54:34 
 * @version V1.0   
 */
package com.cdkj.pipe.api.impl;

import com.cdkj.pipe.ao.IDealerAO;
import com.cdkj.pipe.api.AProcessor;
import com.cdkj.pipe.common.JsonUtil;
import com.cdkj.pipe.core.StringValidater;
import com.cdkj.pipe.dto.req.XNCodeReq;
import com.cdkj.pipe.exception.BizException;
import com.cdkj.pipe.exception.ParaException;
import com.cdkj.pipe.spring.SpringContextHolder;

/** 
 * 详情查询经销商
 * @author: haiqingzheng 
 * @since: 2017年3月12日 上午10:54:34 
 * @history:
 */
public class XN619012 extends AProcessor {
    private IDealerAO dealerAO = SpringContextHolder.getBean(IDealerAO.class);

    private XNCodeReq req = null;

    /** 
     * @see com.cdkj.pipe.api.IProcessor#doBusiness()
     */
    @Override
    public Object doBusiness() throws BizException {
        return dealerAO.getDealer(req.getCode());
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
