package com.trip.distribution.model.order;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.util.Calendar;

public class GetCurrentLogisticsResponseType {
    private JsonObject ResponseStatus;
    private GetCurrentLogisticsData data;
    private Boolean success;
    private String errcode;
    private String errmsg;

    public JsonObject getResponseStatus() {
        return ResponseStatus;
    }

    public void setResponseStatus(JsonObject responseStatus) {
        ResponseStatus = responseStatus;
    }

    public GetCurrentLogisticsData getData() {
        return data;
    }

    public void setData(GetCurrentLogisticsData data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public static class GetCurrentLogisticsData{
        private Calendar logisticsTime;
        private String logisticsStatus;
        private String logisticsRemark;

        public Calendar getLogisticsTime() {
            return logisticsTime;
        }

        public void setLogisticsTime(Calendar logisticsTime) {
            this.logisticsTime = logisticsTime;
        }

        public String getLogisticsStatus() {
            return logisticsStatus;
        }

        public void setLogisticsStatus(String logisticsStatus) {
            this.logisticsStatus = logisticsStatus;
        }

        public String getLogisticsRemark() {
            return logisticsRemark;
        }

        public void setLogisticsRemark(String logisticsRemark) {
            this.logisticsRemark = logisticsRemark;
        }
    }
}
