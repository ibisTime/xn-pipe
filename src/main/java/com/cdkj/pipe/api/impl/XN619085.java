package com.cdkj.pipe.api.impl;

import org.apache.commons.lang.StringUtils;

import com.cdkj.pipe.ao.INewsAO;
import com.cdkj.pipe.api.AProcessor;
import com.cdkj.pipe.common.JsonUtil;
import com.cdkj.pipe.core.StringValidater;
import com.cdkj.pipe.domain.News;
import com.cdkj.pipe.dto.req.XN619085Req;
import com.cdkj.pipe.exception.BizException;
import com.cdkj.pipe.exception.ParaException;
import com.cdkj.pipe.spring.SpringContextHolder;

/**
 * 分页查询新闻
 * @author: xieyj 
 * @since: 2017年3月12日 下午6:26:40 
 * @history:
 */
public class XN619085 extends AProcessor {
    private INewsAO newsAO = SpringContextHolder.getBean(INewsAO.class);

    private XN619085Req req = null;

    @Override
    public Object doBusiness() throws BizException {
        News condition = new News();
        condition.setType(req.getType());
        condition.setTitle(req.getTitle());
        condition.setStatus(req.getStatus());
        condition.setLocation(req.getLocation());
        String orderColumn = req.getOrderColumn();
        if (StringUtils.isBlank(orderColumn)) {
            orderColumn = INewsAO.DEFAULT_ORDER_COLUMN;
        }
        condition.setOrder(orderColumn, req.getOrderDir());
        int start = StringValidater.toInteger(req.getStart());
        int limit = StringValidater.toInteger(req.getLimit());
        return newsAO.queryNewsPage(start, limit, condition);
    }

    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN619085Req.class);
        StringValidater.validateBlank(req.getStart(), req.getLimit());
    }

}
