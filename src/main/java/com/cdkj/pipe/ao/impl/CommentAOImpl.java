package com.cdkj.pipe.ao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdkj.pipe.ao.ICommentAO;
import com.cdkj.pipe.bo.ICommentBO;
import com.cdkj.pipe.bo.base.Paginable;
import com.cdkj.pipe.domain.Comment;
import com.cdkj.pipe.enums.ECommentStatus;
import com.cdkj.pipe.exception.BizException;

/**
 * 评论
 * @author: xieyj 
 * @since: 2017年3月13日 下午2:26:31 
 * @history:
 */
@Service
public class CommentAOImpl implements ICommentAO {
    @Autowired
    ICommentBO commentBO;

    /**
     * @see com.cdkj.pipe.ao.ICommentAO#publishComment(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public String publishComment(String type, String content,
            String parentCode, String commentator, String entityCode) {
        return commentBO.saveComment(type, content, parentCode, commentator,
            entityCode);
    }

    /** 
     * @see com.cdkj.pipe.ao.ICommentAO#dropComment(java.lang.String)
     */
    @Override
    public int dropComment(String code) {
        Comment comment = this.getComment(code);
        if (ECommentStatus.APPROVER_YES.getCode().equals(comment.getStatus())) {
            throw new BizException("xn000000", "当前评论已审批通过，无法删除");
        }
        return commentBO.deleteComment(code);
    }

    /** 
     * @see com.cdkj.pipe.ao.ICommentAO#approveComment(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public int approveComment(String code, String approveResult,
            String approver, String approveNote) {
        return commentBO.approveComment(code, approveResult, approver,
            approveNote);
    }

    @Override
    public Paginable<Comment> queryCommentPage(int start, int limit,
            Comment condition) {
        return commentBO.getPaginable(start, limit, condition);
    }

    @Override
    public Comment getComment(String code) {
        return commentBO.getComment(code);
    }
}
