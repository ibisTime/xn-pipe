package com.cdkj.pipe.dao;

import java.util.List;

import com.cdkj.pipe.dao.base.IBaseDAO;
import com.cdkj.pipe.domain.Demand;

public interface IDemandDAO extends IBaseDAO<Demand> {
    String NAMESPACE = IDemandDAO.class.getName().concat(".");

    public int update(Demand data);

    public int updatePutOnOff(Demand data);

    public int updateTake(Demand data);

    public int updateAssign(Demand data);

    public int updateAssignReceive(Demand data);

    public int updateAssignReject(Demand data);

    public int updateCancel(Demand data);

    public int updateComplete(Demand data);

    public Long selectRangeDemandTotalCount(Demand condition);

    public List<Demand> selectRangeDemandList(Demand condition, int start,
            int count);
}
