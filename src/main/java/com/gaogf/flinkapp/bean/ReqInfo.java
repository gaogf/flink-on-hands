package com.gaogf.flinkapp.bean;

import java.io.Serializable;

public class ReqInfo  implements Serializable {
    private static final long serialVersionUID = 161946398617510344L;
    private String auditMessage;
    private String auditStatus;
    private String billId;
    private String busiSeq;
    private String busiType;
    private String channelId;
    private String information;

    public String getAuditMessage() {
        return auditMessage;
    }

    public void setAuditMessage(String auditMessage) {
        this.auditMessage = auditMessage;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getBusiSeq() {
        return busiSeq;
    }

    public void setBusiSeq(String busiSeq) {
        this.busiSeq = busiSeq;
    }

    public String getBusiType() {
        return busiType;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    @Override
    public String toString() {
        return "ReqInfo{" +
                "auditMessage='" + auditMessage + '\'' +
                ", auditStatus='" + auditStatus + '\'' +
                ", billId='" + billId + '\'' +
                ", busiSeq='" + busiSeq + '\'' +
                ", busiType='" + busiType + '\'' +
                ", channelId='" + channelId + '\'' +
                ", information='" + information + '\'' +
                '}';
    }
}
