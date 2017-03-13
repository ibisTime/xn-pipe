package com.cdkj.pipe.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cdkj.pipe.dao.ICommentDAO;
import com.cdkj.pipe.dao.base.support.AMybatisTemplate;
import com.cdkj.pipe.domain.Comment;

/**
 * 评论
 * @author: shan 
 * @since: 2016年12月10日 上午9:45:33 
 * @history:
 */
@Repository("commentDAOImpl")
public class CommentDAOImpl extends AMybatisTemplate implements ICommentDAO {
    /**
     * 
     * @see com.cdkj.ride.dao.base.IBaseDAO#insert(java.lang.Object)
     */
    @Override
    public int insert(Comment data) {
        return super.insert(NAMESPACE.concat("insert_comment"), data);
    }

    /**
     * 
     * @see com.cdkj.ride.dao.base.IBaseDAO#delete(java.lang.Object)
     */
    @Override
    public int delete(Comment data) {
        return super.delete(NAMESPACE.concat("delete_comment"), data);
    }

    /**
     * 
     * @see com.cdkj.ride.dao.base.IBaseDAO#select(java.lang.Object)
     */
    @Override
    public Comment select(Comment condition) {
        return super.select(NAMESPACE.concat("select_comment"), condition,
            Comment.class);
    }

    /**
     * 
     * @see com.cdkj.ride.dao.base.IBaseDAO#selectTotalCount(java.lang.Object)
     */
    @Override
    public Long selectTotalCount(Comment condition) {
        return super.selectTotalCount(NAMESPACE.concat("select_comment_count"),
            condition);
    }

    /**
     * 
     * @see com.cdkj.ride.dao.base.IBaseDAO#selectList(java.lang.Object)
     */
    @Override
    public List<Comment> selectList(Comment condition) {
        return super.selectList(NAMESPACE.concat("select_comment"), condition,
            Comment.class);
    }

    /**
     * 
     * @see com.cdkj.ride.dao.base.IBaseDAO#selectList(java.lang.Object, int, int)
     */
    @Override
    public List<Comment> selectList(Comment condition, int start, int count) {
        return super.selectList(NAMESPACE.concat("select_comment"), start,
            count, condition, Comment.class);
    }

    /**
     * 
     * @see com.cdkj.ride.dao.ICommentDAO#update(com.cdkj.ride.domain.Comment)
     */
    @Override
    public int updateApporve(Comment data) {
        return super.update(NAMESPACE.concat("update_approveComment"), data);
    }
}
