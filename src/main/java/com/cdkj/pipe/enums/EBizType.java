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
    AJ_REG("01", "注册送积分"), AJ_SIGN("02", "每日签到送积分"), AJ_CZ("11", "充值"), AJ_QX(
            "-11", "取现"), AJ_LB("19", "蓝补"), AJ_HC("-19", "红冲"), AJ_WCDDSJF(
            "20", "完成订单送积分");

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
