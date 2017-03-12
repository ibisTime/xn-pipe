package com.cdkj.pipe.ao;

import java.util.List;

import com.cdkj.pipe.bo.base.Paginable;
import com.cdkj.pipe.domain.Dealer;
import com.cdkj.pipe.dto.req.XN619000Req;
import com.cdkj.pipe.dto.req.XN619001Req;

public interface IDealerAO {
    static final String DEFAULT_ORDER_COLUMN = "code";

    public String addDealer(XN619000Req req);

    public int platEditDealer(XN619001Req req);

    public int putOn(String code, String updater, String remark);

    public int putOff(String code, String updater, String remark);

    public int selfEditDealer(String code, String mobile, String pic,
            String detail, String updater, String remark);

    public Paginable<Dealer> queryDealerPage(int start, int limit,
            Dealer condition);

    public List<Dealer> queryDealerList(Dealer condition);

    public Dealer getDealer(String code);

}
