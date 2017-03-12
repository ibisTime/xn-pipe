package com.cdkj.pipe.api.impl;

import com.cdkj.pipe.ao.INewsAO;
import com.cdkj.pipe.api.AProcessor;
import com.cdkj.pipe.common.JsonUtil;
import com.cdkj.pipe.core.StringValidater;
import com.cdkj.pipe.dto.req.XN619086Req;
import com.cdkj.pipe.exception.BizException;
import com.cdkj.pipe.exception.ParaException;
import com.cdkj.pipe.spring.SpringContextHolder;

/**
 * 详情查询新闻
 * @author: xieyj 
 * @since: 2017年3月12日 下午6:26:55 
 * @history:
 */
public class XN619086 extends AProcessor {
    private INewsAO newsAO = SpringContextHolder.getBean(INewsAO.class);

    private XN619086Req req = null;

    @Override
    public Object doBusiness() throws BizException {
        return newsAO.getNews(req.getCode());
    }

    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN619086Req.class);
        StringValidater.validateBlank(req.getCode());
    }

}
