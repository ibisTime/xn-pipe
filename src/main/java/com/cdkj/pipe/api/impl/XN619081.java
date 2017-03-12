package com.cdkj.pipe.api.impl;

import com.cdkj.pipe.ao.INewsAO;
import com.cdkj.pipe.api.AProcessor;
import com.cdkj.pipe.common.JsonUtil;
import com.cdkj.pipe.core.StringValidater;
import com.cdkj.pipe.dto.req.XN619081Req;
import com.cdkj.pipe.dto.res.BooleanRes;
import com.cdkj.pipe.exception.BizException;
import com.cdkj.pipe.exception.ParaException;
import com.cdkj.pipe.spring.SpringContextHolder;

/**
 * 删除新闻
 * @author: xieyj 
 * @since: 2017年3月12日 下午6:20:19 
 * @history:
 */
public class XN619081 extends AProcessor {
    private INewsAO newsAO = SpringContextHolder.getBean(INewsAO.class);

    private XN619081Req req = null;

    /**
     * @see com.cdkj.ride.api.IProcessor#doBusiness()
     */
    @Override
    public Object doBusiness() throws BizException {
        newsAO.dropNews(req.getCode());
        return new BooleanRes(true);
    }

    /**
     * @see com.cdkj.ride.api.IProcessor#doCheck(java.lang.String)
     */
    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN619081Req.class);
        StringValidater.validateBlank(req.getCode());
    }

}
