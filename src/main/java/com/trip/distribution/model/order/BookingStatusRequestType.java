package com.trip.distribution.model.order;

import java.util.List;

public class BookingStatusRequestType {
    private List<Long> orderIDList;
    private List<String> distributorOrderIDList;

    public List<Long> getOrderIDList() {
        return orderIDList;
    }

    public void setOrderIDList(List<Long> orderIDList) {
        this.orderIDList = orderIDList;
    }

    public List<String> getDistributorOrderIDList() {
        return distributorOrderIDList;
    }

    public void setDistributorOrderIDList(List<String> distributorOrderIDList) {
        this.distributorOrderIDList = distributorOrderIDList;
    }
}
