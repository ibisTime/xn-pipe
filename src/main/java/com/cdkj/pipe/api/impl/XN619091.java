package com.cdkj.pipe.api.impl;

import com.cdkj.pipe.ao.ICommentAO;
import com.cdkj.pipe.api.AProcessor;
import com.cdkj.pipe.common.JsonUtil;
import com.cdkj.pipe.core.StringValidater;
import com.cdkj.pipe.dto.req.XN619091Req;
import com.cdkj.pipe.dto.res.BooleanRes;
import com.cdkj.pipe.exception.BizException;
import com.cdkj.pipe.exception.ParaException;
import com.cdkj.pipe.spring.SpringContextHolder;

/**
 * 删除评论
 * @author: xieyj 
 * @since: 2017年3月13日 下午2:41:22 
 * @history:
 */
public class XN619091 extends AProcessor {
    private ICommentAO commentAO = SpringContextHolder
        .getBean(ICommentAO.class);

    private XN619091Req req = null;

    /**
     * @see com.cdkj.ride.api.IProcessor#doBusiness()
     */
    @Override
    public Object doBusiness() throws BizException {
        commentAO.dropComment(req.getCode());
        return new BooleanRes(true);
    }

    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN619091Req.class);
        StringValidater.validateBlank(req.getCode());
    }
}
