/**
 * @Title IUserAO.java 
 * @Package com.cdkj.tour.ao 
 * @Description 
 * @author xieyj  
 * @date 2017年3月6日 下午10:28:02 
 * @version V1.0   
 */
package com.cdkj.pipe.ao;

import com.cdkj.pipe.dto.res.XN805930Res;

/** 
 * @author: xieyj 
 * @since: 2017年3月6日 下午10:28:02 
 * @history:
 */
public interface IUserAO {

    /**
     * 微信登录注册
     * @param code
     * @param systemCode
     * @return 
     * @create: 2017年3月8日 下午3:19:40 xieyj
     * @history:
     */
    public XN805930Res doLoginReg(String code);

    /**
     * 每日签到
     * @param userId
     * @param location
     * @return 
     * @create: 2017年3月6日 下午10:28:45 xieyj
     * @history:
     */
    public Object signToday(String userId, String location);

}
