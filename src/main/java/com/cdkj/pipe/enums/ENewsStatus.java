package com.cdkj.pipe.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * 新闻状态
 * @author: xieyj 
 * @since: 2017年3月12日 下午5:34:09 
 * @history:
 */
public enum ENewsStatus {
    DRAFT("0", "草稿"), ONLINE("1", "已上架"), OFFLINE("2", "已下架");

    public static Map<String, ENewsStatus> getMap() {
        Map<String, ENewsStatus> map = new HashMap<String, ENewsStatus>();
        for (ENewsStatus newsStatus : ENewsStatus.values()) {
            map.put(newsStatus.getCode(), newsStatus);
        }
        return map;
    }

    ENewsStatus(String code, String value) {
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
