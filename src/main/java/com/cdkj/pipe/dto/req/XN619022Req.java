/**
 * @Title XN619022Req.java 
 * @Package com.cdkj.pipe.dto.req 
 * @Description 
 * @author leo(haiqing)  
 * @date 2017年3月12日 上午11:21:47 
 * @version V1.0   
 */
package com.cdkj.pipe.dto.req;

/** 
 * @author: haiqingzheng 
 * @since: 2017年3月12日 上午11:21:47 
 * @history:
 */
public class XN619022Req {

    // 需求编号
    private String code;

    // 开始时间（必填）
    private String startDatetime;

    // 结束时间（必填）
    private String endDatetime;

    // 省（必填）
    private String province;

    // 市（必填）
    private String city;

    // 区（必填）
    private String area;

    // 详细地址（必填）
    private String address;

    // 经度（必填）
    private String longitude;

    // 纬度（必填）
    private String latitude;

    // 价格（必填）
    private String price;

    // 简述（必填）
    private String summary;

    // 详述（必填）
    private String detail;

    // 更新人（必填）
    private String updater;

    // 备注（选填）
    private String remark;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStartDatetime() {
        return startDatetime;
    }

    public void setStartDatetime(String startDatetime) {
        this.startDatetime = startDatetime;
    }

    public String getEndDatetime() {
        return endDatetime;
    }

    public void setEndDatetime(String endDatetime) {
        this.endDatetime = endDatetime;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
