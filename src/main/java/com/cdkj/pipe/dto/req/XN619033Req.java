/**
 * @Title XN619033Req.java 
 * @Package com.cdkj.pipe.dto.req 
 * @Description 
 * @author leo(haiqing)  
 * @date 2017年3月12日 下午12:57:00 
 * @version V1.0   
 */
package com.cdkj.pipe.dto.req;

import java.util.List;

/** 
 * @author: haiqingzheng 
 * @since: 2017年3月12日 下午12:57:00 
 * @history:
 */
public class XN619033Req extends APageReq {

    /** 
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
     */
    private static final long serialVersionUID = -7548721674958793535L;

    // 经度（选填）
    private String longitude;

    // 纬度（选填）
    private String latitude;

    // 需求类型（选填）
    private String type;

    // 状态list(选填)
    private List<String> statusList;

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public List<String> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<String> statusList) {
        this.statusList = statusList;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
