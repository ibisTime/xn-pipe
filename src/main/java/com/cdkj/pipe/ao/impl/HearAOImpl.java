package com.cdkj.pipe.ao.impl;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdkj.pipe.ao.IHearAO;
import com.cdkj.pipe.bo.IAssignBO;
import com.cdkj.pipe.bo.IHearBO;
import com.cdkj.pipe.bo.ISYSConfigBO;
import com.cdkj.pipe.bo.IUserBO;
import com.cdkj.pipe.bo.base.Paginable;
import com.cdkj.pipe.core.StringValidater;
import com.cdkj.pipe.domain.Hear;
import com.cdkj.pipe.enums.EHearStatus;
import com.cdkj.pipe.exception.BizException;

@Service
public class HearAOImpl implements IHearAO {

    @Autowired
    private IHearBO hearBO;

    @Autowired
    private IAssignBO assignBO;

    @Autowired
    private IUserBO userBO;

    @Autowired
    private ISYSConfigBO sysConfigBO;

    @Override
    public Hear getHear(String userId) {
        Hear hear = hearBO.getHear(userId);
        if (hear == null) {
            hear = new Hear();
            hear.setUserId(userId);
            hear.setStatus(EHearStatus.STOP.getCode());
            hearBO.saveHear(hear);
        }
        return hear;
    }

    @Override
    public void startHear(String userId, String longitude, String latitude,
            String content) {
        Hear hear = this.getHear(userId);
        if (!EHearStatus.STOP.getCode().equals(hear.getStatus())) {
            throw new BizException("xn0000", "当前用户状态不是停止状态，无法进行听单");
        }
        hearBO.startHear(userId, latitude, longitude, content);
    }

    @Override
    public void stopHear(String userId) {
        Hear hear = this.getHear(userId);
        if (!EHearStatus.ING.getCode().equals(hear.getStatus())) {
            throw new BizException("xn0000", "当前用户状态不是听单状态，无法停止听单");
        }
        hearBO.stopHear(userId);
    }

    @Override
    public Paginable<Hear> queryNearbyUser(int start, int limit, Hear condition) {
        if (StringUtils.isNotBlank(condition.getLatitude())
                && StringUtils.isNotBlank(condition.getLongitude())) {
            condition.setDistance(StringValidater.toDouble(sysConfigBO
                .getConfigValue("distance")));
        }
        Paginable<Hear> userList = hearBO.getPaginable(start, limit, condition);
        for (Hear hear : userList.getList()) {
            hear.setUser(userBO.getRemoteUser(hear.getUserId()));
        }
        return userList;
    }
}
