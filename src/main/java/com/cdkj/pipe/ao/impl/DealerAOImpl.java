package com.cdkj.pipe.ao.impl;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdkj.pipe.ao.IDealerAO;
import com.cdkj.pipe.api.converter.ReqConverter;
import com.cdkj.pipe.bo.IDealerBO;
import com.cdkj.pipe.bo.IUserBO;
import com.cdkj.pipe.bo.base.Paginable;
import com.cdkj.pipe.domain.Dealer;
import com.cdkj.pipe.dto.req.XN619000Req;
import com.cdkj.pipe.dto.req.XN619001Req;
import com.cdkj.pipe.enums.EDealerStatus;
import com.cdkj.pipe.exception.BizException;

@Service
public class DealerAOImpl implements IDealerAO {

    @Autowired
    private IDealerBO dealerBO;

    @Autowired
    private IUserBO userBO;

    @Override
    public String addDealer(XN619000Req req) {
        // 分配管理端用户
        String userId = userBO.doSaveDealer(req.getLoginName(),
            req.getUpdater());
        // 新增经销商
        Dealer dealer = ReqConverter.converter(req);
        dealer.setUserId(userId);
        return dealerBO.saveDealer(dealer);
    }

    @Override
    public int platEditDealer(XN619001Req req) {
        if (!dealerBO.isDealerExist(req.getCode())) {
            throw new BizException("xn0000", "经销商编号不存在");
        }
        Dealer dealer = ReqConverter.converter(req);
        return dealerBO.platEdit(dealer);
    }

    @Override
    public int putOn(String code, String updater, String remark) {
        Dealer dealer = dealerBO.getDealer(code);
        if (EDealerStatus.PUT_ON.getCode().equals(dealer.getStatus())) {
            throw new BizException("xn0000", "经销商已经处于上架状态，不允许进行上架操作");
        } else {
            return dealerBO.putOn(code, updater, remark);
        }
    }

    @Override
    public int putOff(String code, String updater, String remark) {
        Dealer dealer = dealerBO.getDealer(code);
        if (EDealerStatus.PUT_ON.getCode().equals(dealer.getStatus())) {
            return dealerBO.putOff(code, updater, remark);
        } else {
            throw new BizException("xn0000", "经销商已经不处于上架状态，不允许进行下架操作");
        }

    }

    @Override
    public int selfEditDealer(String code, String mobile, String pic,
            String detail, String updater, String remark) {
        if (!dealerBO.isDealerExist(code)) {
            throw new BizException("xn0000", "经销商编号不存在");
        }
        return dealerBO.selfEdit(code, mobile, pic, detail, updater, remark);
    }

    @Override
    public Paginable<Dealer> queryDealerPage(int start, int limit,
            Dealer condition) {
        return dealerBO.getPaginable(start, limit, condition);
    }

    @Override
    public List<Dealer> queryDealerList(Dealer condition) {
        return dealerBO.queryDealerList(condition);
    }

    @Override
    public Dealer getDealer(String code) {
        return dealerBO.getDealer(code);
    }

    @Override
    public Dealer getDealerByUserId(String userId) {
        Dealer condition = new Dealer();
        condition.setUserId(userId);
        List<Dealer> results = dealerBO.queryDealerList(condition);
        if (CollectionUtils.isEmpty(results)) {
            throw new BizException("xn0000", "对应的经销商不存在");
        }
        return results.get(0);
    }

}
