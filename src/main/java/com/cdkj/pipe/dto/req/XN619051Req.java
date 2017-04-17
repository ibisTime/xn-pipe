/**
 * @Title XN619051Req.java 
 * @Package com.cdkj.pipe.dto.req 
 * @Description 
 * @author leo(haiqing)  
 * @date 2017年4月17日 下午1:42:43 
 * @version V1.0   
 */
package com.cdkj.pipe.dto.req;

/** 
 * @author: haiqingzheng 
 * @since: 2017年4月17日 下午1:42:43 
 * @history:
 */
public class XN619051Req {

    // 经度（选填）
    private String latitude;

    // 纬度（选填）
    private String longitude;

    // 状态（选填）
    private String status;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
