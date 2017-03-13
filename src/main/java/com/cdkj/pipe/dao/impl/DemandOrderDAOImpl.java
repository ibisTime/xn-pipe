package com.cdkj.pipe.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cdkj.pipe.dao.IDemandOrderDAO;
import com.cdkj.pipe.dao.base.support.AMybatisTemplate;
import com.cdkj.pipe.domain.DemandOrder;

@Repository("demandOrderDAOImpl")
public class DemandOrderDAOImpl extends AMybatisTemplate implements
        IDemandOrderDAO {

    @Override
    public int insert(DemandOrder data) {
        return super.insert(NAMESPACE.concat("insert_demandOrder"), data);
    }

    @Override
    public int delete(DemandOrder data) {
        return super.delete(NAMESPACE.concat("delete_demandOrder"), data);
    }

    @Override
    public DemandOrder select(DemandOrder condition) {
        return super.select(NAMESPACE.concat("select_demandOrder"), condition,
            DemandOrder.class);
    }

    @Override
    public Long selectTotalCount(DemandOrder condition) {
        return super.selectTotalCount(
            NAMESPACE.concat("select_demandOrder_count"), condition);
    }

    @Override
    public List<DemandOrder> selectList(DemandOrder condition) {
        return super.selectList(NAMESPACE.concat("select_demandOrder"),
            condition, DemandOrder.class);
    }

    @Override
    public List<DemandOrder> selectList(DemandOrder condition, int start,
            int count) {
        return super.selectList(NAMESPACE.concat("select_demandOrder"), start,
            count, condition, DemandOrder.class);
    }

    @Override
    public int updateComplete(DemandOrder data) {
        return super.update(NAMESPACE.concat("update_complete"), data);
    }

    @Override
    public int updateUserCancel(DemandOrder data) {
        return super.update(NAMESPACE.concat("update_userCancel"), data);
    }

    @Override
    public int updateDealerCancel(DemandOrder data) {
        return super.update(NAMESPACE.concat("update_dealerCancel"), data);
    }

}
