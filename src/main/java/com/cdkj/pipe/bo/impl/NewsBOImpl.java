package com.cdkj.pipe.bo.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cdkj.pipe.bo.INewsBO;
import com.cdkj.pipe.bo.base.PaginableBOImpl;
import com.cdkj.pipe.core.EGeneratePrefix;
import com.cdkj.pipe.core.OrderNoGenerater;
import com.cdkj.pipe.dao.INewsDAO;
import com.cdkj.pipe.domain.News;
import com.cdkj.pipe.enums.EBoolean;
import com.cdkj.pipe.enums.ENewsStatus;
import com.cdkj.pipe.exception.BizException;

/**
 * @author: xieyj 
 * @since: 2017年3月12日 下午5:33:04 
 * @history:
 */
@Component
public class NewsBOImpl extends PaginableBOImpl<News> implements INewsBO {

    @Autowired
    private INewsDAO newsDAO;

    @Override
    public String saveNews(String title, String type, String keywords,
            String content, String pic, String updater, String remark) {
        News data = new News();
        String code = OrderNoGenerater
            .generateM(EGeneratePrefix.NEWS.getCode());
        data.setCode(code);
        data.setTitle(title);
        data.setType(type);
        data.setKeywords(keywords);
        data.setContent(content);
        data.setPic(pic);
        data.setUpdater(updater);
        data.setUpdateDatetime(new Date());
        data.setScanNum(0);
        data.setCommentNum(0);
        data.setLocation(EBoolean.NO.getCode());
        data.setStatus(ENewsStatus.DRAFT.getCode());
        data.setRemark(remark);
        newsDAO.insert(data);
        return code;
    }

    /**
     * @see com.cdkj.ride.bo.INewsBO#deteleNews(java.lang.String)
     */
    @Override
    public int deleteNews(String code) {
        int count = 0;
        if (StringUtils.isNotBlank(code)) {
            News data = new News();
            data.setCode(code);
            count = newsDAO.delete(data);
        }
        return count;
    }

    /**
     * @see com.cdkj.ride.bo.INewsBO#refreshNews(com.cdkj.ride.domain.News)
     */
    @Override
    public int refreshNews(String code, String title, String type,
            String keywords, String content, String pic, String updater,
            String remark) {
        News data = new News();
        data.setCode(code);
        data.setTitle(title);
        data.setType(type);
        data.setKeywords(keywords);
        data.setContent(content);
        data.setPic(pic);
        data.setUpdater(updater);
        data.setUpdateDatetime(new Date());
        data.setRemark(remark);
        return newsDAO.update(data);
    }

    /**
     * @see com.cdkj.ride.bo.INewsBO#queryNewsList(com.cdkj.ride.domain.News)
     */
    @Override
    public List<News> queryNewsList(News data) {
        return newsDAO.selectList(data);
    }

    /**
     * @see com.cdkj.ride.bo.INewsBO#getNews(java.lang.String)
     */
    @Override
    public News getNews(String code) {
        News news = null;
        if (StringUtils.isNotBlank(code)) {
            News data = new News();
            data.setCode(code);
            news = newsDAO.select(data);
            if (null == news) {
                throw new BizException("xn0000", "新闻不存在");
            }
        }
        return news;
    }

    @Override
    public int upDownNews(String code, String upDownResult, String location,
            Integer orderNo, String updater) {
        News data = new News();
        data.setCode(code);
        data.setStatus(ENewsStatus.OFFLINE.getCode());
        if (EBoolean.YES.getCode().equals(upDownResult)) {
            data.setStatus(ENewsStatus.ONLINE.getCode());
        }
        data.setLocation(location);
        data.setOrderNo(orderNo);
        data.setUpdater(updater);
        data.setUpdateDatetime(new Date());
        return newsDAO.upDownNews(data);
    }
}
