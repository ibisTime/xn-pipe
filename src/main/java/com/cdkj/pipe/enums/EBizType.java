package com.cdkj.pipe.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * 业务类型
 * @author: xieyj 
 * @since: 2016年11月11日 上午10:09:32 
 * @history:
 */
public enum EBizType {
    GD_MALL("GD_MALL", "积分商城消费"), GD_O2O("GD_O2O", "O2O店铺积分消费"), GD_WCDDSJF(
            "GD_WCDDSJF", "完成订单送积分");

    public static Map<String, EBizType> getBizTypeMap() {
        Map<String, EBizType> map = new HashMap<String, EBizType>();
        for (EBizType bizType : EBizType.values()) {
            map.put(bizType.getCode(), bizType);
        }
        return map;
    }

    EBizType(String code, String value) {
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
