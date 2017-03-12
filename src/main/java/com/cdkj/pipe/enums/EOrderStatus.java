package com.cdkj.pipe.enums;

/**
 * 除拼车记录/拼车订单外本系统所有订单的状态图（酒店/商品/大巴/班车/线路共5种订单）
 * @author: myb858 
 * @since: 2017年2月26日 上午9:44:32 
 * @history:
 */
public enum EOrderStatus {
    TO_PAY("0", "待支付"), USER_CANCEL("91", "最终状态-用户不支付取消订单"), OVERDUE_CANCEL(
            "92", "最终状态-过期取消订单"), PAY_YES("1", "已支付"), PLAT_CANCEL("93",
            "最终状态-平台取消订单"), TO_REFUND("2", "待退款"), REFUND_YES("94", "最终状态-退款成功"), REFUND_NO(
            "31", "退款失败(已第一次确认)"), WILL_DONE("32", "第一次确认"), DONE("4", "已完成");

    EOrderStatus(String code, String value) {
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
