package com.cdkj.pipe.domain;

import java.util.Date;

import com.cdkj.pipe.dao.base.ABaseDO;

/**
 * 系统参数
 * @author: xieyj 
 * @since: 2017年2月17日 下午2:20:04 
 * @history:
 */
public class SYSConfig extends ABaseDO {
    /** 
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
     */
    private static final long serialVersionUID = -6136818068168453506L;

    // 编号（自增长）
    private Long id;

    // 类型
    private String type;

    // key值
    private String ckey;

    // value值
    private String cvalue;

    // 最近更新人
    private String updater;

    // 最近更新时间
    private Date updateDatetime;

    // 备注
    private String remark;

    // *******db properties*******
    // key值
    private String ckeyForQuery;

    public String getCkeyForQuery() {
        return ckeyForQuery;
    }

    public void setCkeyForQuery(String ckeyForQuery) {
        this.ckeyForQuery = ckeyForQuery;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCkey() {
        return ckey;
    }

    public void setCkey(String ckey) {
        this.ckey = ckey;
    }

    public String getCvalue() {
        return cvalue;
    }

    public void setCvalue(String cvalue) {
        this.cvalue = cvalue;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
