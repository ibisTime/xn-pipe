package com.cdkj.pipe.ao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdkj.pipe.ao.IHearAO;
import com.cdkj.pipe.bo.IHearBO;
import com.cdkj.pipe.bo.base.Paginable;
import com.cdkj.pipe.domain.Hear;
import com.cdkj.pipe.exception.BizException;

@Service
public class HearAOImpl implements IHearAO {

    @Autowired
    private IHearBO hearBO;

    @Override
    public String addHear(Hear data) {
        return hearBO.saveHear(data);
    }

    @Override
    public int editHear(Hear data) {
        // if (!hearBO.isHearExist(data.getCode())) {
        // throw new BizException("xn0000", "记录编号不存在");
        // }
        return hearBO.refreshHear(data);
    }

    @Override
    public int dropHear(String code) {
        if (!hearBO.isHearExist(code)) {
            throw new BizException("xn0000", "记录编号不存在");
        }
        return hearBO.removeHear(code);
    }

    @Override
    public Paginable<Hear> queryHearPage(int start, int limit, Hear condition) {
        return hearBO.getPaginable(start, limit, condition);
    }

    @Override
    public List<Hear> queryHearList(Hear condition) {
        return hearBO.queryHearList(condition);
    }

    @Override
    public Hear getHear(String code) {
        return hearBO.getHear(code);
    }
}
