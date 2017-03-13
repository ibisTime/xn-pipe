package com.cdkj.pipe.ao;

import com.cdkj.pipe.bo.base.Paginable;
import com.cdkj.pipe.domain.Comment;

/**
 * 评论
 * @author: xieyj 
 * @since: 2017年3月13日 下午2:23:15 
 * @history:
 */
public interface ICommentAO {
    static String DEFAULT_ORDER_COLUMN = "code";

    /**
     * 发布评论
     * @param type
     * @param content
     * @param parentCode
     * @param commentator
     * @param entityCode
     * @return 
     * @create: 2017年3月13日 下午2:36:37 xieyj
     * @history:
     */
    public String publishComment(String type, String content,
            String parentCode, String commentator, String entityCode);

    /**
     * 删除评论
     * @param code
     * @return 
     * @create: 2017年3月13日 下午2:24:03 xieyj
     * @history:
     */
    public int dropComment(String code);

    /**
     * 审批评论
     * @param code
     * @param approveResult 1/0
     * @param approver
     * @param approveNote
     * @return 
     * @create: 2017年3月13日 下午2:24:20 xieyj
     * @history:
     */
    public int approveComment(String code, String approveResult,
            String approver, String approveNote);

    /**
     * 分页查询评论
     * @param start
     * @param limit
     * @param condition
     * @return 
     * @create: 2016年12月12日 上午9:42:33 shan
     * @history:
     */
    public Paginable<Comment> queryCommentPage(int start, int limit,
            Comment condition);

    public Comment getComment(String code);
}
