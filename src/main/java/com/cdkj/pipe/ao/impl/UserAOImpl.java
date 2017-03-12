/**
 * @Title UserAOImpl.java 
 * @Package com.cdkj.tour.ao.impl 
 * @Description 
 * @author xieyj  
 * @date 2017年3月6日 下午10:31:08 
 * @version V1.0   
 */
package com.cdkj.pipe.ao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdkj.pipe.ao.IUserAO;
import com.cdkj.pipe.bo.ISYSConfigBO;
import com.cdkj.pipe.bo.IUserBO;
import com.cdkj.pipe.common.SysConstants;
import com.cdkj.pipe.core.CalculationUtil;
import com.cdkj.pipe.domain.SYSConfig;
import com.cdkj.pipe.dto.res.XN805930Res;
import com.cdkj.pipe.enums.ESystemCode;

/** 
 * @author: xieyj 
 * @since: 2017年3月6日 下午10:31:08 
 * @history:
 */
@Service
public class UserAOImpl implements IUserAO {

    @Autowired
    private IUserBO userBO;

    @Autowired
    private ISYSConfigBO sysConfigBO;

    @Override
    public XN805930Res doLoginReg(String code) {
        SYSConfig sysConfig = sysConfigBO.getConfig(SysConstants.XNB_REGISTER);
        Long amount = CalculationUtil.multByConfig(sysConfig.getCvalue());
        return userBO.doLoginReg(code, amount, ESystemCode.QNSDGZS.getCode());
    }

    /** 
     * @see com.cdkj.pipe.ao.IUserAO#signToday(java.lang.String, java.lang.String)
     */
    @Override
    public Object signToday(String userId, String location) {
        SYSConfig sysConfig = sysConfigBO.getConfig(SysConstants.XNB_SIGN);
        Long amount = CalculationUtil.multByConfig(sysConfig.getCvalue());
        return userBO.signToday(userId, location, amount);
    }
}
