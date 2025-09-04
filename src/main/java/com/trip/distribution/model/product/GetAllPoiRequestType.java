package com.trip.distribution.model.product;

public class GetAllPoiRequestType {
    private String lastMaxId;
    private Integer limit;

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
