package com.cdkj.pipe.ao;

import java.util.List;

import com.cdkj.pipe.domain.Hear;

public interface IHearAO {

    public Hear getHear(String userId);

    public void startHear(String userId, String content);

    public void stopHear(String userId);

    public List<Hear> queryNearbyUser(String longitude, String latitude);

}
