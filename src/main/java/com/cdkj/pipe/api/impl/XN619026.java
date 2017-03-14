/**
 * @Title XN619026.java 
 * @Package com.cdkj.pipe.api.impl 
 * @Description 
 * @author leo(haiqing)  
 * @date 2017年3月12日 上午11:48:51 
 * @version V1.0   
 */
package com.cdkj.pipe.api.impl;

import com.cdkj.pipe.ao.IAssignAO;
import com.cdkj.pipe.api.AProcessor;
import com.cdkj.pipe.common.JsonUtil;
import com.cdkj.pipe.core.StringValidater;
import com.cdkj.pipe.dto.req.XN619026Req;
import com.cdkj.pipe.dto.res.BooleanRes;
import com.cdkj.pipe.exception.BizException;
import com.cdkj.pipe.exception.ParaException;
import com.cdkj.pipe.spring.SpringContextHolder;

/** 
 * 水电工接受派单
 * @author: haiqingzheng 
 * @since: 2017年3月12日 上午11:48:51 
 * @history:
 */
public class XN619026 extends AProcessor {

    private IAssignAO assignAO = SpringContextHolder.getBean(IAssignAO.class);

    private XN619026Req req = null;

    /** 
     * @see com.cdkj.pipe.api.IProcessor#doBusiness()
     */
    @Override
    public Object doBusiness() throws BizException {
        assignAO.reveive(req.getUserId());
        return new BooleanRes(true);
    }

    /** 
     * @see com.cdkj.pipe.api.IProcessor#doCheck(java.lang.String)
     */
    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN619026Req.class);
        StringValidater.validateBlank(req.getUserId());
    }

}
