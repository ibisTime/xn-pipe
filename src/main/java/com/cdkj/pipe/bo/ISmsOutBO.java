package com.cdkj.pipe.bo;

import java.util.List;

public interface ISmsOutBO {
    /**
     * 单发短信
     * @param userId
     * @param content 
     * @create: 2015年11月17日 下午3:37:54 myb858
     * @history:
     */
    void sentContent(String userId, String content);

    /**
     * 群发短信
     * @param userList
     * @param notice 
     * @create: 2017年2月24日 下午1:57:30 myb858
     * @history:
     */
    void qunSent(List<String> userList, String notice);
}
