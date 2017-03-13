/**
 * @Title XN619060Req.java 
 * @Package com.cdkj.pipe.dto.req 
 * @Description 
 * @author leo(haiqing)  
 * @date 2017年3月12日 下午2:29:08 
 * @version V1.0   
 */
package com.cdkj.pipe.dto.req;

/** 
 * @author: haiqingzheng 
 * @since: 2017年3月12日 下午2:29:08 
 * @history:
 */
public class XN619062Req {

    // 需求订单编号
    private String code;

    // 操作人
    private String updater;

    // 评价
    private String evaluate;

    // 赠送积分数量
    private String giveIntegral;

    // 备注
    private String remark;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate;
    }

    public String getGiveIntegral() {
        return giveIntegral;
    }

    public void setGiveIntegral(String giveIntegral) {
        this.giveIntegral = giveIntegral;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
