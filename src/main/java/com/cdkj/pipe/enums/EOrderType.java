package com.cdkj.pipe.enums;


/**
 * @author: xieyj 
 * @since: 2017年2月9日 下午8:10:43 
 * @history:
 */
public enum EOrderType {
    SH_SALE("1", "散买"), PFS_SALE("2", "批发"), FXS_SALE("3", "分销商订单");

    EOrderType(String code, String value) {
        this.code = code;
        this.value = value;
    }

    private String code;

    private String value;

    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }
}
