package com.cdkj.pipe.dto.req;

/**
 * 分页查询新闻
 * @author: xieyj 
 * @since: 2017年3月12日 下午6:14:11 
 * @history:
 */
public class XN619085Req extends APageReq {

    /** 
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
     */
    private static final long serialVersionUID = 1L;

    // 类型（必填）
    private String type;

    // 标题（选填）
    private String title;

    // 关键字（选填）
    private String keywords;

    private String status;

    // ui位置
    private String location;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
