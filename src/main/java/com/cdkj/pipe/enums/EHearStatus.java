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
 * 听单状态
 * @author: haiqingzheng 
 * @since: 2017年3月11日 下午10:16:59 
 * @history:
 */
public enum EHearStatus {

    STOP("0", "已停止"), ING("1", "听单中"), ASSIGN("2", "已派单");

    public static Map<String, EHearStatus> getBizTypeMap() {
        Map<String, EHearStatus> map = new HashMap<String, EHearStatus>();
        for (EHearStatus bizType : EHearStatus.values()) {
            map.put(bizType.getCode(), bizType);
        }
        return map;
    }

    EHearStatus(String code, String value) {
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
