/**
 * @Title XN619051.java 
 * @Package com.cdkj.pipe.api.impl 
 * @Description 
 * @author leo(haiqing)  
 * @date 2017年3月14日 上午11:49:06 
 * @version V1.0   
 */
package com.cdkj.pipe.api.impl;

import com.cdkj.pipe.ao.IHearAO;
import com.cdkj.pipe.api.AProcessor;
import com.cdkj.pipe.common.JsonUtil;
import com.cdkj.pipe.core.StringValidater;
import com.cdkj.pipe.domain.Hear;
import com.cdkj.pipe.dto.req.XN619051Req;
import com.cdkj.pipe.exception.BizException;
import com.cdkj.pipe.exception.ParaException;
import com.cdkj.pipe.spring.SpringContextHolder;

/** 
 * 附近正在找活的水电工分页查询
 * @author: haiqingzheng 
 * @since: 2017年3月14日 上午11:49:06 
 * @history:
 */
public class XN619051 extends AProcessor {

    private IHearAO hearAO = SpringContextHolder.getBean(IHearAO.class);

    private XN619051Req req = null;

    /** 
     * @see com.cdkj.pipe.api.IProcessor#doBusiness()
     */
    @Override
    public Object doBusiness() throws BizException {
        Hear condition = new Hear();
        condition.setStatus(req.getStatus());
        condition.setLatitude(req.getLatitude());
        condition.setLongitude(req.getLongitude());
        int start = StringValidater.toInteger(req.getStart());
        int limit = StringValidater.toInteger(req.getLimit());
        return hearAO.queryNearbyUser(start, limit, condition);
    }

    /** 
     * @see com.cdkj.pipe.api.IProcessor#doCheck(java.lang.String)
     */
    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN619051Req.class);
    }

}
