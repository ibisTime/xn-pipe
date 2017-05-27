package com.cdkj.pipe.ao;

import java.util.List;

import com.cdkj.pipe.bo.base.Paginable;
import com.cdkj.pipe.domain.DemandOrder;

public interface IDemandOrderAO {
    static final String DEFAULT_ORDER_COLUMN = "code";

    public void complete(String code, String evaluate, Long giveIntegral,
            String updater, String remark);

    public void userCancel(String code, String userId);

    public void dealerCancel(String code, String dealerCode);

    public Paginable<DemandOrder> queryDemandOrderPage(int start, int limit,
            DemandOrder condition);

    public List<DemandOrder> queryDemandOrderList(DemandOrder condition);

    public DemandOrder getDemandOrder(String code);

    public void uploadPic(String code, String pic);

}
