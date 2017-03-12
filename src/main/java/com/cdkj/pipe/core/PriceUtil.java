package com.cdkj.pipe.core;

/**
 * 价格工具类
 * @author: myb858 
 * @since: 2017年2月24日 下午2:25:45 
 * @history:
 */
public class PriceUtil {
    /**
     * 计算拼车新增一人时增加的车价
     * @param distancePrice
     * @param rate
     * @return 
     * @create: 2017年2月24日 下午2:44:39 myb858
     * @history:
     */
    public static Long getOneAmount(Long distancePrice, String rate) {

        Double rate1 = Double.valueOf(rate);
        Long oneAmount = Double.valueOf(distancePrice * rate1).longValue();
        return oneAmount;
    }

    public static Long getDeposite(Long distancePrice, String rate) {
        Double rate1 = Double.valueOf(rate);
        Long deposite = Double.valueOf(distancePrice * rate1).longValue();
        return deposite;

    }

}
