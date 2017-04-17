package com.cdkj.pipe.ao;

import com.cdkj.pipe.bo.base.Paginable;
import com.cdkj.pipe.domain.Hear;

public interface IHearAO {

    public Hear getHear(String userId);

    public void startHear(String userId, String longitude, String latitude,
            String content);

    public void stopHear(String userId);

    public Paginable<Hear> queryNearbyUser(int start, int limit, Hear condition);

}
