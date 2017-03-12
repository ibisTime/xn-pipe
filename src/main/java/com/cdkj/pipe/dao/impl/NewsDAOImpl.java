package com.cdkj.pipe.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cdkj.pipe.dao.INewsDAO;
import com.cdkj.pipe.dao.base.support.AMybatisTemplate;
import com.cdkj.pipe.domain.News;

/**
 * 新闻资讯
 * @author: xieyj 
 * @since: 2017年3月12日 下午5:28:13 
 * @history:
 */
@Repository("newsDAOImpl")
public class NewsDAOImpl extends AMybatisTemplate implements INewsDAO {

    /**
     * @see com.cdkj.ride.dao.base.IBaseDAO#insert(java.lang.Object)
     */
    @Override
    public int insert(News data) {
        return super.insert(NAMESPACE.concat("insert_news"), data);
    }

    /**
     * @see com.cdkj.ride.dao.base.IBaseDAO#delete(java.lang.Object)
     */
    @Override
    public int delete(News data) {
        return super.delete(NAMESPACE.concat("delete_news"), data);
    }

    /**
     * @see com.cdkj.ride.dao.base.IBaseDAO#select(java.lang.Object)
     */
    @Override
    public News select(News condition) {
        return super.select(NAMESPACE.concat("select_news"), condition,
            News.class);
    }

    /**
     * @see com.cdkj.ride.dao.base.IBaseDAO#selectTotalCount(java.lang.Object)
     */
    @Override
    public Long selectTotalCount(News condition) {
        return super.selectTotalCount(NAMESPACE.concat("select_news_count"),
            condition);
    }

    /**
     * @see com.cdkj.ride.dao.base.IBaseDAO#selectList(java.lang.Object)
     */
    @Override
    public List<News> selectList(News condition) {
        return super.selectList(NAMESPACE.concat("select_news"), condition,
            News.class);
    }

    /**
     * @see com.cdkj.ride.dao.base.IBaseDAO#selectList(java.lang.Object, int, int)
     */
    @Override
    public List<News> selectList(News condition, int start, int count) {
        return super.selectList(NAMESPACE.concat("select_news"), start, count,
            condition, News.class);
    }

    /**
     * @see com.cdkj.ride.dao.INewsDAO#update(com.cdkj.ride.domain.News)
     */
    @Override
    public int update(News data) {
        return super.update(NAMESPACE.concat("update_news"), data);
    }

    /**
     * 
     * @see com.cdkj.ride.dao.INewsDAO#updateScan(com.cdkj.ride.domain.News)
     */
    @Override
    public int updateScan(News data) {
        return super.update(NAMESPACE.concat("update_newsScan"), data);
    }

    /**
     * 
     * @see com.cdkj.ride.dao.INewsDAO#updateComment(com.cdkj.ride.domain.News)
     */
    @Override
    public int updateComment(News data) {
        return super.update(NAMESPACE.concat(""), data);
    }

    @Override
    public int upDownNews(News data) {
        return super.update(NAMESPACE.concat("update_newsUpDown"), data);
    }
}
