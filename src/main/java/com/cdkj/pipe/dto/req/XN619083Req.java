package com.cdkj.pipe.dto.req;

/**
 * 上架新闻
 * @author: xieyj 
 * @since: 2017年3月12日 下午6:08:52 
 * @history:
 */
public class XN619083Req {
    // 编号（必填）
    private String code;

    // 位置(0 普通 1热门)（必填）
    private String location;

    // 序号（必填）
    private String orderNo;

    // 更新人（必填）
    private String updater;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }
}
