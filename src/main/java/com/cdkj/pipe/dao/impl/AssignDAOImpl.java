package com.cdkj.pipe.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cdkj.pipe.dao.IAssignDAO;
import com.cdkj.pipe.dao.base.support.AMybatisTemplate;
import com.cdkj.pipe.domain.Assign;

@Repository("assignDAOImpl")
public class AssignDAOImpl extends AMybatisTemplate implements IAssignDAO {

    @Override
    public int insert(Assign data) {
        return super.insert(NAMESPACE.concat("insert_assign"), data);
    }

    @Override
    public int delete(Assign data) {
        return super.delete(NAMESPACE.concat("delete_assign"), data);
    }

    @Override
    public Assign select(Assign condition) {
        return super.select(NAMESPACE.concat("select_assign"), condition,
            Assign.class);
    }

    @Override
    public Long selectTotalCount(Assign condition) {
        return super.selectTotalCount(NAMESPACE.concat("select_assign_count"),
            condition);
    }

    @Override
    public List<Assign> selectList(Assign condition) {
        return super.selectList(NAMESPACE.concat("select_assign"), condition,
            Assign.class);
    }

    @Override
    public List<Assign> selectList(Assign condition, int start, int count) {
        return super.selectList(NAMESPACE.concat("select_assign"), start,
            count, condition, Assign.class);
    }

    @Override
    public int updateAssignReceive(Assign data) {
        return super.update(NAMESPACE.concat("update_assignReceive"), data);
    }

    @Override
    public int updateAssignReject(Assign data) {
        return super.update(NAMESPACE.concat("update_assignReject"), data);
    }

}
