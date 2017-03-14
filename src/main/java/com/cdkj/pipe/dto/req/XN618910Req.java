package com.cdkj.pipe.dto.req;

/**
 * @author: xieyj 
 * @since: 2016年9月17日 下午4:09:29 
 * @history:
 */
public class XN618910Req {
    // 类型(必填)
    private String type;

    // key值（必填）
    private String ckey;

    // 值（必填）
    private String cvalue;

    // 更新人（必填）
    private String updater;

    // 备注（选填）
    private String remark;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCkey() {
        return ckey;
    }

    public void setCkey(String ckey) {
        this.ckey = ckey;
    }

    public String getCvalue() {
        return cvalue;
    }

    public void setCvalue(String cvalue) {
        this.cvalue = cvalue;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
