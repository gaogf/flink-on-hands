package com.gaogf.flinkapp.bean;

import java.io.Serializable;

/**
 * @author Lenovo
 */
public class LogEvent implements Serializable {
    private static final long serialVersionUID = -383363760366496578L;
    private String appName;
    private String crtAppSysId;
    private String crtTime;
    private String crtUserId;
    private String hostIp;
    private String intfCode;
    private String intfInvkTime;
    private String lgId;
    private String reqstModeCd;
    private RequestMessage reqstMsgCntt;
    private String reqstSrcCode;
    private String rspCode;
    private String rspDesc;
    private ResponseMessage rspMsgCntt;
    private String systemCode;
    private String tableFlag;
    private String targetCode;
    private String telnum;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getCrtAppSysId() {
        return crtAppSysId;
    }

    public void setCrtAppSysId(String crtAppSysId) {
        this.crtAppSysId = crtAppSysId;
    }

    public String getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(String crtTime) {
        this.crtTime = crtTime;
    }

    public String getCrtUserId() {
        return crtUserId;
    }

    public void setCrtUserId(String crtUserId) {
        this.crtUserId = crtUserId;
    }

    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public String getIntfCode() {
        return intfCode;
    }

    public void setIntfCode(String intfCode) {
        this.intfCode = intfCode;
    }

    public String getIntfInvkTime() {
        return intfInvkTime;
    }

    public void setIntfInvkTime(String intfInvkTime) {
        this.intfInvkTime = intfInvkTime;
    }

    public String getLgId() {
        return lgId;
    }

    public void setLgId(String lgId) {
        this.lgId = lgId;
    }

    public String getReqstModeCd() {
        return reqstModeCd;
    }

    public void setReqstModeCd(String reqstModeCd) {
        this.reqstModeCd = reqstModeCd;
    }

    public RequestMessage getReqstMsgCntt() {
        return reqstMsgCntt;
    }

    public void setReqstMsgCntt(RequestMessage reqstMsgCntt) {
        this.reqstMsgCntt = reqstMsgCntt;
    }

    public String getReqstSrcCode() {
        return reqstSrcCode;
    }

    public void setReqstSrcCode(String reqstSrcCode) {
        this.reqstSrcCode = reqstSrcCode;
    }

    public String getRspCode() {
        return rspCode;
    }

    public void setRspCode(String rspCode) {
        this.rspCode = rspCode;
    }

    public String getRspDesc() {
        return rspDesc;
    }

    public void setRspDesc(String rspDesc) {
        this.rspDesc = rspDesc;
    }

    public ResponseMessage getRspMsgCntt() {
        return rspMsgCntt;
    }

    public void setRspMsgCntt(ResponseMessage rspMsgCntt) {
        this.rspMsgCntt = rspMsgCntt;
    }

    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }

    public String getTableFlag() {
        return tableFlag;
    }

    public void setTableFlag(String tableFlag) {
        this.tableFlag = tableFlag;
    }

    public String getTargetCode() {
        return targetCode;
    }

    public void setTargetCode(String targetCode) {
        this.targetCode = targetCode;
    }

    public String getTelnum() {
        return telnum;
    }

    public void setTelnum(String telnum) {
        this.telnum = telnum;
    }

    public static LogEvent fromString(String eventStr) {
        String[] split = eventStr.split(",");
        //TODO
        return new LogEvent();
    }

    @Override
    public String toString() {
        return "LogEvent{" +
                "appName='" + appName + '\'' +
                ", crtAppSysId='" + crtAppSysId + '\'' +
                ", crtTime='" + crtTime + '\'' +
                ", crtUserId='" + crtUserId + '\'' +
                ", hostIp='" + hostIp + '\'' +
                ", intfCode='" + intfCode + '\'' +
                ", intfInvkTime='" + intfInvkTime + '\'' +
                ", lgId='" + lgId + '\'' +
                ", reqstModeCd='" + reqstModeCd + '\'' +
                ", reqstMsgCntt=" + reqstMsgCntt +
                ", reqstSrcCode='" + reqstSrcCode + '\'' +
                ", rspCode='" + rspCode + '\'' +
                ", rspDesc='" + rspDesc + '\'' +
                ", rspMsgCntt=" + rspMsgCntt +
                ", systemCode='" + systemCode + '\'' +
                ", tableFlag='" + tableFlag + '\'' +
                ", targetCode='" + targetCode + '\'' +
                ", telnum='" + telnum + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ReqInfo reqInfo = new ReqInfo();
        reqInfo.setAuditMessage("ww");
        reqInfo.setBillId("ss");
        RequestMessage requestMessage = new RequestMessage();
        requestMessage.setBusiCode("ws");
        requestMessage.setReqInfo(reqInfo);
        LogEvent logEvent = new LogEvent();
        logEvent.setReqstMsgCntt(requestMessage);
        logEvent.setRspDesc("sssds");
        System.out.println(logEvent.toString());
    }
}
