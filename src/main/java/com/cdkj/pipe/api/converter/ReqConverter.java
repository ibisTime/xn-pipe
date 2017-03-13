/**
 * @Title DealerConverter.java 
 * @Package com.cdkj.pipe.api.converter 
 * @Description 
 * @author leo(haiqing)  
 * @date 2017年3月12日 下午5:16:41 
 * @version V1.0   
 */
package com.cdkj.pipe.api.converter;

import com.cdkj.pipe.common.DateUtil;
import com.cdkj.pipe.domain.Dealer;
import com.cdkj.pipe.domain.Demand;
import com.cdkj.pipe.dto.req.XN619000Req;
import com.cdkj.pipe.dto.req.XN619001Req;
import com.cdkj.pipe.dto.req.XN619020Req;
import com.cdkj.pipe.dto.req.XN619022Req;

/** 
 * @author: haiqingzheng 
 * @since: 2017年3月12日 下午5:16:41 
 * @history:
 */
public class ReqConverter {

    public static Dealer converter(XN619000Req req) {
        Dealer dealer = new Dealer();
        dealer.setLoginName(req.getLoginName());
        dealer.setName(req.getName());
        dealer.setProvince(req.getProvince());
        dealer.setCity(req.getCity());
        dealer.setArea(req.getArea());
        dealer.setAddress(req.getAddress());
        dealer.setLongitude(req.getLongitude());
        dealer.setLatitude(req.getLatitude());
        dealer.setOwner(req.getOwner());
        dealer.setContact(req.getContact());
        dealer.setMobile(req.getMobile());
        dealer.setPic(req.getPic());
        dealer.setDetail(req.getDetail());
        dealer.setUpdater(req.getUpdater());
        return dealer;
    }

    public static Dealer converter(XN619001Req req) {
        Dealer dealer = new Dealer();
        dealer.setCode(req.getCode());
        dealer.setName(req.getName());
        dealer.setProvince(req.getProvince());
        dealer.setCity(req.getCity());
        dealer.setArea(req.getArea());
        dealer.setAddress(req.getAddress());
        dealer.setLongitude(req.getLongitude());
        dealer.setLatitude(req.getLatitude());
        dealer.setOwner(req.getOwner());
        dealer.setContact(req.getContact());
        dealer.setMobile(req.getMobile());
        dealer.setPic(req.getPic());
        dealer.setDetail(req.getDetail());
        dealer.setUpdater(req.getUpdater());
        return dealer;
    }

    public static Demand converter(XN619020Req req) {
        Demand demand = new Demand();
        demand.setDealerCode(req.getDealerCode());
        demand.setStartDatetime(DateUtil.strToDate(req.getStartDatetime(),
            DateUtil.DATA_TIME_PATTERN_1));
        demand.setEndDatetime(DateUtil.strToDate(req.getEndDatetime(),
            DateUtil.DATA_TIME_PATTERN_1));
        demand.setProvince(req.getProvince());
        demand.setCity(req.getCity());
        demand.setArea(req.getArea());
        demand.setAddress(req.getAddress());
        demand.setLongitude(req.getLongitude());
        demand.setLatitude(req.getLatitude());
        demand.setPrice(req.getPrice());
        demand.setSummary(req.getSummary());
        demand.setPic(req.getPic());
        demand.setDetail(req.getDetail());
        demand.setUpdater(req.getUpdater());
        demand.setRemark(req.getRemark());
        return demand;
    }

    public static Demand converter(XN619022Req req) {
        Demand demand = new Demand();
        demand.setCode(req.getCode());
        demand.setStartDatetime(DateUtil.strToDate(req.getStartDatetime(),
            DateUtil.DATA_TIME_PATTERN_1));
        demand.setEndDatetime(DateUtil.strToDate(req.getEndDatetime(),
            DateUtil.DATA_TIME_PATTERN_1));
        demand.setProvince(req.getProvince());
        demand.setCity(req.getCity());
        demand.setArea(req.getArea());
        demand.setAddress(req.getAddress());
        demand.setLongitude(req.getLongitude());
        demand.setLatitude(req.getLatitude());
        demand.setPrice(req.getPrice());
        demand.setSummary(req.getSummary());
        demand.setPic(req.getPic());
        demand.setDetail(req.getDetail());
        demand.setUpdater(req.getUpdater());
        demand.setRemark(req.getRemark());
        return demand;
    }
}
