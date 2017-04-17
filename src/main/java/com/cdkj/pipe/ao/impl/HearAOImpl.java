package com.cdkj.pipe.ao.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdkj.pipe.ao.IHearAO;
import com.cdkj.pipe.bo.IAssignBO;
import com.cdkj.pipe.bo.IHearBO;
import com.cdkj.pipe.bo.ISYSConfigBO;
import com.cdkj.pipe.bo.IUserBO;
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
    public List<Hear> queryNearbyUser(String longitude, String latitude) {
        Hear condition = new Hear();
        condition.setStatus(EHearStatus.ING.getCode());
        condition.setLatitude(latitude);
        condition.setLongitude(longitude);
        if (StringUtils.isNotBlank(longitude)
                && StringUtils.isNotBlank(latitude)) {
            condition.setDistance(StringValidater.toDouble(sysConfigBO
                .getConfigValue("distance")));
        }
        List<Hear> userList = hearBO.queryHearList(condition);
        for (Hear hear : userList) {
            hear.setUser(userBO.getRemoteUser(hear.getUserId()));
        }
        return userList;
    }
}
