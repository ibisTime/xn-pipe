package com.cdkj.pipe.api.impl;

import com.cdkj.pipe.ao.INewsAO;
import com.cdkj.pipe.api.AProcessor;
import com.cdkj.pipe.common.JsonUtil;
import com.cdkj.pipe.core.StringValidater;
import com.cdkj.pipe.dto.req.XN619084Req;
import com.cdkj.pipe.dto.res.BooleanRes;
import com.cdkj.pipe.exception.BizException;
import com.cdkj.pipe.exception.ParaException;
import com.cdkj.pipe.spring.SpringContextHolder;

/**
 * 下架新闻
 * @author: xieyj 
 * @since: 2017年3月12日 下午6:25:34 
 * @history:
 */
public class XN619084 extends AProcessor {
    private INewsAO newsAO = SpringContextHolder.getBean(INewsAO.class);

    private XN619084Req req = null;

    @Override
    public Object doBusiness() throws BizException {
        newsAO.downNews(req.getCode(), req.getUpdater());
        return new BooleanRes(true);
    }

    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN619084Req.class);
        StringValidater.validateBlank(req.getCode(), req.getUpdater());
    }
}
