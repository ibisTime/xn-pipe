/**
 * @Title XN619027.java 
 * @Package com.cdkj.pipe.api.impl 
 * @Description 
 * @author leo(haiqing)  
 * @date 2017年3月12日 上午11:55:01 
 * @version V1.0   
 */
package com.cdkj.pipe.api.impl;

import com.cdkj.pipe.ao.IAssignAO;
import com.cdkj.pipe.api.AProcessor;
import com.cdkj.pipe.common.JsonUtil;
import com.cdkj.pipe.core.StringValidater;
import com.cdkj.pipe.dto.req.XN619027Req;
import com.cdkj.pipe.dto.res.BooleanRes;
import com.cdkj.pipe.exception.BizException;
import com.cdkj.pipe.exception.ParaException;
import com.cdkj.pipe.spring.SpringContextHolder;

/** 
 * 水电工拒绝派单
 * @author: haiqingzheng 
 * @since: 2017年3月12日 上午11:55:01 
 * @history:
 */
public class XN619027 extends AProcessor {

    private IAssignAO assignAO = SpringContextHolder.getBean(IAssignAO.class);

    private XN619027Req req = null;

    /** 
     * @see com.cdkj.pipe.api.IProcessor#doBusiness()
     */
    @Override
    public Object doBusiness() throws BizException {
        assignAO.reject(req.getUserId());
        return new BooleanRes(true);
    }

    /** 
     * @see com.cdkj.pipe.api.IProcessor#doCheck(java.lang.String)
     */
    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN619027Req.class);
        StringValidater.validateBlank(req.getUserId());
    }

}
