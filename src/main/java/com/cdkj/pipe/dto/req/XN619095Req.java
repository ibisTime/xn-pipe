package com.cdkj.pipe.dto.req;

/**
 * 分页查询评论
 * @author: xieyj 
 * @since: 2017年3月12日 下午6:05:28 
 * @history:
 */
public class XN619095Req extends APageReq {

    /** 
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
     */
    private static final long serialVersionUID = 1L;

    private String entityCode;

    private String type;

    private String status;

    public String getEntityCode() {
        return entityCode;
    }

    public void setEntityCode(String entityCode) {
        this.entityCode = entityCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
