package com.trip.distribution.model.order;

import java.util.List;

public class BookingDetailRequestType {
    private Long orderID;
    private String distributorOrderID;
    private List<AllianceExtendProperty> allianceExtendPropertys;

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

    public List<AllianceExtendProperty> getAllianceExtendPropertys() {
        return allianceExtendPropertys;
    }

    public void setAllianceExtendPropertys(List<AllianceExtendProperty> allianceExtendPropertys) {
        this.allianceExtendPropertys = allianceExtendPropertys;
    }
}
