package com.cdkj.pipe.ao;

import java.util.List;

import com.cdkj.pipe.bo.base.Paginable;
import com.cdkj.pipe.domain.DemandOrder;

public interface IDemandOrderAO {
    static final String DEFAULT_ORDER_COLUMN = "code";

    public int dropDemandOrder(String code);

    public int editDemandOrder(DemandOrder data);

    public Paginable<DemandOrder> queryDemandOrderPage(int start, int limit,
            DemandOrder condition);

    public List<DemandOrder> queryDemandOrderList(DemandOrder condition);

    public DemandOrder getDemandOrder(String code);

}
