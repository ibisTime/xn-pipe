package com.cdkj.pipe.ao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdkj.pipe.ao.INewsAO;
import com.cdkj.pipe.bo.INewsBO;
import com.cdkj.pipe.bo.base.Paginable;
import com.cdkj.pipe.domain.News;
import com.cdkj.pipe.enums.EBoolean;
import com.cdkj.pipe.enums.ENewsStatus;
import com.cdkj.pipe.exception.BizException;

@Service
public class NewsAOImpl implements INewsAO {

    @Autowired
    private INewsBO newsBO;

    @Override
    public String addNews(String title, String type, String keywords,
            String content, String pic, String updater, String remark) {
        return newsBO.saveNews(title, type, keywords, content, pic, updater,
            remark);
    }

    @Override
    public void dropNews(String code) {
        News condition = newsBO.getNews(code);
        if (ENewsStatus.DRAFT.getCode().equals(condition.getStatus())
                || ENewsStatus.OFFLINE.getCode().equals(condition.getStatus())) {
            newsBO.deleteNews(code);
        } else {
            throw new BizException("xn0000", "当前新闻处于已上架状态，请先下架再删除");
        }
    }

    @Override
    public void editNews(String code, String title, String type,
            String keywords, String content, String pic, String updater,
            String remark) {
        News news = newsBO.getNews(code);
        if (!ENewsStatus.ONLINE.getCode().equals(news.getStatus())) {
            throw new BizException("xn0000", "当前新闻处于已上架状态，请先下架后再修改");
        }
        newsBO.refreshNews(code, title, type, keywords, content, pic, updater,
            remark);
    }

    /**
     * @see com.cdkj.ride.ao.INewsAO#queryNewsPage(int, int, com.cdkj.ride.domain.News)
     */
    @Override
    public Paginable<News> queryNewsPage(int start, int limit, News condition) {
        return newsBO.getPaginable(start, limit, condition);
    }

    /**
     * @see com.cdkj.ride.ao.INewsAO#queryNewsList(com.cdkj.ride.domain.News)
     */
    @Override
    public List<News> queryNewsList(News condition) {
        return newsBO.queryNewsList(condition);
    }

    /**
     * @see com.cdkj.ride.ao.INewsAO#getNews(java.lang.String)
     */
    @Override
    public News getNews(String code) {
        return newsBO.getNews(code);
    }

    /** 
     * @see com.cdkj.pipe.ao.INewsAO#upNews(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String)
     */
    @Override
    public void upNews(String code, String location, Integer orderNo,
            String updater) {
        News news = newsBO.getNews(code);
        if (ENewsStatus.ONLINE.getCode().equals(news.getStatus())) {
            throw new BizException("xn0000", "当前新闻处于已上架状态，无需重复上架");
        }
        newsBO.upDownNews(code, EBoolean.YES.getCode(), location, orderNo,
            updater);
    }

    /** 
     * @see com.cdkj.pipe.ao.INewsAO#downNews(java.lang.String, java.lang.String)
     */
    @Override
    public void downNews(String code, String updater) {
        News news = newsBO.getNews(code);
        if (!ENewsStatus.ONLINE.getCode().equals(news.getStatus())) {
            throw new BizException("xn0000", "当前新闻处于不处于已上架状态，无法下架");
        }
        newsBO.upDownNews(code, EBoolean.NO.getCode(), "", 0, updater);
    }
}
