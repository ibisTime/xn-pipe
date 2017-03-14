package com.cdkj.pipe.ao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdkj.pipe.ao.IAssignAO;
import com.cdkj.pipe.bo.IAssignBO;
import com.cdkj.pipe.bo.base.Paginable;
import com.cdkj.pipe.domain.Assign;
import com.cdkj.pipe.exception.BizException;

@Service
public class AssignAOImpl implements IAssignAO {

    @Autowired
    private IAssignBO assignBO;

    @Override
    public String addAssign(Assign data) {
        return assignBO.saveAssign(data);
    }

    @Override
    public int editAssign(Assign data) {
        // if (!assignBO.isAssignExist(data.getCode())) {
        // throw new BizException("xn0000", "记录编号不存在");
        // }
        return assignBO.refreshAssign(data);
    }

    @Override
    public int dropAssign(String code) {
        if (!assignBO.isAssignExist(code)) {
            throw new BizException("xn0000", "记录编号不存在");
        }
        return assignBO.removeAssign(code);
    }

    @Override
    public Paginable<Assign> queryAssignPage(int start, int limit,
            Assign condition) {
        return assignBO.getPaginable(start, limit, condition);
    }

    @Override
    public List<Assign> queryAssignList(Assign condition) {
        return assignBO.queryAssignList(condition);
    }

    @Override
    public Assign getAssign(String code) {
        return assignBO.getAssign(code);
    }

    @Override
    public Assign getCurrentAssign(String userId) {
        return assignBO.getCurrentAssign(userId);
    }
}
