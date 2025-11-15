package com.trip.distribution.model.product;

import com.google.gson.JsonObject;
import java.util.List;

public class PriceCalendarResponseType {
    private PriceCalendarData data;
    private JsonObject ResponseStatus;
    private Boolean success;
    private String errcode;
    private String errmsg;

    public PriceCalendarData getData() {
        return data;
    }

    public void setData(PriceCalendarData data) {
        this.data = data;
    }

    public JsonObject getResponseStatus() {
        return ResponseStatus;
    }

    public void setResponseStatus(JsonObject responseStatus) {
        ResponseStatus = responseStatus;
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

    public static class PriceCalendarData{
        private Long productID;
        private String name;
        private Boolean saleAvailable;
        private String locale;
        List<Package> packageList;

        public Long getProductID() {
            return productID;
        }

        public void setProductID(Long productID) {
            this.productID = productID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Boolean getSaleAvailable() {
            return saleAvailable;
        }

        public void setSaleAvailable(Boolean saleAvailable) {
            this.saleAvailable = saleAvailable;
        }

        public String getLocale() {
            return locale;
        }

        public void setLocale(String locale) {
            this.locale = locale;
        }

        public List<Package> getPackageList() {
            return packageList;
        }

        public void setPackageList(List<Package> packageList) {
            this.packageList = packageList;
        }
    }
}
