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

    /** 
     * @see com.cdkj.pipe.api.IProcessor#doBusiness()
     */
    @Override
    public Object doBusiness() throws BizException {
        return hearAO.queryNearbyUser("", "");
    }

    /** 
     * @see com.cdkj.pipe.api.IProcessor#doCheck(java.lang.String)
     */
    @Override
    public void doCheck(String inputparams) throws ParaException {
        // TODO Auto-generated method stub

    }

}
