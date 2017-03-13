package com.cdkj.pipe.bo;

import java.util.List;

import com.cdkj.pipe.bo.base.IPaginableBO;
import com.cdkj.pipe.domain.Comment;

/**
 * 评论
 * @author: xieyj 
 * @since: 2017年3月13日 下午2:12:09 
 * @history:
 */
public interface ICommentBO extends IPaginableBO<Comment> {

    public String saveComment(String type, String content, String parentCode,
            String commentator, String entityCode);

    public int deleteComment(String code);

    public int approveComment(String code, String approveResult,
            String approver, String approveNote);

    public Comment getComment(String code);

    public List<Comment> queryCommentList(Comment data);

    public List<Comment> queryCommentList(String entityCode);
}
