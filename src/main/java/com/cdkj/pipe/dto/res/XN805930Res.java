package com.cdkj.pipe.dto.res;

public class XN805930Res {
    // 用户编号
    private String userId;

    // 注册金额
    private String amount;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public XN805930Res() {
    }

    public XN805930Res(String userId) {
        this.userId = userId;
    }

    public XN805930Res(String userId, String amount) {
        this.userId = userId;
        this.amount = amount;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
