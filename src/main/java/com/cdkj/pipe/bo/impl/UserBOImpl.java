package com.cdkj.pipe.bo.impl;

import org.springframework.stereotype.Component;

import com.cdkj.pipe.bo.IUserBO;
import com.cdkj.pipe.common.PropertiesUtil;
import com.cdkj.pipe.dto.req.XN001400Req;
import com.cdkj.pipe.dto.req.XN805052Req;
import com.cdkj.pipe.dto.req.XN805172Req;
import com.cdkj.pipe.dto.req.XN805906Req;
import com.cdkj.pipe.dto.req.XN805920Req;
import com.cdkj.pipe.dto.req.XN805930Req;
import com.cdkj.pipe.dto.req.XN805931Req;
import com.cdkj.pipe.dto.res.XN001400Res;
import com.cdkj.pipe.dto.res.XN805042Res;
import com.cdkj.pipe.dto.res.XN805921Res;
import com.cdkj.pipe.dto.res.XN805930Res;
import com.cdkj.pipe.dto.res.XN805931Res;
import com.cdkj.pipe.enums.ESystemCode;
import com.cdkj.pipe.exception.BizException;
import com.cdkj.pipe.http.BizConnecter;
import com.cdkj.pipe.http.JsonUtils;

@Component
public class UserBOImpl implements IUserBO {

    @Override
    public XN001400Res getRemoteUser(String userId) {
        XN001400Req req = new XN001400Req();
        req.setTokenId(userId);
        req.setUserId(userId);
        XN001400Res res = BizConnecter.getBizData("001400",
            JsonUtils.object2Json(req), XN001400Res.class);
        if (res == null) {
            throw new BizException("XN000000", "编号为" + userId + "的用户不存在");
        }
        return res;
    }

    @Override
    public String doSaveDealer(String loginName, String updater) {
        XN805172Req req = new XN805172Req();
        req.setLoginName(loginName);
        req.setKind("f2");
        req.setRoleCode(PropertiesUtil.Config.DEALER_ROLECODE);
        req.setUpdater(updater);
        req.setSystemCode(ESystemCode.QNSDGZS.getCode());
        XN805042Res res = BizConnecter.getBizData("805172",
            JsonUtils.object2Json(req), XN805042Res.class);
        return res.getUserId();
    }

    /** 
     * @see com.cdkj.pipe.bo.IUserBO#doCancelUser(java.lang.String, java.lang.String)
     */
    @Override
    public void doCancelUser(String userId, String updater) {
        XN805052Req req = new XN805052Req();
        req.setUserId(userId);
        req.setUpdater(updater);
        req.setToStatus("2");// 人工锁定
        BizConnecter.getBizData("805052", JsonUtils.object2Json(req),
            Object.class);
    }

    /** 
     * @see com.cdkj.pipe.bo.IUserBO#doCheckLoginPwd(java.lang.String, java.lang.String)
     */
    @Override
    public void doCheckLoginPwd(String userId, String loginPwd) {
        XN805906Req req = new XN805906Req();
        req.setUserId(userId);
        req.setLoginPwd(loginPwd);
        req.setTokenId(userId);
        BizConnecter.getBizData("805906", JsonUtils.object2Json(req),
            Object.class);
    }

    @Override
    public void doAddToBlacklist(String userId, String type, String remark) {
        XN805920Req req = new XN805920Req();
        req.setUserId(userId);
        req.setType(type);
        req.setRemark(remark);
        req.setSystemCode(ESystemCode.QNSDGZS.getCode());
        BizConnecter.getBizData("805920", JsonUtils.object2Json(req),
            Object.class);
    }

    @Override
    public boolean doCheckBlacklist(String userId, String type) {
        XN805920Req req = new XN805920Req();
        req.setUserId(userId);
        req.setType(type);
        req.setSystemCode(ESystemCode.QNSDGZS.getCode());
        XN805921Res xn805921Res = BizConnecter.getBizData("805921",
            JsonUtils.object2Json(req), XN805921Res.class);
        return xn805921Res.isAdded();
    }

    /** 
     * @see com.cdkj.pipe.bo.IUserBO#signToday(java.lang.String, java.lang.String, java.lang.Long)
     */
    @Override
    public XN805931Res signToday(String userId, String location, Long amount) {
        XN805931Req req = new XN805931Req();
        req.setUserId(userId);
        req.setLocation(location);
        req.setAmount(amount.toString());
        return BizConnecter.getBizData("805931", JsonUtils.object2Json(req),
            XN805931Res.class);
    }

    @Override
    public XN805930Res doLoginReg(String code, Long amount, String systemCode) {
        XN805930Req req = new XN805930Req();
        req.setCode(code);
        req.setAmount(amount.toString());
        req.setCompanyCode(systemCode);
        req.setSystemCode(systemCode);
        XN805930Res res = BizConnecter.getBizData("805930",
            JsonUtils.object2Json(req), XN805930Res.class);
        String userId = res.getUserId();
        if (userId.contains("&reg")) {
            userId = userId.substring(0, userId.indexOf("&reg"));
            res.setAmount(amount.toString());
        }
        res.setUserId(userId);
        return res;
    }

    public static void main(String[] args) {
        String abc = "123&reg";
        String userIds = abc.substring(0, abc.indexOf("&reg"));
        System.out.println(userIds);
    }
}
