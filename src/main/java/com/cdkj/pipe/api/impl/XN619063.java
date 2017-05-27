/**
 * @Title XN619063.java 
 * @Package com.cdkj.pipe.api.impl 
 * @Description 
 * @author leo(haiqing)  
 * @date 2017年5月27日 下午5:21:13 
 * @version V1.0   
 */
package com.cdkj.pipe.api.impl;

import com.cdkj.pipe.ao.IDemandOrderAO;
import com.cdkj.pipe.api.AProcessor;
import com.cdkj.pipe.common.JsonUtil;
import com.cdkj.pipe.core.StringValidater;
import com.cdkj.pipe.dto.req.XN619063Req;
import com.cdkj.pipe.dto.res.BooleanRes;
import com.cdkj.pipe.exception.BizException;
import com.cdkj.pipe.exception.ParaException;
import com.cdkj.pipe.spring.SpringContextHolder;

/** 
 * 水电工上传施工图图片
 * @author: haiqingzheng 
 * @since: 2017年5月27日 下午5:21:13 
 * @history:
 */
public class XN619063 extends AProcessor {

    private IDemandOrderAO demandOrderAO = SpringContextHolder
        .getBean(IDemandOrderAO.class);

    private XN619063Req req = null;

    /** 
     * @see com.cdkj.pipe.api.IProcessor#doBusiness()
     */
    @Override
    public Object doBusiness() throws BizException {
        demandOrderAO.uploadPic(req.getCode(), req.getPic());
        return new BooleanRes(true);
    }

    /** 
     * @see com.cdkj.pipe.api.IProcessor#doCheck(java.lang.String)
     */
    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN619063Req.class);
        StringValidater.validateBlank(req.getCode(), req.getPic());
    }

}
