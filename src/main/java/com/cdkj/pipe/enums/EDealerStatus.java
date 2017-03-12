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
 * 经销商状态
 * @author: haiqingzheng 
 * @since: 2017年3月11日 下午10:16:59 
 * @history:
 */
public enum EDealerStatus {

    NEW("0", "新入驻"), PUT_ON("1", "已上架"), PUT_OFF("2", "已下架");

    public static Map<String, EDealerStatus> getBizTypeMap() {
        Map<String, EDealerStatus> map = new HashMap<String, EDealerStatus>();
        for (EDealerStatus bizType : EDealerStatus.values()) {
            map.put(bizType.getCode(), bizType);
        }
        return map;
    }

    EDealerStatus(String code, String value) {
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
