package com.trip.distribution.model.product;

public class GetAllProductRequestType {
    private String business;
    private String lastMaxId;
    private Integer limit;

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public String getLastMaxId() {
        return lastMaxId;
    }

    public void setLastMaxId(String lastMaxId) {
        this.lastMaxId = lastMaxId;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
