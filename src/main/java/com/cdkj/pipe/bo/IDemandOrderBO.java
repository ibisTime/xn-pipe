package com.cdkj.pipe.bo;

import java.util.List;

import com.cdkj.pipe.bo.base.IPaginableBO;
import com.cdkj.pipe.domain.DemandOrder;

public interface IDemandOrderBO extends IPaginableBO<DemandOrder> {

    public boolean isDemandOrderExist(String code);

    public String saveDemandOrder(String type, String demandCode,
            String dealerCode, String receiver, String remark);

    public void complete(DemandOrder order, String evaluate, Long giveIntegral,
            String updater, String remark);

    public void userCancel(DemandOrder order, String userId);

    public void dealerCancel(DemandOrder order, String dealerCode);

    public int removeDemandOrder(String code);

    public int refreshDemandOrder(DemandOrder data);

    public List<DemandOrder> queryDemandOrderList(DemandOrder condition);

    public DemandOrder getDemandOrder(String code);

    /**
     * 今日接单次数
     * @param userId
     * @return 
     * @create: 2017年3月16日 下午3:04:07 haiqingzheng
     * @history:
     */
    public Long getTakeCountToday(String userId);

}
