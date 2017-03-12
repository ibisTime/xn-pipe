/**
 * @Title XN619001.java 
 * @Package com.cdkj.pipe.api.impl 
 * @Description 
 * @author leo(haiqing)  
 * @date 2017年3月12日 上午10:44:07 
 * @version V1.0   
 */
package com.cdkj.pipe.api.impl;

import com.cdkj.pipe.ao.IDealerAO;
import com.cdkj.pipe.api.AProcessor;
import com.cdkj.pipe.common.JsonUtil;
import com.cdkj.pipe.core.StringValidater;
import com.cdkj.pipe.dto.req.XN619001Req;
import com.cdkj.pipe.dto.res.BooleanRes;
import com.cdkj.pipe.exception.BizException;
import com.cdkj.pipe.exception.ParaException;
import com.cdkj.pipe.spring.SpringContextHolder;

/** 
 * 修改经销商信息
 * @author: haiqingzheng 
 * @since: 2017年3月12日 上午10:44:07 
 * @history:
 */
public class XN619001 extends AProcessor {

    private IDealerAO dealerAO = SpringContextHolder.getBean(IDealerAO.class);

    private XN619001Req req = null;

    /** 
     * @see com.cdkj.pipe.api.IProcessor#doBusiness()
     */
    @Override
    public Object doBusiness() throws BizException {
        dealerAO.platEditDealer(req);
        return new BooleanRes(true);
    }

    /** 
     * @see com.cdkj.pipe.api.IProcessor#doCheck(java.lang.String)
     */
    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN619001Req.class);
        StringValidater.validateBlank(req.getCode(), req.getName(),
            req.getProvince(), req.getCity(), req.getArea(), req.getAddress(),
            req.getLongitude(), req.getLatitude(), req.getOwner(),
            req.getContact(), req.getMobile(), req.getPic(), req.getDetail(),
            req.getUpdater());
    }

}
