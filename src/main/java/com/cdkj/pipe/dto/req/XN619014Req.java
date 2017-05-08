/**
 * @Title XN619014Req.java 
 * @Package com.cdkj.pipe.dto.req 
 * @Description 
 * @author leo(haiqing)  
 * @date 2017年5月8日 下午5:33:28 
 * @version V1.0   
 */
package com.cdkj.pipe.dto.req;

/** 
 * @author: haiqingzheng 
 * @since: 2017年5月8日 下午5:33:28 
 * @history:
 */
public class XN619014Req extends APageReq {

    private static final long serialVersionUID = 160958329608411551L;

    // 经度（选填）
    private String longitude;

    // 纬度（选填）
    private String latitude;

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
}
