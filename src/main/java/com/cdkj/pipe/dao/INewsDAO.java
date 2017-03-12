package com.cdkj.pipe.dao;

import com.cdkj.pipe.dao.base.IBaseDAO;
import com.cdkj.pipe.domain.News;

/**
 * @author: xieyj 
 * @since: 2017年3月12日 下午5:27:11 
 * @history:
 */
public interface INewsDAO extends IBaseDAO<News> {
    String NAMESPACE = INewsDAO.class.getName().concat(".");

    public int update(News data);

    public int updateScan(News data);

    public int updateComment(News data);

    public int upDownNews(News data);
}
