package com.cdkj.pipe.ao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdkj.pipe.ao.IAssignAO;
import com.cdkj.pipe.bo.IAssignBO;
import com.cdkj.pipe.bo.IDemandBO;
import com.cdkj.pipe.bo.IDemandOrderBO;
import com.cdkj.pipe.bo.IHearBO;
import com.cdkj.pipe.bo.base.Paginable;
import com.cdkj.pipe.domain.Assign;
import com.cdkj.pipe.domain.Demand;
import com.cdkj.pipe.enums.EDemandOrderType;

@Service
public class AssignAOImpl implements IAssignAO {

    @Autowired
    private IAssignBO assignBO;

    @Autowired
    private IDemandBO demandBO;

    @Autowired
    private IDemandOrderBO demandOrderBO;

    @Autowired
    private IHearBO hearBO;

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

    @Override
    @Transactional
    public void reveive(String userId) {

        Assign assign = assignBO.getCurrentAssign(userId);
        Demand demand = demandBO.getDemand(assign.getDemandCode());

        // 修改派单记录
        assignBO.assignReceive(assign);

        // 修改听单状态
        hearBO.assignReceive(userId);

        // 修改需求状态
        demandBO.assignReceive(assign.getDemandCode(), userId);

        // 形成需求订单
        demandOrderBO.saveDemandOrder(EDemandOrderType.RECEIVE.getCode(),
            assign.getDemandCode(), demand.getDealerCode(), userId, "订单进行中");
    }

    @Override
    public void reject(String userId) {
        Assign assign = assignBO.getCurrentAssign(userId);

        // 修改派单记录
        assignBO.assignReject(assign);

        // 修改听单状态
        hearBO.assignReject(userId);

        // 修改需求状态
        demandBO.assignReject(assign.getDemandCode(), userId);
    }
}
