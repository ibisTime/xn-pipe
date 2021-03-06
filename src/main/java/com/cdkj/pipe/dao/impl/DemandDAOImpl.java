package com.cdkj.pipe.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cdkj.pipe.dao.IDemandDAO;
import com.cdkj.pipe.dao.base.support.AMybatisTemplate;
import com.cdkj.pipe.domain.Demand;

@Repository("demandDAOImpl")
public class DemandDAOImpl extends AMybatisTemplate implements IDemandDAO {

    @Override
    public int insert(Demand data) {
        return super.insert(NAMESPACE.concat("insert_demand"), data);
    }

    @Override
    public int delete(Demand data) {
        return super.delete(NAMESPACE.concat("delete_demand"), data);
    }

    @Override
    public Demand select(Demand condition) {
        return super.select(NAMESPACE.concat("select_demand"), condition,
            Demand.class);
    }

    @Override
    public Long selectTotalCount(Demand condition) {
        return super.selectTotalCount(NAMESPACE.concat("select_demand_count"),
            condition);
    }

    @Override
    public List<Demand> selectList(Demand condition) {
        return super.selectList(NAMESPACE.concat("select_demand"), condition,
            Demand.class);
    }

    @Override
    public List<Demand> selectList(Demand condition, int start, int count) {
        return super.selectList(NAMESPACE.concat("select_demand"), start,
            count, condition, Demand.class);
    }

    @Override
    public int update(Demand data) {
        return super.update(NAMESPACE.concat("update_demand"), data);
    }

    @Override
    public int updatePutOnOff(Demand data) {
        return super.update(NAMESPACE.concat("update_putOnOff"), data);
    }

    @Override
    public int updateTake(Demand data) {
        return super.update(NAMESPACE.concat("update_take"), data);
    }

    @Override
    public int updateAssign(Demand data) {
        return super.update(NAMESPACE.concat("update_assign"), data);
    }

    @Override
    public int updateAssignReceive(Demand data) {
        return super.update(NAMESPACE.concat("update_assignReceive"), data);
    }

    @Override
    public int updateAssignReject(Demand data) {
        return super.update(NAMESPACE.concat("update_assignReject"), data);
    }

    @Override
    public int updateCancel(Demand data) {
        return super.update(NAMESPACE.concat("update_cancel"), data);
    }

    @Override
    public int updateComplete(Demand data) {
        return super.update(NAMESPACE.concat("update_complete"), data);
    }

    @Override
    public Long selectRangeDemandTotalCount(Demand condition) {
        return super.selectTotalCount(
            NAMESPACE.concat("select_rangeDemand_count"), condition);
    }

    @Override
    public List<Demand> selectRangeDemandList(Demand condition, int start,
            int count) {
        return super.selectList(NAMESPACE.concat("select_rangeDemand"), start,
            count, condition, Demand.class);
    }

}
