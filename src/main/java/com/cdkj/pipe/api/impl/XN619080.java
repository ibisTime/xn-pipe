package com.cdkj.pipe.api.impl;

import com.cdkj.pipe.ao.INewsAO;
import com.cdkj.pipe.api.AProcessor;
import com.cdkj.pipe.common.JsonUtil;
import com.cdkj.pipe.core.StringValidater;
import com.cdkj.pipe.dto.req.XN619080Req;
import com.cdkj.pipe.dto.res.PKCodeRes;
import com.cdkj.pipe.exception.BizException;
import com.cdkj.pipe.exception.ParaException;
import com.cdkj.pipe.spring.SpringContextHolder;

/**
 * 新增新闻
 * @author: xieyj 
 * @since: 2017年3月12日 下午6:16:48 
 * @history:
 */
public class XN619080 extends AProcessor {
    private INewsAO newsAO = SpringContextHolder.getBean(INewsAO.class);

    private XN619080Req req = null;

    /**
     * @see com.cdkj.ride.api.IProcessor#doBusiness()
     */
    @Override
    public Object doBusiness() throws BizException {
        // type = 1 新闻
        return new PKCodeRes(newsAO.addNews(req.getTitle(), "1",
            req.getKeywords(), req.getContent(), req.getPic(),
            req.getUpdater(), req.getRemark()));
    }

    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN619080Req.class);
        StringValidater.validateBlank(req.getTitle(), req.getContent(),
            req.getPic(), req.getUpdater());
    }
}
