package com.cdkj.pipe.api.impl;

import com.cdkj.pipe.ao.ICommentAO;
import com.cdkj.pipe.api.AProcessor;
import com.cdkj.pipe.common.JsonUtil;
import com.cdkj.pipe.core.StringValidater;
import com.cdkj.pipe.dto.req.XN619090Req;
import com.cdkj.pipe.dto.res.PKCodeRes;
import com.cdkj.pipe.exception.BizException;
import com.cdkj.pipe.exception.ParaException;
import com.cdkj.pipe.spring.SpringContextHolder;

/**
 * 发布评论
 * @author: xieyj 
 * @since: 2017年3月13日 下午2:41:14 
 * @history:
 */
public class XN619090 extends AProcessor {
    private ICommentAO commentAO = SpringContextHolder
        .getBean(ICommentAO.class);

    private XN619090Req req = null;

    /**
     * @see com.cdkj.ride.api.IProcessor#doBusiness()
     */
    @Override
    public Object doBusiness() throws BizException {
        // type = 1 水电工
        return new PKCodeRes(commentAO.publishComment("1", req.getContent(),
            req.getParentCode(), req.getCommentator(), req.getEntityCode()));
    }

    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN619090Req.class);
        StringValidater.validateBlank(req.getContent(), req.getParentCode(),
            req.getCommentator(), req.getEntityCode());
    }
}
