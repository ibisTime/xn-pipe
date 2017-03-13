package com.cdkj.pipe.api.impl;

import org.apache.commons.lang.StringUtils;

import com.cdkj.pipe.ao.ICommentAO;
import com.cdkj.pipe.api.AProcessor;
import com.cdkj.pipe.common.JsonUtil;
import com.cdkj.pipe.core.StringValidater;
import com.cdkj.pipe.domain.Comment;
import com.cdkj.pipe.dto.req.XN619095Req;
import com.cdkj.pipe.exception.BizException;
import com.cdkj.pipe.exception.ParaException;
import com.cdkj.pipe.spring.SpringContextHolder;

/**
 * 分页查询评论
 * @author: xieyj 
 * @since: 2017年3月12日 下午6:26:40 
 * @history:
 */
public class XN619095 extends AProcessor {
    private ICommentAO newsAO = SpringContextHolder.getBean(ICommentAO.class);

    private XN619095Req req = null;

    @Override
    public Object doBusiness() throws BizException {
        Comment condition = new Comment();
        condition.setType(req.getType());
        condition.setEntityCode(req.getEntityCode());
        condition.setStatus(req.getStatus());
        String orderColumn = req.getOrderColumn();
        if (StringUtils.isBlank(orderColumn)) {
            orderColumn = ICommentAO.DEFAULT_ORDER_COLUMN;
        }
        condition.setOrder(orderColumn, req.getOrderDir());
        int start = StringValidater.toInteger(req.getStart());
        int limit = StringValidater.toInteger(req.getLimit());
        return newsAO.queryCommentPage(start, limit, condition);
    }

    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN619095Req.class);
        StringValidater.validateNumber(req.getStart(), req.getLimit());
    }
}
