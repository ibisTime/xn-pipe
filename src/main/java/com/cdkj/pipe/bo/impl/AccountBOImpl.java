package com.cdkj.pipe.bo.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cdkj.pipe.bo.IAccountBO;
import com.cdkj.pipe.bo.ISYSConfigBO;
import com.cdkj.pipe.bo.IUserBO;
import com.cdkj.pipe.common.JsonUtil;
import com.cdkj.pipe.dto.req.XN802182Req;
import com.cdkj.pipe.dto.req.XN802517Req;
import com.cdkj.pipe.dto.res.XN802182Res;
import com.cdkj.pipe.enums.EBizType;
import com.cdkj.pipe.enums.ECurrency;
import com.cdkj.pipe.enums.ESystemCode;
import com.cdkj.pipe.enums.ESystemUser;
import com.cdkj.pipe.exception.BizException;
import com.cdkj.pipe.http.BizConnecter;
import com.cdkj.pipe.http.JsonUtils;

@Component
public class AccountBOImpl implements IAccountBO {
    static Logger logger = Logger.getLogger(AccountBOImpl.class);

    @Autowired
    private ISYSConfigBO sysConfigBO;

    @Autowired
    private IUserBO userBO;

    @Override
    public XN802182Res doWeiXinPayH5(String userId, Long amount,
            String payGroup, EBizType bizType) {
        if (amount.longValue() == 0l) {
            throw new BizException("xn000000", "支付金额为零，不能使用微信支付");
        }
        // 获取微信APP支付信息
        XN802182Req req = new XN802182Req();
        req.setSystemCode(ESystemCode.QNSDGZS.getCode());
        req.setCompanyCode(ESystemCode.QNSDGZS.getCode());
        req.setFromUserId(userId);
        req.setToUserId(ESystemUser.SYS_USER.getCode());
        req.setTransAmount(String.valueOf(amount));

        req.setCurrency(ECurrency.CNY.getCode());
        req.setPayGroup(payGroup);
        req.setBizType(bizType.getCode());
        req.setBizNote(bizType.getValue());
        XN802182Res res = BizConnecter.getBizData("802182",
            JsonUtil.Object2Json(req), XN802182Res.class);
        return res;
    }

    @Override
    public XN802182Res doTransferAmount(String fromUserId, String toUserId,
            Long amount, ECurrency currency, String payGroup, EBizType bizType) {
        if (amount != null && amount != 0) {
            XN802517Req req = new XN802517Req();
            req.setSystemCode(ESystemCode.QNSDGZS.getCode());
            req.setCompanyCode(ESystemCode.QNSDGZS.getCode());
            req.setFromUserId(fromUserId);
            req.setToUserId(toUserId);
            req.setTransAmount(String.valueOf(amount));

            req.setCurrency(currency.getCode());
            req.setPayGroup(payGroup);
            req.setBizType(bizType.getCode());
            req.setBizNote(bizType.getValue());
            BizConnecter.getBizData("802517", JsonUtils.object2Json(req),
                Object.class);
        }
        return null;
    }

    @Override
    public void doGivePresent(String userId, Long payAmount, String payGroup,
            EBizType bizType) {
        // Long giveAmount = 0L;
        // Long perAmount = getPerAmount(bizType);
        // if (perAmount > 0L) {
        // giveAmount = (payAmount / perAmount) * 1000;
        // }
        // if (giveAmount > 0) {
        // this.doTransferAmount(ESystemUser.SYS_USER.getCode(), userId,
        // giveAmount, ECurrency.XNB, payGroup, bizType);
        // }
    }

    // private Long getPerAmount(EBizType bizType) {
    // Long perAmount = 0L;
    // SYSConfig sysConfig = null;
    // // 线路消费送积分
    // if (bizType.equals(EBizType.AJ_XLGM_GIFT)) {
    // sysConfig = sysConfigBO.getConfig(SysConstants.PER_CNY_TO_XNB_LINE);
    // // 酒店消费送积分
    // } else if (bizType.equals(EBizType.AJ_JDDF_GIFT)) {
    // sysConfig = sysConfigBO
    // .getConfig(SysConstants.PER_CNY_TO_XNB_HOTAL);
    // // 专线消费送积分
    // } else if (bizType.equals(EBizType.AJ_ZXGM_GIFT)) {
    // sysConfig = sysConfigBO
    // .getConfig(SysConstants.PER_CNY_TO_XNB_SLINE);
    // // 大巴消费送积分
    // } else if (bizType.equals(EBizType.AJ_DBGM_GIFT)) {
    // sysConfig = sysConfigBO.getConfig(SysConstants.PER_CNY_TO_XNB_BUS);
    // // 拼车消费送积分
    // } else if (bizType.equals(EBizType.AJ_CARPOOL_GIFT)) {
    // sysConfig = sysConfigBO.getConfig(SysConstants.PER_CNY_TO_XNB_CAR);
    // }
    // if (sysConfig != null && StringUtils.isNotBlank(sysConfig.getCvalue())) {
    // perAmount = CalculationUtil.multByConfig(sysConfig.getCvalue());
    // }
    // return perAmount;
    // }
}
