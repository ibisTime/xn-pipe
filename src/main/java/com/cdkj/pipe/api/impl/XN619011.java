/**
 * @Title XN619011.java 
 * @Package com.cdkj.pipe.api.impl 
 * @Description 
 * @author leo(haiqing)  
 * @date 2017年3月12日 上午10:54:34 
 * @version V1.0   
 */
package com.cdkj.pipe.api.impl;

import org.apache.commons.lang3.StringUtils;

import com.cdkj.pipe.ao.IDealerAO;
import com.cdkj.pipe.api.AProcessor;
import com.cdkj.pipe.common.JsonUtil;
import com.cdkj.pipe.domain.Dealer;
import com.cdkj.pipe.dto.req.XN619011Req;
import com.cdkj.pipe.exception.BizException;
import com.cdkj.pipe.exception.ParaException;
import com.cdkj.pipe.spring.SpringContextHolder;

/** 
 * 列表查询经销商
 * @author: haiqingzheng 
 * @since: 2017年3月12日 上午10:54:34 
 * @history:
 */
public class XN619011 extends AProcessor {

    private IDealerAO dealerAO = SpringContextHolder.getBean(IDealerAO.class);

    private XN619011Req req = null;

    /** 
     * @see com.cdkj.pipe.api.IProcessor#doBusiness()
     */
    @Override
    public Object doBusiness() throws BizException {
        Dealer condition = new Dealer();
        condition.setLoginName(req.getLoginName());
        condition.setName(req.getName());
        condition.setProvince(req.getProvince());
        condition.setCity(req.getCity());
        condition.setArea(req.getArea());
        condition.setOwner(req.getOwner());
        condition.setStatus(req.getStatus());
        String orderColumn = req.getOrderColumn();
        if (StringUtils.isBlank(orderColumn)) {
            orderColumn = IDealerAO.DEFAULT_ORDER_COLUMN;
        }
        condition.setOrder(orderColumn, req.getOrderDir());
        return dealerAO.queryDealerList(condition);
    }

    /** 
     * @see com.cdkj.pipe.api.IProcessor#doCheck(java.lang.String)
     */
    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN619011Req.class);
    }

}
