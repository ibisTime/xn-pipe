/**
 * @Title XN619014.java 
 * @Package com.cdkj.pipe.api.impl 
 * @Description 
 * @author leo(haiqing)  
 * @date 2017年5月8日 下午5:32:23 
 * @version V1.0   
 */
package com.cdkj.pipe.api.impl;

import org.apache.commons.lang3.StringUtils;

import com.cdkj.pipe.ao.IDealerAO;
import com.cdkj.pipe.api.AProcessor;
import com.cdkj.pipe.common.JsonUtil;
import com.cdkj.pipe.core.StringValidater;
import com.cdkj.pipe.domain.Dealer;
import com.cdkj.pipe.dto.req.XN619014Req;
import com.cdkj.pipe.enums.EDealerStatus;
import com.cdkj.pipe.exception.BizException;
import com.cdkj.pipe.exception.ParaException;
import com.cdkj.pipe.spring.SpringContextHolder;

/** 
 * 分页查询附近经销商
 * @author: haiqingzheng 
 * @since: 2017年5月8日 下午5:32:23 
 * @history:
 */
public class XN619014 extends AProcessor {
    private IDealerAO dealerAO = SpringContextHolder.getBean(IDealerAO.class);

    private XN619014Req req = null;

    /** 
     * @see com.cdkj.pipe.api.IProcessor#doBusiness()
     */
    @Override
    public Object doBusiness() throws BizException {
        Dealer condition = new Dealer();
        condition.setStatus(EDealerStatus.PUT_ON.getCode());
        String orderColumn = req.getOrderColumn();
        if (StringUtils.isBlank(orderColumn)) {
            orderColumn = IDealerAO.DEFAULT_ORDER_COLUMN;
        }
        condition.setOrder(orderColumn, req.getOrderDir());
        condition.setLongitude(req.getLongitude());
        condition.setLatitude(req.getLatitude());
        int start = StringValidater.toInteger(req.getStart());
        int limit = StringValidater.toInteger(req.getLimit());
        return dealerAO.queryRangeDealerPage(start, limit, condition);
    }

    /** 
     * @see com.cdkj.pipe.api.IProcessor#doCheck(java.lang.String)
     */
    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN619014Req.class);
        StringValidater.validateBlank(req.getStart(), req.getLimit(),
            req.getLongitude(), req.getLatitude());
    }

}
