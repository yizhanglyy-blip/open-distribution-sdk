package com.trip.distribution.model.order;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BookingStatusResponseType {
    private BookingStatusData data;
    private JsonObject ResponseStatus;
    private Boolean success;
    private String errcode;
    private String errmsg;

    public BookingStatusData getData() {
        return data;
    }

    public void setData(BookingStatusData data) {
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

    public static class BookingStatusData{
        private List<OrderStatus> statusList;

        public List<OrderStatus> getStatusList() {
            return statusList;
        }

        public void setStatusList(List<OrderStatus> statusList) {
            this.statusList = statusList;
        }
    }
    
    public static class OrderStatus{
        private Long orderID;
        private String distributorOrderID;
        private String orderStatus;

        public Long getOrderID() {
            return orderID;
        }

        public void setOrderID(Long orderID) {
            this.orderID = orderID;
        }

        public String getDistributorOrderID() {
            return distributorOrderID;
        }

        public void setDistributorOrderID(String distributorOrderID) {
            this.distributorOrderID = distributorOrderID;
        }

        public String getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
        }
    }
}
