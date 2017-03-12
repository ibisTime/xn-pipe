/**
 * @Title EDemandOrderStatus.java 
 * @Package com.cdkj.pipe.enums 
 * @Description 
 * @author leo(haiqing)  
 * @date 2017年3月11日 下午10:21:58 
 * @version V1.0   
 */
package com.cdkj.pipe.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * 需求订单状态
 * @author: haiqingzheng 
 * @since: 2017年3月11日 下午10:21:58 
 * @history:
 */
public enum EDemandOrderStatus {
    ING("0", "进行中"), USER_CANCEL("91", "水电工取消"), DEALER_CACEL("92", "经销商取消"), FINISH(
            "2", "已完成");

    public static Map<String, EDemandOrderStatus> getBizTypeMap() {
        Map<String, EDemandOrderStatus> map = new HashMap<String, EDemandOrderStatus>();
        for (EDemandOrderStatus bizType : EDemandOrderStatus.values()) {
            map.put(bizType.getCode(), bizType);
        }
        return map;
    }

    EDemandOrderStatus(String code, String value) {
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
