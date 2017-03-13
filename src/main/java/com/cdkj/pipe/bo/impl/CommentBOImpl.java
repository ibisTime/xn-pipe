package com.cdkj.pipe.bo.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cdkj.pipe.bo.ICommentBO;
import com.cdkj.pipe.bo.base.PaginableBOImpl;
import com.cdkj.pipe.core.EGeneratePrefix;
import com.cdkj.pipe.core.OrderNoGenerater;
import com.cdkj.pipe.dao.ICommentDAO;
import com.cdkj.pipe.domain.Comment;
import com.cdkj.pipe.enums.EBoolean;
import com.cdkj.pipe.enums.ECommentStatus;
import com.cdkj.pipe.exception.BizException;

/**
 * @author: xieyj 
 * @since: 2017年3月13日 下午2:12:52 
 * @history:
 */
@Component
public class CommentBOImpl extends PaginableBOImpl<Comment> implements
        ICommentBO {
    @Autowired
    ICommentDAO commentDAO;

    @Override
    public String saveComment(String type, String content, String parentCode,
            String commentator, String entityCode) {
        String code = OrderNoGenerater.generateM(EGeneratePrefix.COMMENT
            .getCode());
        Comment data = new Comment();
        data.setCode(code);
        data.setType(type);
        data.setContent(content);
        data.setParentCode(parentCode);
        data.setStatus(ECommentStatus.TO_APPROVER.getCode());
        data.setCommentator(commentator);
        data.setCommDatetime(new Date());
        data.setEntityCode(entityCode);
        commentDAO.insert(data);
        return code;
    }

    @Override
    public int deleteComment(String code) {
        int count = 0;
        if (StringUtils.isNotBlank(code)) {
            Comment data = new Comment();
            data.setCode(code);
            count = commentDAO.delete(data);
        }
        return count;
    }

    /** 
     * @see com.cdkj.pipe.bo.ICommentBO#approveComment(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public int approveComment(String code, String approveResult,
            String approver, String approveNote) {
        Comment data = new Comment();
        data.setCode(code);
        data.setStatus(ECommentStatus.APPROVER_NO.getCode());
        if (EBoolean.YES.getCode().equals(approveResult)) {
            data.setStatus(ECommentStatus.APPROVER_YES.getCode());
        }
        data.setApproveDatetime(new Date());
        data.setRemark(approveNote);
        return commentDAO.updateApporve(data);
    }

    @Override
    public Comment getComment(String code) {
        Comment comment = null;
        if (StringUtils.isNotBlank(code)) {
            Comment data = new Comment();
            data.setCode(code);
            comment = commentDAO.select(data);
        }
        return comment;
    }

    @Override
    public List<Comment> queryCommentList(Comment data) {
        return commentDAO.selectList(data);
    }

    @Override
    public List<Comment> queryCommentList(String entityCode) {
        List<Comment> data = null;
        if (StringUtils.isNotBlank(entityCode)) {
            Comment condition = new Comment();
            condition.setEntityCode(entityCode);
            data = commentDAO.selectList(condition);
            if (data == null) {
                throw new BizException("xn000000", "评论不存在");
            }
        }
        return data;
    }
}
