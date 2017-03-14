package com.cdkj.pipe.ao;

import java.util.List;

import com.cdkj.pipe.bo.base.Paginable;
import com.cdkj.pipe.domain.Assign;

public interface IAssignAO {

    static final String DEFAULT_ORDER_COLUMN = "id";

    public Paginable<Assign> queryAssignPage(int start, int limit,
            Assign condition);

    public List<Assign> queryAssignList(Assign condition);

    public Assign getAssign(String code);

    /**
     * 查询水电工当前指派订单
     * @param userId
     * @return 
     * @create: 2017年3月14日 下午2:22:02 haiqingzheng
     * @history:
     */
    public Assign getCurrentAssign(String userId);

    /**
     * 接单
     * @param userId 
     * @create: 2017年3月14日 下午2:22:23 haiqingzheng
     * @history:
     */
    public void reveive(String userId);

    /**
     * 拒单
     * @param userId 
     * @create: 2017年3月14日 下午2:22:32 haiqingzheng
     * @history:
     */
    public void reject(String userId);

}
