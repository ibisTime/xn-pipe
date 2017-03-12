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
            "-11", "取现"), AJ_LB("19", "蓝补"), AJ_HC("-19", "红冲"), AJ_GW("-30",
            "购物"), AJ_GWTK("30", "购物退款"), AJ_XLGM("-32", "线路购买"), AJ_XLTK("32",
            "线路退款"), AJ_JDDF("-33", "酒店订房"), AJ_JDTK("33", "酒店退款"), AJ_ZXGM(
            "-34", "专线购买"), AJ_ZXTK("34", "专线退款"), AJ_DBGM("-35", "大巴预定"), AJ_DBTK(
            "35", "大巴预定退款"), AJ_CARPOOL_DINGJIN("-36", "拼车定金支付"), AJ_CARPOOL_WEIKUAN(
            "-37", "拼车尾款支付"), AJ_CARPOOL_TK("38", "拼车退款"), AJ_XLGM_GIFT("40",
            "线路消费送积分"), AJ_JDDF_GIFT("41", "酒店消费送积分"), AJ_ZXGM_GIFT("42",
            "专线消费送积分"), AJ_DBGM_GIFT("43", "大巴消费送积分"), AJ_CARPOOL_GIFT("44",
            "拼车消费送积分"), AJ_FBYJ("45", "发布游记送积分");

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
