/**
 * @Title IAccountBO.java 
 * @Package com.ibis.account.bo 
 * @Description 
 * @author miyb  
 * @date 2015-3-15 下午3:15:49 
 * @version V1.0   
 */
package com.cdkj.pipe.bo;

import com.cdkj.pipe.dto.res.XN802182Res;
import com.cdkj.pipe.enums.EBizType;
import com.cdkj.pipe.enums.ECurrency;

/** 
 * @author: miyb 
 * @since: 2015-3-15 下午3:15:49 
 * @history:
 */
public interface IAccountBO {

    /**
     * 账户之间转账
     * @param fromUserId 从谁
     * @param toUserId 到谁
     * @param amount 支付多少钱
     * @param currency 什么币种
     * @param payGroup 支付组号
     * @param bizType 因为什么
     * @return 
     * @create: 2017年2月26日 下午2:11:24 myb858
     * @history:
     */
    public XN802182Res doTransferAmount(String fromUserId, String toUserId,
            Long amount, ECurrency currency, String payGroup, EBizType bizType);

    /**
     * 微信H5支付
     * @param userId 谁
     * @param amount 支付多少钱
     * @param payGroup 支付组号
     * @param bizType 因为什么
     * @return 
     * @create: 2017年2月23日 下午8:08:46 myb858
     * @history:
     */
    public XN802182Res doWeiXinPayH5(String userId, Long amount,
            String payGroup, EBizType bizType);

    /**
     * 用户在平台支付，并顺利完成订单送积分
     * @param userId 用户编号
     * @param payAmount 消费金额
     * @param bizType 消费类型
     * @create: 2017年3月5日 下午6:17:27 haiqingzheng
     * @history:
     */
    public void doGivePresent(String userId, Long payAmount, String payGroup,
            EBizType bizType);

}
