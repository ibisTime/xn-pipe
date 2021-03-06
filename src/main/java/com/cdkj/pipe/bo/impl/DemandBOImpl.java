package com.cdkj.pipe.bo.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cdkj.pipe.bo.IDemandBO;
import com.cdkj.pipe.bo.base.Page;
import com.cdkj.pipe.bo.base.Paginable;
import com.cdkj.pipe.bo.base.PaginableBOImpl;
import com.cdkj.pipe.core.EGeneratePrefix;
import com.cdkj.pipe.core.OrderNoGenerater;
import com.cdkj.pipe.dao.IDemandDAO;
import com.cdkj.pipe.domain.Demand;
import com.cdkj.pipe.enums.EDealerStatus;
import com.cdkj.pipe.enums.EDemandStatus;
import com.cdkj.pipe.exception.BizException;

@Component
public class DemandBOImpl extends PaginableBOImpl<Demand> implements IDemandBO {

    @Autowired
    private IDemandDAO demandDAO;

    @Override
    public boolean isDemandExist(String code) {
        Demand condition = new Demand();
        condition.setCode(code);
        if (demandDAO.selectTotalCount(condition) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public String saveDemand(Demand data) {
        String code = null;
        if (data != null) {
            Date now = new Date();
            code = OrderNoGenerater.generateM(EGeneratePrefix.DEMAND.getCode());
            data.setCode(code);
            data.setCreateDatetime(now);
            data.setUpdateDatetime(now);
            data.setStatus(EDealerStatus.NEW.getCode());
            demandDAO.insert(data);
        }
        return code;
    }

    @Override
    public int removeDemand(String code) {
        int count = 0;
        if (StringUtils.isNotBlank(code)) {
            Demand data = new Demand();
            data.setCode(code);
            count = demandDAO.delete(data);
        }
        return count;
    }

    @Override
    public int refreshDemand(Demand data) {
        int count = 0;
        if (StringUtils.isNotBlank(data.getCode())) {
            data.setUpdateDatetime(new Date());
            count = demandDAO.update(data);
        }
        return count;
    }

    @Override
    public int putOn(String code, String updater, String remark) {
        Demand data = new Demand();
        data.setCode(code);
        data.setUpdater(updater);
        data.setUpdateDatetime(new Date());
        data.setRemark(remark);
        data.setStatus(EDealerStatus.PUT_ON.getCode());
        return demandDAO.updatePutOnOff(data);
    }

    @Override
    public int putOff(String code, String updater, String remark) {
        Demand data = new Demand();
        data.setCode(code);
        data.setUpdater(updater);
        data.setUpdateDatetime(new Date());
        data.setRemark(remark);
        data.setStatus(EDealerStatus.PUT_OFF.getCode());
        return demandDAO.updatePutOnOff(data);
    }

    @Override
    public List<Demand> queryDemandList(Demand condition) {
        return demandDAO.selectList(condition);
    }

    @Override
    public Demand getDemand(String code) {
        Demand data = null;
        if (StringUtils.isNotBlank(code)) {
            Demand condition = new Demand();
            condition.setCode(code);
            data = demandDAO.select(condition);
            if (data == null) {
                throw new BizException("xn0000", "需求编号不存在");
            }
        }
        return data;
    }

    @Override
    public int take(String code, String userId) {
        Demand data = new Demand();
        data.setStatus(EDemandStatus.RECEIVE.getCode());
        data.setCode(code);
        data.setUpdater(userId);
        data.setUpdateDatetime(new Date());
        data.setRemark("用户接单");
        return demandDAO.updateTake(data);
    }

    @Override
    public void assign(String code, String updater) {
        Demand data = new Demand();
        data.setStatus(EDemandStatus.ASSIGN.getCode());
        data.setCode(code);
        data.setUpdater(updater);
        data.setUpdateDatetime(new Date());
        data.setRemark("已派单，等待水电工处理");
        demandDAO.updateAssign(data);
    }

    @Override
    public void assignReceive(String code, String userId) {
        Demand data = new Demand();
        data.setStatus(EDemandStatus.RECEIVE.getCode());
        data.setCode(code);
        data.setUpdater(userId);
        data.setUpdateDatetime(new Date());
        data.setRemark("经销商派单，用户已接单");
        demandDAO.updateAssignReceive(data);
    }

    @Override
    public void assignReject(String code, String userId) {
        Demand data = new Demand();
        data.setStatus(EDemandStatus.PUT_ON.getCode());
        data.setCode(code);
        data.setUpdater(userId);
        data.setUpdateDatetime(new Date());
        data.setRemark("经销商派单，用户拒绝接单");
        demandDAO.updateAssignReceive(data);
    }

    @Override
    public void cancel(String code, String userId) {
        Demand data = new Demand();
        data.setStatus(EDemandStatus.CANCEL.getCode());
        data.setCode(code);
        data.setUpdater(userId);
        data.setUpdateDatetime(new Date());
        data.setRemark("需求订单被取消");
        demandDAO.updateCancel(data);
    }

    @Override
    public void complete(String code, String userId) {
        Demand data = new Demand();
        data.setStatus(EDemandStatus.FINISH.getCode());
        data.setCode(code);
        data.setUpdater(userId);
        data.setUpdateDatetime(new Date());
        data.setRemark("需求订单已完成");
        demandDAO.updateComplete(data);
    }

    @Override
    public Paginable<Demand> queryRangeDemandPage(int start, int limit,
            Demand condition) {
        long totalCount = demandDAO.selectRangeDemandTotalCount(condition);

        Paginable<Demand> page = new Page<Demand>(start, limit, totalCount);

        List<Demand> dataList = demandDAO.selectRangeDemandList(condition,
            page.getStart(), page.getPageSize());

        page.setList(dataList);
        return page;
    }

}
