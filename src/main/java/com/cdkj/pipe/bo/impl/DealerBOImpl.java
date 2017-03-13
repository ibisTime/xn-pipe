package com.cdkj.pipe.bo.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cdkj.pipe.bo.IDealerBO;
import com.cdkj.pipe.bo.base.PaginableBOImpl;
import com.cdkj.pipe.core.EGeneratePrefix;
import com.cdkj.pipe.core.OrderNoGenerater;
import com.cdkj.pipe.dao.IDealerDAO;
import com.cdkj.pipe.domain.Dealer;
import com.cdkj.pipe.enums.EDealerStatus;
import com.cdkj.pipe.exception.BizException;

@Component
public class DealerBOImpl extends PaginableBOImpl<Dealer> implements IDealerBO {

    @Autowired
    private IDealerDAO dealerDAO;

    @Override
    public boolean isDealerExist(String code) {
        Dealer condition = new Dealer();
        condition.setCode(code);
        if (dealerDAO.selectTotalCount(condition) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public String saveDealer(Dealer data) {
        String code = null;
        if (data != null) {
            code = OrderNoGenerater.generateM(EGeneratePrefix.DEALER.getCode());
            data.setCode(code);
            Date now = new Date();
            data.setCreateDatetime(now);
            data.setUpdateDatetime(now);
            data.setStatus(EDealerStatus.NEW.getCode());
            data.setRemark(EDealerStatus.NEW.getValue());
            dealerDAO.insert(data);
        }
        return code;
    }

    @Override
    public int platEdit(Dealer data) {
        int count = 0;
        if (StringUtils.isNotBlank(data.getCode())) {
            data.setUpdateDatetime(new Date());
            count = dealerDAO.platEdit(data);
        }
        return count;
    }

    @Override
    public int putOn(String code, String updater, String remark) {
        Dealer data = new Dealer();
        data.setCode(code);
        data.setUpdater(updater);
        data.setUpdateDatetime(new Date());
        data.setRemark(remark);
        data.setStatus(EDealerStatus.PUT_ON.getCode());
        return dealerDAO.update_putOnOff(data);
    }

    @Override
    public int putOff(String code, String updater, String remark) {
        Dealer data = new Dealer();
        data.setCode(code);
        data.setUpdater(updater);
        data.setUpdateDatetime(new Date());
        data.setRemark(remark);
        data.setStatus(EDealerStatus.PUT_OFF.getCode());
        return dealerDAO.update_putOnOff(data);
    }

    @Override
    public int selfEdit(String code, String mobile, String pic, String detail,
            String updater, String remark) {
        Dealer data = new Dealer();
        data.setCode(code);
        data.setMobile(mobile);
        data.setPic(pic);
        data.setDetail(detail);
        data.setUpdater(updater);
        data.setUpdateDatetime(new Date());
        return dealerDAO.selfEdit(data);
    }

    @Override
    public List<Dealer> queryDealerList(Dealer condition) {
        return dealerDAO.selectList(condition);
    }

    @Override
    public Dealer getDealer(String code) {
        Dealer data = null;
        if (StringUtils.isNotBlank(code)) {
            Dealer condition = new Dealer();
            condition.setCode(code);
            data = dealerDAO.select(condition);
            if (data == null) {
                throw new BizException("xn0000", "记录不存在");
            }
        }
        return data;
    }

}
