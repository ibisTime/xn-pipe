package com.cdkj.pipe.bo;

import java.util.List;

import com.cdkj.pipe.bo.base.IPaginableBO;
import com.cdkj.pipe.domain.News;

/**
 * @author: xieyj 
 * @since: 2017年3月12日 下午5:30:14 
 * @history:
 */
public interface INewsBO extends IPaginableBO<News> {

    public String saveNews(String title, String type, String keywords,
            String content, String pic, String updater, String remark);

    public int deleteNews(String code);

    public int refreshNews(String code, String title, String type,
            String keywords, String content, String pic, String updater,
            String remark);

    public int upDownNews(String code, String upDownResult, String location,
            Integer orderNo, String updater);

    public List<News> queryNewsList(News data);

    public News getNews(String code);
}
