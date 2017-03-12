package com.cdkj.pipe.bo.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cdkj.pipe.bo.IDealerBO;
import com.cdkj.pipe.bo.base.PaginableBOImpl;
import com.cdkj.pipe.dao.IDealerDAO;
import com.cdkj.pipe.domain.Dealer;
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
            // code = OrderNoGenerater.generateM(EGeneratePrefix.CT.getCode());
            data.setCode(code);
            dealerDAO.insert(data);
        }
        return code;
    }

    @Override
    public int removeDealer(String code) {
        int count = 0;
        if (StringUtils.isNotBlank(code)) {
            Dealer data = new Dealer();
            data.setCode(code);
            count = dealerDAO.delete(data);
        }
        return count;
    }

    @Override
    public int refreshDealer(Dealer data) {
        int count = 0;
        if (StringUtils.isNotBlank(data.getCode())) {
            // count = dealerDAO.update(data);
        }
        return count;
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
