/**
 * @Title XN619060.java 
 * @Package com.cdkj.pipe.api.impl 
 * @Description 
 * @author leo(haiqing)  
 * @date 2017年3月12日 下午2:26:59 
 * @version V1.0   
 */
package com.cdkj.pipe.api.impl;

import org.apache.commons.lang3.StringUtils;

import com.cdkj.pipe.ao.IDemandOrderAO;
import com.cdkj.pipe.api.AProcessor;
import com.cdkj.pipe.common.JsonUtil;
import com.cdkj.pipe.domain.DemandOrder;
import com.cdkj.pipe.dto.req.XN619071Req;
import com.cdkj.pipe.exception.BizException;
import com.cdkj.pipe.exception.ParaException;
import com.cdkj.pipe.spring.SpringContextHolder;

/** 
 * 订单列表查询
 * @author: haiqingzheng 
 * @since: 2017年3月12日 下午2:26:59 
 * @history:
 */
public class XN619071 extends AProcessor {

    private IDemandOrderAO demandOrderAO = SpringContextHolder
        .getBean(IDemandOrderAO.class);

    private XN619071Req req = null;

    /** 
     * @see com.cdkj.pipe.api.IProcessor#doBusiness()
     */
    @Override
    public Object doBusiness() throws BizException {
        DemandOrder condition = new DemandOrder();
        condition.setCode(req.getCode());
        condition.setType(req.getType());
        condition.setDemandCode(req.getDemandCode());
        condition.setDealerCode(req.getDealerCode());
        condition.setReceiver(req.getReceiver());
        condition.setStatus(req.getStatus());
        condition.setStatusList(req.getStatusList());
        String orderColumn = req.getOrderColumn();
        if (StringUtils.isBlank(orderColumn)) {
            orderColumn = IDemandOrderAO.DEFAULT_ORDER_COLUMN;
        }
        condition.setOrder(orderColumn, req.getOrderDir());
        return demandOrderAO.queryDemandOrderList(condition);
    }

    /** 
     * @see com.cdkj.pipe.api.IProcessor#doCheck(java.lang.String)
     */
    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN619071Req.class);
    }

}
