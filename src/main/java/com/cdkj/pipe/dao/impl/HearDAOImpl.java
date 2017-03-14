package com.cdkj.pipe.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cdkj.pipe.dao.IHearDAO;
import com.cdkj.pipe.dao.base.support.AMybatisTemplate;
import com.cdkj.pipe.domain.Hear;

@Repository("hearDAOImpl")
public class HearDAOImpl extends AMybatisTemplate implements IHearDAO {

    @Override
    public int insert(Hear data) {
        return super.insert(NAMESPACE.concat("insert_hear"), data);
    }

    @Override
    public int delete(Hear data) {
        return super.delete(NAMESPACE.concat("delete_hear"), data);
    }

    @Override
    public Hear select(Hear condition) {
        return super.select(NAMESPACE.concat("select_hear"), condition,
            Hear.class);
    }

    @Override
    public Long selectTotalCount(Hear condition) {
        return super.selectTotalCount(NAMESPACE.concat("select_hear_count"),
            condition);
    }

    @Override
    public List<Hear> selectList(Hear condition) {
        return super.selectList(NAMESPACE.concat("select_hear"), condition,
            Hear.class);
    }

    @Override
    public List<Hear> selectList(Hear condition, int start, int count) {
        return super.selectList(NAMESPACE.concat("select_hear"), start, count,
            condition, Hear.class);
    }

    @Override
    public int updateStartHear(Hear data) {
        return super.update(NAMESPACE.concat("update_startHear"), data);
    }

    @Override
    public int updateStopHear(Hear data) {
        return super.update(NAMESPACE.concat("update_stopHear"), data);
    }

}
