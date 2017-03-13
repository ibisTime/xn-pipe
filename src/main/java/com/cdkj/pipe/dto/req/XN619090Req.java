package com.cdkj.pipe.dto.req;

/**
 * 发布评论
 * @author: xieyj 
 * @since: 2017年3月13日 下午2:31:01 
 * @history:
 */
public class XN619090Req {

    private String type;

    private String content;

    private String parentCode;

    private String commentator;

    private String entityCode;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getCommentator() {
        return commentator;
    }

    public void setCommentator(String commentator) {
        this.commentator = commentator;
    }

    public String getEntityCode() {
        return entityCode;
    }

    public void setEntityCode(String entityCode) {
        this.entityCode = entityCode;
    }
}
