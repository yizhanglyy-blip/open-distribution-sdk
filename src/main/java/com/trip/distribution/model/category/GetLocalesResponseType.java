package com.trip.distribution.model.category;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetLocalesResponseType {
    private JsonObject ResponseStatus;
    private GetLocalesData data;
    private Boolean success;
    private String errcode;
    private String errmsg;

    public JsonObject getResponseStatus() {
        return ResponseStatus;
    }

    public void setResponseStatus(JsonObject responseStatus) {
        ResponseStatus = responseStatus;
    }

    public GetLocalesData getData() {
        return data;
    }

    public void setData(GetLocalesData data) {
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

    public static class GetLocalesData{
        private List<String> localeList;

        public List<String> getLocaleList() {
            return localeList;
        }

        public void setLocaleList(List<String> localeList) {
            this.localeList = localeList;
        }
    }
}
