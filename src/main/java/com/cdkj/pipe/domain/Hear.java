package com.cdkj.pipe.domain;

import com.cdkj.pipe.dao.base.ABaseDO;
import com.cdkj.pipe.dto.res.XN001400Res;

/**
* 听单
* @author: haiqingzheng
* @since: 2017年03月12日 14:11:30
* @history:
*/
public class Hear extends ABaseDO {

    private static final long serialVersionUID = 1L;

    // 用户编号
    private String userId;

    // 用户经度
    private String latitude;

    // 用户纬度
    private String longitude;

    // 找活内容
    private String content;

    // 状态
    private String status;

    // 搜索距离
    private Double distance;

    private XN001400Res user;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public XN001400Res getUser() {
        return user;
    }

    public void setUser(XN001400Res user) {
        this.user = user;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

}
