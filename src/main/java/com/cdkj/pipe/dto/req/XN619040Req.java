/**
 * @Title XN619040Req.java 
 * @Package com.cdkj.pipe.dto.req 
 * @Description 
 * @author leo(haiqing)  
 * @date 2017年3月12日 上午11:49:28 
 * @version V1.0   
 */
package com.cdkj.pipe.dto.req;

/** 
 * @author: haiqingzheng 
 * @since: 2017年3月12日 上午11:49:28 
 * @history:
 */
public class XN619040Req {

    // 水电工编号
    private String userId;

    // 找活范围
    private String content;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
