package com.trip.distribution.model.order;

import java.math.BigDecimal;
import java.util.List;

public class BasicOrder {
    private Long productID;
    private Long poiID;
    private BigDecimal amount;
    private Long packageID;
    private List<OrderResource> orderResourceList;

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    public Long getPoiID() {
        return poiID;
    }

    public void setPoiID(Long poiID) {
        this.poiID = poiID;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Long getPackageID() {
        return packageID;
    }

    public void setPackageID(Long packageID) {
        this.packageID = packageID;
    }

    public List<OrderResource> getOrderResourceList() {
        return orderResourceList;
    }

    public void setOrderResourceList(List<OrderResource> orderResourceList) {
        this.orderResourceList = orderResourceList;
    }
}
