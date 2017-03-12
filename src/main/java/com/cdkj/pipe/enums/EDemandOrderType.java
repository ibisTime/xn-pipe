/**
 * @Title EDemandOrderType.java 
 * @Package com.cdkj.pipe.enums 
 * @Description 
 * @author leo(haiqing)  
 * @date 2017年3月11日 下午11:11:35 
 * @version V1.0   
 */
package com.cdkj.pipe.enums;

import java.util.HashMap;
import java.util.Map;

/** 
 * @author: haiqingzheng 
 * @since: 2017年3月11日 下午11:11:35 
 * @history:
 */
public enum EDemandOrderType {

    ASSIGN("0", "经销商派单"), RECEIVE("1", "水电工找单");

    public static Map<String, EDemandOrderType> getBizTypeMap() {
        Map<String, EDemandOrderType> map = new HashMap<String, EDemandOrderType>();
        for (EDemandOrderType bizType : EDemandOrderType.values()) {
            map.put(bizType.getCode(), bizType);
        }
        return map;
    }

    EDemandOrderType(String code, String value) {
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
