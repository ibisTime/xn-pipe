package com.cdkj.pipe.dto.req;

/**
 * 新增新闻
 * @author: xieyj 
 * @since: 2017年3月12日 下午6:05:28 
 * @history:
 */
public class XN619080Req {

    // 标题（必填）
    private String title;

    // 关键字（选填）
    private String keywords;

    // 内容（必填）
    private String content;

    // 图片（选填）
    private String pic;

    // 更新人（必填）
    private String updater;

    // 备注（选填）
    private String remark;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
