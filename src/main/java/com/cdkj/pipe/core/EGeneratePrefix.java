package com.cdkj.pipe.core;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: xieyj 
 * @since: 2016年5月24日 上午8:29:02 
 * @history:
 */
public enum EGeneratePrefix {
    HOTAL("H", "酒店"), HOTAL_ROOM("HR", "房间"), HOTAL_ORDER("HO", "酒店订单"), COMMENT(
            "C", "评论"), INTERACT("I", "互动"), FOOD("F", "美食"), ACTIVITY("A",
            "活动"), FEELBACK("F", "投诉/反馈"), LINE("L", "线路"), lINE_TAB("LT",
            "线路TAB"), LINE_COM("LC", "路线推荐"), GUIDE("G", "攻略"), TRAVELS("T",
            "游记"), SPECIAL_LINE("SL", "专线"), OUT_ORDER("UO", "出行订单"), LINE_ORDER(
            "LO", "路线订单"), PAY_NO("PN", "支付订单号"), BUS("BS", "大巴订单"), KEYWORD(
            "KW", "关键字"), CARPOOL("CP", "拼车"), CARPOOL_ORDER("CO", "拼车订单"), CATEGORY(
            "FL", "分类"), PRODUCT("CP", "产品"), CART("GW", "购物车"), ORDER("DD",
            "定单"), PRODUCT_ORDER("CD", "产品订单"), PAY_GROUP("PG", "支付订单号"), BOOK_HOTAL(
            "BH", "预订编号");

    public static Map<String, EGeneratePrefix> getOrderTypeMap() {
        Map<String, EGeneratePrefix> map = new HashMap<String, EGeneratePrefix>();
        for (EGeneratePrefix orderType : EGeneratePrefix.values()) {
            map.put(orderType.getCode(), orderType);
        }
        return map;
    }

    EGeneratePrefix(String code, String value) {
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
