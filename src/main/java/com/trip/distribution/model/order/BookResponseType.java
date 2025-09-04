package com.trip.distribution.model.order;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class BookResponseType {
    private JsonObject ResponseStatus;
    private Boolean success;
    private String errcode;
    private String errmsg;
    private BookResponseTypeData data;

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

    public BookResponseTypeData getData() {
        return data;
    }

    public void setData(BookResponseTypeData data) {
        this.data = data;
    }

    public static class BookResponseTypeData{
        private Long orderId;
        private BigDecimal orderAmount;
        private Integer payTimeOutMinutes;

        public Long getOrderId() {
            return orderId;
        }

        public void setOrderId(Long orderId) {
            this.orderId = orderId;
        }

        public BigDecimal getOrderAmount() {
            return orderAmount;
        }

        public void setOrderAmount(BigDecimal orderAmount) {
            this.orderAmount = orderAmount;
        }

        public Integer getPayTimeOutMinutes() {
            return payTimeOutMinutes;
        }

        public void setPayTimeOutMinutes(Integer payTimeOutMinutes) {
            this.payTimeOutMinutes = payTimeOutMinutes;
        }
    }
    
}
