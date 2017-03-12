package com.cdkj.pipe.bo;

import java.util.List;

import com.cdkj.pipe.bo.base.IPaginableBO;
import com.cdkj.pipe.domain.Dealer;

public interface IDealerBO extends IPaginableBO<Dealer> {

    public boolean isDealerExist(String code);

    public String saveDealer(Dealer data);

    public int platEdit(Dealer data);

    public int putOn(String code, String updater, String remark);

    public int putOff(String code, String updater, String remark);

    public int selfEdit(String code, String mobile, String pic, String detail,
            String updater, String remark);

    public List<Dealer> queryDealerList(Dealer condition);

    public Dealer getDealer(String code);

}
