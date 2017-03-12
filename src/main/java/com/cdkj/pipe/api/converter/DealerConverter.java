/**
 * @Title DealerConverter.java 
 * @Package com.cdkj.pipe.api.converter 
 * @Description 
 * @author leo(haiqing)  
 * @date 2017年3月12日 下午5:16:41 
 * @version V1.0   
 */
package com.cdkj.pipe.api.converter;

import com.cdkj.pipe.domain.Dealer;
import com.cdkj.pipe.dto.req.XN619000Req;
import com.cdkj.pipe.dto.req.XN619001Req;

/** 
 * @author: haiqingzheng 
 * @since: 2017年3月12日 下午5:16:41 
 * @history:
 */
public class DealerConverter {

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
}
