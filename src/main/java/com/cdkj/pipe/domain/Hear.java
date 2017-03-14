package com.cdkj.pipe.domain;

import com.cdkj.pipe.dao.base.ABaseDO;
import com.cdkj.pipe.dto.res.XN805901Res;

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

    // 找活内容
    private String content;

    // 状态
    private String status;

    private XN805901Res user;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
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

    public XN805901Res getUser() {
        return user;
    }

    public void setUser(XN805901Res user) {
        this.user = user;
    }

}
