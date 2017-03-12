package com.cdkj.pipe.bo.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cdkj.pipe.bo.IHearBO;
import com.cdkj.pipe.bo.base.PaginableBOImpl;
import com.cdkj.pipe.dao.IHearDAO;
import com.cdkj.pipe.domain.Hear;
import com.cdkj.pipe.exception.BizException;

@Component
public class HearBOImpl extends PaginableBOImpl<Hear> implements IHearBO {

    @Autowired
    private IHearDAO hearDAO;

    @Override
    public boolean isHearExist(String code) {
        Hear condition = new Hear();
        // condition.setCode(code);
        if (hearDAO.selectTotalCount(condition) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public String saveHear(Hear data) {
        String code = null;
        if (data != null) {
            // code = OrderNoGenerater.generateM(EGeneratePrefix.CT.getCode());
            // data.setCode(code);
            hearDAO.insert(data);
        }
        return code;
    }

    @Override
    public int removeHear(String code) {
        int count = 0;
        if (StringUtils.isNotBlank(code)) {
            Hear data = new Hear();
            // data.setCode(code);
            count = hearDAO.delete(data);
        }
        return count;
    }

    @Override
    public int refreshHear(Hear data) {
        int count = 0;
        // if (StringUtils.isNotBlank(data.getCode())) {
        // count = hearDAO.update(data);
        // }
        return count;
    }

    @Override
    public List<Hear> queryHearList(Hear condition) {
        return hearDAO.selectList(condition);
    }

    @Override
    public Hear getHear(String code) {
        Hear data = null;
        if (StringUtils.isNotBlank(code)) {
            Hear condition = new Hear();
            // condition.setCode(code);
            data = hearDAO.select(condition);
            if (data == null) {
                throw new BizException("xn0000", "记录不存在");
            }
        }
        return data;
    }
}
