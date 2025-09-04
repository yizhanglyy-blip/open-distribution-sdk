package com.trip.distribution.model.order;

import java.util.List;

public class CancelOrderItemType {
    private Long orderItemId;
    private Integer quantity;
    private List<Long> clientIdList;

    public Long getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Long orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public List<Long> getClientIdList() {
        return clientIdList;
    }

    public void setClientIdList(List<Long> clientIdList) {
        this.clientIdList = clientIdList;
    }
}
