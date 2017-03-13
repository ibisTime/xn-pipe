/**
 * @Title XN619070Req.java 
 * @Package com.cdkj.pipe.dto.req 
 * @Description 
 * @author leo(haiqing)  
 * @date 2017年3月12日 下午2:34:07 
 * @version V1.0   
 */
package com.cdkj.pipe.dto.req;

import java.util.List;

/** 
 * @author: haiqingzheng 
 * @since: 2017年3月12日 下午2:34:07 
 * @history:
 */
public class XN619071Req extends APageReq {

    /** 
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
     */
    private static final long serialVersionUID = -2493691825478647115L;

    // 订单编号（选填）
    private String code;

    // 订单类型（选填）
    private String type;

    // 需求编号（选填）
    private String demandCode;

    // 经销商编号（选填）
    private String dealerCode;

    // 接单人（选填）
    private String receiver;

    // 状态（选填）
    private String status;

    // 状态list（选填）
    private List<String> statusList;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDemandCode() {
        return demandCode;
    }

    public void setDemandCode(String demandCode) {
        this.demandCode = demandCode;
    }

    public String getDealerCode() {
        return dealerCode;
    }

    public void setDealerCode(String dealerCode) {
        this.dealerCode = dealerCode;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<String> statusList) {
        this.statusList = statusList;
    }

}
