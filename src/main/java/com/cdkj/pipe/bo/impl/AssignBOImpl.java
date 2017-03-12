package com.cdkj.pipe.bo.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cdkj.pipe.bo.IAssignBO;
import com.cdkj.pipe.bo.base.PaginableBOImpl;
import com.cdkj.pipe.dao.IAssignDAO;
import com.cdkj.pipe.domain.Assign;
import com.cdkj.pipe.exception.BizException;

@Component
public class AssignBOImpl extends PaginableBOImpl<Assign> implements IAssignBO {

    @Autowired
    private IAssignDAO assignDAO;

    @Override
    public boolean isAssignExist(String code) {
        Assign condition = new Assign();
        // condition.setCode(code);
        if (assignDAO.selectTotalCount(condition) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public String saveAssign(Assign data) {
        String code = null;
        if (data != null) {
            // code = OrderNoGenerater.generateM(EGeneratePrefix.CT.getCode());
            // data.setCode(code);
            assignDAO.insert(data);
        }
        return code;
    }

    @Override
    public int removeAssign(String code) {
        int count = 0;
        if (StringUtils.isNotBlank(code)) {
            Assign data = new Assign();
            // data.setCode(code);
            count = assignDAO.delete(data);
        }
        return count;
    }

    @Override
    public int refreshAssign(Assign data) {
        int count = 0;
        // if (StringUtils.isNotBlank(data.getCode())) {
        // count = assignDAO.update(data);
        // }
        return count;
    }

    @Override
    public List<Assign> queryAssignList(Assign condition) {
        return assignDAO.selectList(condition);
    }

    @Override
    public Assign getAssign(String code) {
        Assign data = null;
        if (StringUtils.isNotBlank(code)) {
            Assign condition = new Assign();
            // condition.setCode(code);
            data = assignDAO.select(condition);
            if (data == null) {
                throw new BizException("xn0000", "记录不存在");
            }
        }
        return data;
    }
}
