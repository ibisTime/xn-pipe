/**
 * @Title XN619000.java 
 * @Package com.cdkj.pipe.api.impl 
 * @Description 
 * @author leo(haiqing)  
 * @date 2017年3月12日 上午10:41:15 
 * @version V1.0   
 */
package com.cdkj.pipe.api.impl;

import com.cdkj.pipe.ao.IDealerAO;
import com.cdkj.pipe.api.AProcessor;
import com.cdkj.pipe.common.JsonUtil;
import com.cdkj.pipe.core.StringValidater;
import com.cdkj.pipe.dto.req.XN619000Req;
import com.cdkj.pipe.exception.BizException;
import com.cdkj.pipe.exception.ParaException;
import com.cdkj.pipe.spring.SpringContextHolder;

/** 
 * 新增经销商
 * @author: haiqingzheng 
 * @since: 2017年3月12日 上午10:41:15 
 * @history:
 */
public class XN619000 extends AProcessor {

    private IDealerAO dealerAO = SpringContextHolder.getBean(IDealerAO.class);

    private XN619000Req req = null;

    @Override
    public Object doBusiness() throws BizException {
        return dealerAO.addDealer(req);
    }

    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN619000Req.class);
        StringValidater.validateBlank(req.getLoginName(), req.getName(),
            req.getProvince(), req.getCity(), req.getArea(), req.getAddress(),
            req.getLongitude(), req.getLatitude(), req.getOwner(),
            req.getContact(), req.getMobile(), req.getPic(), req.getDetail(),
            req.getUpdater());
    }

}
