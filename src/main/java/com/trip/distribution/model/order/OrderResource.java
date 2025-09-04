package com.trip.distribution.model.order;

import java.math.BigDecimal;
import java.util.List;

public class OrderResource {
    private Long resourceID;
    private String useDate;
    private String endDate;
    private Integer day;
    private Integer quantity;
    private BigDecimal price;
    private List<SubOrderResource> subOrderResourceList;

    public Long getResourceID() {
        return resourceID;
    }

    public void setResourceID(Long resourceID) {
        this.resourceID = resourceID;
    }

    public String getUseDate() {
        return useDate;
    }

    public void setUseDate(String useDate) {
        this.useDate = useDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<SubOrderResource> getSubOrderResourceList() {
        return subOrderResourceList;
    }

    public void setSubOrderResourceList(List<SubOrderResource> subOrderResourceList) {
        this.subOrderResourceList = subOrderResourceList;
    }
}
