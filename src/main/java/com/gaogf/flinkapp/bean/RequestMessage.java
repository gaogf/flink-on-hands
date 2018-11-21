package com.gaogf.flinkapp.bean;

import java.io.Serializable;

/**
 * @author Lenovo
 */
public class RequestMessage implements Serializable {
    private static final long serialVersionUID = -6378776486803892623L;
    private String busiCode;
    private ReqInfo reqInfo;
    private String sourceCode;
    private String targetCode;
    private String version;

    public String getBusiCode() {
        return busiCode;
    }

    public void setBusiCode(String busiCode) {
        this.busiCode = busiCode;
    }

    public ReqInfo getReqInfo() {
        return reqInfo;
    }

    public void setReqInfo(ReqInfo reqInfo) {
        this.reqInfo = reqInfo;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public String getTargetCode() {
        return targetCode;
    }

    public void setTargetCode(String targetCode) {
        this.targetCode = targetCode;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "RequestMessage{" +
                "busiCode='" + busiCode + '\'' +
                ", reqInfo=" + reqInfo +
                ", sourceCode='" + sourceCode + '\'' +
                ", targetCode='" + targetCode + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
