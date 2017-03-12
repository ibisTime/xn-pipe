/**
 * @Title ISYSDictBO.java 
 * @Package com.xnjr.moom.bo 
 * @Description 
 * @author haiqingzheng  
 * @date 2016年4月17日 下午2:40:19 
 * @version V1.0   
 */
package com.cdkj.pipe.bo;

import java.util.List;

import com.cdkj.pipe.bo.base.IPaginableBO;
import com.cdkj.pipe.domain.SYSDict;

/** 
 * @author: haiqingzheng 
 * @since: 2016年4月17日 下午2:40:19 
 * @history:
 */
public interface ISYSDictBO extends IPaginableBO<SYSDict> {

    public Long saveSYSDict(SYSDict data);

    public int removeSYSDict(Long id);

    /**
     * 修改数据字典
     * @param sysDict
     * @return 
     * @create: 2016年4月17日 下午2:41:36 haiqingzheng
     * @history:
     */
    public int refreshSYSDict(SYSDict data);

    public SYSDict getSYSDict(Long id);

    public List<SYSDict> querySYSDictList(SYSDict condition);
}
