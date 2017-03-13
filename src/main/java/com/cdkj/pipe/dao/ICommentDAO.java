package com.cdkj.pipe.dao;

import com.cdkj.pipe.dao.base.IBaseDAO;
import com.cdkj.pipe.domain.Comment;

/**
 * @author: xieyj 
 * @since: 2017年3月13日 下午2:09:11 
 * @history:
 */
public interface ICommentDAO extends IBaseDAO<Comment> {
    String NAMESPACE = ICommentDAO.class.getName().concat(".");

    public int updateApporve(Comment data);
}
