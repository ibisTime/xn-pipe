package com.cdkj.pipe.dto.req;

/**
 * 下架新闻
 * @author: xieyj 
 * @since: 2017年3月12日 下午6:10:47 
 * @history:
 */
public class XN619084Req {

    // 编号（必填）
    private String code;

    // 更新人（必填）
    private String updater;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }
}
