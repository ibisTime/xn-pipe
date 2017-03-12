package com.cdkj.pipe.dto.req;

/**
 * @author: xieyj 
 * @since: 2016年9月17日 下午1:40:33 
 * @history:
 */
public class XN809025Req extends APageReq {

    /** 
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
     */
    private static final long serialVersionUID = -2281103371196050428L;

    // 针对表
    private String toTable;

    // 操作类型 0-查询 1-增删改
    private String operateType;

    // 操作人
    private String operater;

    // 操作时间起
    private String operateDatetimeStart;

    // 操作时间止
    private String operateDatetimeEnd;

    public String getToTable() {
        return toTable;
    }

    public void setToTable(String toTable) {
        this.toTable = toTable;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public String getOperater() {
        return operater;
    }

    public void setOperater(String operater) {
        this.operater = operater;
    }

    public String getOperateDatetimeStart() {
        return operateDatetimeStart;
    }

    public void setOperateDatetimeStart(String operateDatetimeStart) {
        this.operateDatetimeStart = operateDatetimeStart;
    }

    public String getOperateDatetimeEnd() {
        return operateDatetimeEnd;
    }

    public void setOperateDatetimeEnd(String operateDatetimeEnd) {
        this.operateDatetimeEnd = operateDatetimeEnd;
    }
}
