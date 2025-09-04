package com.trip.distribution.model.order;

public class CancelVerifyRequestType {
    private Long orderId;
    private String locale;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }
}
