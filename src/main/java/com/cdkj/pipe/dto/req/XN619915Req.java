package com.cdkj.pipe.dto.req;

/**
 * @author: xieyj 
 * @since: 2016年9月17日 下午4:09:39 
 * @history:
 */
public class XN619915Req extends APageReq {

    /** 
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
     */
    private static final long serialVersionUID = 1L;

    // 类型(选填)
    private String type;

    // key值(选填)
    private String ckey;

    public String getCkey() {
        return ckey;
    }

    public void setCkey(String ckey) {
        this.ckey = ckey;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
