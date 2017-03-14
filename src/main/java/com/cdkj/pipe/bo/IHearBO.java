package com.cdkj.pipe.bo;

import java.util.List;

import com.cdkj.pipe.bo.base.IPaginableBO;
import com.cdkj.pipe.domain.Hear;

public interface IHearBO extends IPaginableBO<Hear> {

    public boolean isHearExist(String code);

    public String saveHear(Hear data);

    public int removeHear(String code);

    public int refreshHear(Hear data);

    public List<Hear> queryHearList(Hear condition);

    public Hear getHear(String userId);

    public void startHear(String userId, String content);

    public void stopHear(String userId);

    public void assign(String userId);

    public void assignReceive(String userId);

    public void assignReject(String userId);

}
