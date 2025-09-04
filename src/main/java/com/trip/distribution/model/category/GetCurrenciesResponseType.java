package com.trip.distribution.model.category;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetCurrenciesResponseType {
    private JsonObject ResponseStatus;
    private GetCurrenciesData data;
    private Boolean success;
    private String errcode;
    private String errmsg;

    public JsonObject getResponseStatus() {
        return ResponseStatus;
    }

    public void setResponseStatus(JsonObject responseStatus) {
        ResponseStatus = responseStatus;
    }

    public GetCurrenciesData getData() {
        return data;
    }

    public void setData(GetCurrenciesData data) {
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

    public static class GetCurrenciesData{
        private List<String> currencyList;

        public List<String> getCurrencyList() {
            return currencyList;
        }

        public void setCurrencyList(List<String> currencyList) {
            this.currencyList = currencyList;
        }
    }
}
