package com.cdkj.pipe.dto.req;

/**
 * 审批评论
 * @author: xieyj 
 * @since: 2017年3月12日 下午6:05:28 
 * @history:
 */
public class XN619092Req {

    private String code;

    private String approveResult;

    private String approver;

    private String approveNote;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getApproveResult() {
        return approveResult;
    }

    public void setApproveResult(String approveResult) {
        this.approveResult = approveResult;
    }

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public String getApproveNote() {
        return approveNote;
    }

    public void setApproveNote(String approveNote) {
        this.approveNote = approveNote;
    }

}
