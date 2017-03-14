/**
 * @Title XN619050.java 
 * @Package com.cdkj.pipe.api.impl 
 * @Description 
 * @author leo(haiqing)  
 * @date 2017年3月13日 下午8:11:58 
 * @version V1.0   
 */
package com.cdkj.pipe.api.impl;

import com.cdkj.pipe.ao.IAssignAO;
import com.cdkj.pipe.ao.IHearAO;
import com.cdkj.pipe.api.AProcessor;
import com.cdkj.pipe.common.JsonUtil;
import com.cdkj.pipe.core.StringValidater;
import com.cdkj.pipe.domain.Hear;
import com.cdkj.pipe.dto.req.XN619050Req;
import com.cdkj.pipe.dto.res.XN619050Res;
import com.cdkj.pipe.enums.EHearStatus;
import com.cdkj.pipe.exception.BizException;
import com.cdkj.pipe.exception.ParaException;
import com.cdkj.pipe.spring.SpringContextHolder;

/** 
 * 查询用户听单状态
 * @author: haiqingzheng 
 * @since: 2017年3月13日 下午8:11:58 
 * @history:
 */
public class XN619050 extends AProcessor {

    private IHearAO hearAO = SpringContextHolder.getBean(IHearAO.class);

    private IAssignAO assignAO = SpringContextHolder.getBean(IAssignAO.class);

    private XN619050Req req = null;

    /** 
     * @see com.cdkj.pipe.api.IProcessor#doBusiness()
     */
    @Override
    public Object doBusiness() throws BizException {
        XN619050Res res = new XN619050Res();
        Hear hear = hearAO.getHear(req.getUserId());
        res.setHear(hear);
        if (EHearStatus.ASSIGN.getCode().equals(hear.getStatus())) {
            res.setAssign(assignAO.getCurrentAssign(req.getUserId()));
        }
        return res;
    }

    /** 
     * @see com.cdkj.pipe.api.IProcessor#doCheck(java.lang.String)
     */
    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN619050Req.class);
        StringValidater.validateBlank(req.getUserId());
    }

}
