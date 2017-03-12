package com.cdkj.pipe.api.impl;

import com.cdkj.pipe.ao.INewsAO;
import com.cdkj.pipe.api.AProcessor;
import com.cdkj.pipe.common.JsonUtil;
import com.cdkj.pipe.core.StringValidater;
import com.cdkj.pipe.dto.req.XN619082Req;
import com.cdkj.pipe.dto.res.BooleanRes;
import com.cdkj.pipe.exception.BizException;
import com.cdkj.pipe.exception.ParaException;
import com.cdkj.pipe.spring.SpringContextHolder;

/**
 * 修改新闻
 * @author: xieyj 
 * @since: 2017年3月12日 下午6:20:46 
 * @history:
 */
public class XN619082 extends AProcessor {
    private INewsAO newsAO = SpringContextHolder.getBean(INewsAO.class);

    private XN619082Req req = null;

    @Override
    public Object doBusiness() throws BizException {
        newsAO.editNews(req.getCode(), req.getTitle(), "1", req.getKeywords(),
            req.getContent(), req.getPic(), req.getUpdater(), req.getRemark());
        return new BooleanRes(true);
    }

    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN619082Req.class);
        StringValidater.validateBlank(req.getCode(), req.getTitle(),
            req.getContent(), req.getPic(), req.getUpdater());
    }
}
