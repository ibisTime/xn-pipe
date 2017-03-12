/**
 * @Title ISYSConfigBO.java 
 * @Package com.xnjr.moom.bo 
 * @Description 
 * @author haiqingzheng  
 * @date 2016年4月17日 下午2:40:52 
 * @version V1.0   
 */
package com.cdkj.pipe.bo;

import com.cdkj.pipe.bo.base.IPaginableBO;
import com.cdkj.pipe.domain.SYSConfig;

/** 
 * @author: haiqingzheng 
 * @since: 2016年4月17日 下午2:40:52 
 * @history:
 */
public interface ISYSConfigBO extends IPaginableBO<SYSConfig> {

    public int saveSYSConfig(SYSConfig data);

    public int refreshSYSConfig(SYSConfig data);

    boolean isSYSConfigExist(Long Id);

    public SYSConfig getConfig(Long id);

    public String getConfigValue(String ckey);

    public SYSConfig getConfig(String ckey);
}
