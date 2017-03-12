package com.cdkj.pipe.ao;

import java.util.List;

import com.cdkj.pipe.bo.base.Paginable;
import com.cdkj.pipe.domain.News;

/**
 * 新闻
 * @author: xieyj 
 * @since: 2017年3月12日 下午5:44:04 
 * @history:
 */
public interface INewsAO {
    static String DEFAULT_ORDER_COLUMN = "code";

    public String addNews(String title, String type, String keywords,
            String content, String pic, String updater, String remark);

    public void dropNews(String code);

    public void editNews(String code, String title, String type,
            String keywords, String content, String pic, String updater,
            String remark);

    /**
     * 上架新闻
     * @param code
     * @param location
     * @param orderNo
     * @param updater 
     * @create: 2017年3月12日 下午5:46:36 xieyj
     * @history:
     */
    public void upNews(String code, String location, Integer orderNo,
            String updater);

    /**
     * 下架新闻
     * @param code
     * @param updater 
     * @create: 2017年3月12日 下午5:47:08 xieyj
     * @history:
     */
    public void downNews(String code, String updater);

    /**
     * 分页查询新闻
     * @param start
     * @param limit
     * @param codition
     * @return 
     * @create: 2016年12月8日 下午8:19:05 shan
     * @history:
     */
    public Paginable<News> queryNewsPage(int start, int limit, News condition);

    /**
     * 列表资讯新闻
     * @param condition
     * @return 
     * @create: 2016年12月8日 下午8:20:31 shan
     * @history:
     */
    public List<News> queryNewsList(News condition);

    /**
     * 详情查询新闻
     * @param code
     * @return 
     * @create: 2017年3月12日 下午5:45:45 xieyj
     * @history:
     */
    public News getNews(String code);
}
