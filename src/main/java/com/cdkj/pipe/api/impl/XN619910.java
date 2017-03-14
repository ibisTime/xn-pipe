package com.cdkj.pipe.api.impl;

import com.cdkj.pipe.ao.ISYSConfigAO;
import com.cdkj.pipe.api.AProcessor;
import com.cdkj.pipe.common.JsonUtil;
import com.cdkj.pipe.core.StringValidater;
import com.cdkj.pipe.domain.SYSConfig;
import com.cdkj.pipe.dto.req.XN619910Req;
import com.cdkj.pipe.dto.res.PKIdRes;
import com.cdkj.pipe.exception.BizException;
import com.cdkj.pipe.exception.ParaException;
import com.cdkj.pipe.spring.SpringContextHolder;

/**
 * 新增系统参数
 * @author: xieyj 
 * @since: 2016年9月17日 下午1:51:37 
 * @history:
 */
public class XN619910 extends AProcessor {

    private ISYSConfigAO sysConfigAO = SpringContextHolder
        .getBean(ISYSConfigAO.class);

    private XN619910Req req = null;

    @Override
    public Object doBusiness() throws BizException {
        SYSConfig data = new SYSConfig();
        data.setType(req.getType());
        data.setCkey(req.getCkey());
        data.setCvalue(req.getCvalue());
        data.setUpdater(req.getUpdater());
        data.setRemark(req.getRemark());
        return new PKIdRes(sysConfigAO.addSYSConfig(data));
    }

    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN619910Req.class);
        StringValidater.validateBlank(req.getType(), req.getCkey(),
            req.getCvalue(), req.getUpdater());

    }

}
