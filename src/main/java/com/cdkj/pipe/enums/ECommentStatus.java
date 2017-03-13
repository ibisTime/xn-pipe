package com.cdkj.pipe.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: xieyj 
 * @since: 2017年2月9日 下午8:10:43 
 * @history:
 */
public enum ECommentStatus {
    TO_APPROVER("0", "待审核"), APPROVER_YES("1", "通过"), APPROVER_NO("2", "不通过");

    public static Map<String, ECommentStatus> getMap() {
        Map<String, ECommentStatus> map = new HashMap<String, ECommentStatus>();
        for (ECommentStatus direction : ECommentStatus.values()) {
            map.put(direction.getCode(), direction);
        }
        return map;
    }

    ECommentStatus(String code, String value) {
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
