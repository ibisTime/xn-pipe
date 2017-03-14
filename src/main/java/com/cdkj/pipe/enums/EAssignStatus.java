/**
 * @Title EDealerStatus.java 
 * @Package com.cdkj.pipe.enums 
 * @Description 
 * @author leo(haiqing)  
 * @date 2017年3月11日 下午10:16:59 
 * @version V1.0   
 */
package com.cdkj.pipe.enums;

import java.util.HashMap;
import java.util.Map;

/** 
 * 派单状态
 * @author: haiqingzheng 
 * @since: 2017年3月11日 下午10:16:59 
 * @history:
 */
public enum EAssignStatus {

    WAITING("0", "待接单"), RECEIVE("1", "已接单"), REJECT("2", "已拒绝");

    public static Map<String, EAssignStatus> getBizTypeMap() {
        Map<String, EAssignStatus> map = new HashMap<String, EAssignStatus>();
        for (EAssignStatus bizType : EAssignStatus.values()) {
            map.put(bizType.getCode(), bizType);
        }
        return map;
    }

    EAssignStatus(String code, String value) {
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
