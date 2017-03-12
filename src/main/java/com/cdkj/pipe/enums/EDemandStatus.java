/**
 * @Title EDemandStatus.java 
 * @Package com.cdkj.pipe.enums 
 * @Description 
 * @author leo(haiqing)  
 * @date 2017年3月11日 下午10:22:19 
 * @version V1.0   
 */
package com.cdkj.pipe.enums;

import java.util.HashMap;
import java.util.Map;

/** 
 * 需求状态
 * @author: haiqingzheng 
 * @since: 2017年3月11日 下午10:22:19 
 * @history:
 */
public enum EDemandStatus {

    NEW("0", "新增"), PUT_ON("1", "已上架"), PUT_OFF("2", "已下架"), ASSIGN("2", "已派单"), RECEIVE(
            "3", "已接单"), CANCEL("4", "已取消"), FINISH("5", "已完成");

    public static Map<String, EDemandStatus> getBizTypeMap() {
        Map<String, EDemandStatus> map = new HashMap<String, EDemandStatus>();
        for (EDemandStatus bizType : EDemandStatus.values()) {
            map.put(bizType.getCode(), bizType);
        }
        return map;
    }

    EDemandStatus(String code, String value) {
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
