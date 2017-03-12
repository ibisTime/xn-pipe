package com.cdkj.pipe.bo.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.cdkj.pipe.bo.ISmsOutBO;
import com.cdkj.pipe.dto.req.XN805905Req;
import com.cdkj.pipe.http.BizConnecter;
import com.cdkj.pipe.http.JsonUtils;

/** 
 * @author: xieyj 
 * @since: 2016年5月25日 上午8:15:46 
 * @history:
 */
@Component
public class SmsOutBOImpl implements ISmsOutBO {
    static Logger logger = Logger.getLogger(SmsOutBOImpl.class);

    @Override
    public void sentContent(String userId, String content) {
        try {
            XN805905Req req = new XN805905Req();
            req.setTokenId(userId);
            req.setOwnerId(userId);
            req.setContent(content);
            BizConnecter.getBizData("805905", JsonUtils.object2Json(req),
                Object.class);
        } catch (Exception e) {
            logger.error("调用短信发送服务异常");
        }

    }

    @Override
    public void qunSent(List<String> userList, String notice) {
        for (String userId : userList) {
            this.sentContent(userId, notice);
        }
    }
}
