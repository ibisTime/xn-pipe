/**
 * @Title XN619003.java 
 * @Package com.cdkj.pipe.api.impl 
 * @Description 
 * @author leo(haiqing)  
 * @date 2017年3月12日 上午10:47:15 
 * @version V1.0   
 */
package com.cdkj.pipe.api.impl;

import com.cdkj.pipe.ao.IDealerAO;
import com.cdkj.pipe.api.AProcessor;
import com.cdkj.pipe.common.JsonUtil;
import com.cdkj.pipe.core.StringValidater;
import com.cdkj.pipe.dto.req.XN619002Req;
import com.cdkj.pipe.exception.BizException;
import com.cdkj.pipe.exception.ParaException;
import com.cdkj.pipe.spring.SpringContextHolder;

/** 
 * 经销商下架
 * @author: haiqingzheng 
 * @since: 2017年3月12日 上午10:47:15 
 * @history:
 */
public class XN619003 extends AProcessor {

    private IDealerAO dealerAO = SpringContextHolder.getBean(IDealerAO.class);

    private XN619002Req req = null;

    /** 
     * @see com.cdkj.pipe.api.IProcessor#doBusiness()
     */
    @Override
    public Object doBusiness() throws BizException {
        return dealerAO
            .putOff(req.getCode(), req.getUpdater(), req.getRemark());
    }

    /** 
     * @see com.cdkj.pipe.api.IProcessor#doCheck(java.lang.String)
     */
    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN619002Req.class);
        StringValidater.validateBlank(req.getCode(), req.getUpdater());
    }

}
