/**
 * @Title EBlacklistType.java 
 * @Package com.cdkj.tour.enums 
 * @Description 
 * @author leo(haiqing)  
 * @date 2017年2月22日 下午3:30:58 
 * @version V1.0   
 */
package com.cdkj.pipe.enums;


/** 
 * @author: haiqingzheng 
 * @since: 2017年2月22日 下午3:30:58 
 * @history:
 */
public enum EBlacklistType {
    CARPOOL("0", "拼车业务黑名单");

    EBlacklistType(String code, String value) {
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
