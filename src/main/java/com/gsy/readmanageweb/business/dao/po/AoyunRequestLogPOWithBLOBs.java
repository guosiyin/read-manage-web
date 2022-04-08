package com.gsy.readmanageweb.business.dao.po;

public class AoyunRequestLogPOWithBLOBs extends AoyunRequestLogPO {
    private String requestBody;

    private String responseParam;

    public String getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(String requestBody) {
        this.requestBody = requestBody == null ? null : requestBody.trim();
    }

    public String getResponseParam() {
        return responseParam;
    }

    public void setResponseParam(String responseParam) {
        this.responseParam = responseParam == null ? null : responseParam.trim();
    }
}
