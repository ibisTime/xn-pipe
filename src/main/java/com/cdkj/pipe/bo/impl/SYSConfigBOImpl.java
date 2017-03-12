package com.cdkj.pipe.bo.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cdkj.pipe.bo.ISYSConfigBO;
import com.cdkj.pipe.bo.base.PaginableBOImpl;
import com.cdkj.pipe.dao.ISYSConfigDAO;
import com.cdkj.pipe.domain.SYSConfig;
import com.cdkj.pipe.exception.BizException;

/**
 * @author: xieyj 
 * @since: 2017年2月17日 下午2:22:14 
 * @history:
 */
@Component
public class SYSConfigBOImpl extends PaginableBOImpl<SYSConfig> implements
        ISYSConfigBO {
    @Autowired
    private ISYSConfigDAO sysConfigDAO;

    @Override
    public boolean isSYSConfigExist(Long Id) {
        SYSConfig sysConfig = new SYSConfig();
        sysConfig.setId(Id);
        if (sysConfigDAO.selectTotalCount(sysConfig) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public int saveSYSConfig(SYSConfig data) {
        int count = 0;
        if (data != null) {
            data.setUpdateDatetime(new Date());
            count = sysConfigDAO.insert(data);
        }
        return count;
    }

    @Override
    public int refreshSYSConfig(SYSConfig data) {
        int count = 0;
        if (data != null) {
            data.setUpdateDatetime(new Date());
            count = sysConfigDAO.updateValue(data);
        }
        return count;
    }

    @Override
    public SYSConfig getConfig(Long id) {
        SYSConfig sysConfig = null;
        if (id != null) {
            SYSConfig condition = new SYSConfig();
            condition.setId(id);
            sysConfig = sysConfigDAO.select(condition);
        }
        return sysConfig;
    }

    @Override
    public String getConfigValue(String ckey) {
        String cvalue = null;
        if (ckey != null) {
            SYSConfig condition = new SYSConfig();
            condition.setCkey(ckey);
            SYSConfig sysConfig = sysConfigDAO.select(condition);
            if (sysConfig != null) {
                cvalue = sysConfig.getCvalue();
            } else {
                throw new BizException("xn808000", "找不到系统参数");
            }
        }
        return cvalue;
    }

    /** 
     * @see com.cdkj.pipe.bo.ISYSConfigBO#getConfig(java.lang.String)
     */
    @Override
    public SYSConfig getConfig(String ckey) {
        SYSConfig sysConfig = null;
        if (ckey != null) {
            SYSConfig condition = new SYSConfig();
            condition.setCkey(ckey);
            sysConfig = sysConfigDAO.select(condition);
        }
        return sysConfig;
    }
}
