package com.cdkj.pipe.bo.impl;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cdkj.pipe.bo.IAccountBO;
import com.cdkj.pipe.bo.ISYSConfigBO;
import com.cdkj.pipe.bo.IUserBO;
import com.cdkj.pipe.common.JsonUtil;
import com.cdkj.pipe.domain.Account;
import com.cdkj.pipe.dto.req.XN002000Req;
import com.cdkj.pipe.dto.req.XN002100Req;
import com.cdkj.pipe.dto.req.XN802182Req;
import com.cdkj.pipe.dto.res.XN002000Res;
import com.cdkj.pipe.dto.res.XN802182Res;
import com.cdkj.pipe.enums.EBizType;
import com.cdkj.pipe.enums.ECurrency;
import com.cdkj.pipe.enums.ESystemCode;
import com.cdkj.pipe.enums.ESystemUser;
import com.cdkj.pipe.exception.BizException;
import com.cdkj.pipe.http.BizConnecter;
import com.cdkj.pipe.http.JsonUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@Component
public class AccountBOImpl implements IAccountBO {
    static Logger logger = Logger.getLogger(AccountBOImpl.class);

    @Autowired
    private ISYSConfigBO sysConfigBO;

    @Autowired
    private IUserBO userBO;

    @Override
    public Account getRemoteAccount(String userId, ECurrency currency) {
        XN002000Req req = new XN002000Req();
        req.setUserId(userId);
        req.setCurrency(currency.getCode());
        String jsonStr = BizConnecter.getBizData("002000",
            JsonUtils.object2Json(req));
        Gson gson = new Gson();
        List<XN002000Res> list = gson.fromJson(jsonStr,
            new TypeToken<List<XN002000Res>>() {
            }.getType());
        if (CollectionUtils.isEmpty(list)) {
            throw new BizException("xn000000", "用户[" + userId + "]账户不存在");
        }
        XN002000Res res = list.get(0);
        Account account = new Account();
        account.setAccountNumber(res.getAccountNumber());
        account.setUserId(res.getUserId());
        account.setRealName(res.getRealName());
        account.setType(res.getType());
        account.setStatus(res.getStatus());

        account.setCurrency(res.getCurrency());
        account.setAmount(res.getAmount());
        account.setFrozenAmount(res.getFrozenAmount());
        account.setCreateDatetime(res.getCreateDatetime());
        account.setLastOrder(res.getLastOrder());

        account.setSystemCode(res.getSystemCode());
        return account;
    }

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
    public void doTransferAmountRemote(String fromUserId, String toUserId,
            ECurrency currency, Long amount, EBizType bizType,
            String fromBizNote, String toBizNote) {
        if (amount != null && amount != 0) {
            XN002100Req req = new XN002100Req();
            req.setFromUserId(fromUserId);
            req.setToUserId(toUserId);
            req.setCurrency(currency.getCode());
            req.setTransAmount(String.valueOf(amount));
            req.setBizType(bizType.getCode());
            req.setFromBizNote(fromBizNote);
            req.setToBizNote(toBizNote);
            BizConnecter.getBizData("002100", JsonUtils.object2Json(req),
                Object.class);
        }
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
