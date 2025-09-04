package com.trip.distribution.model.order;

import java.util.List;

public class CancelRequestType {
    private Long orderId;
    private String reason;
    private List<CancelOrderItemType> cancelOrderItems;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public List<CancelOrderItemType> getCancelOrderItems() {
        return cancelOrderItems;
    }

    public void setCancelOrderItems(List<CancelOrderItemType> cancelOrderItems) {
        this.cancelOrderItems = cancelOrderItems;
    }
}
