package com.trip.distribution.model.product;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SearchProductRequestType {
    private String locale;
    private String currency;
    @SerializedName("destination")
    private LocationRequest destination;
    private List<Long> categoryIDList;
    private List<Long> poiIDList;
    private String sortOrder;
    private Integer pageIndex;
    private Integer pageSize;
    private String imageSize;
    private String keyWord;
    private Long lastUpdateProductID;
    @SerializedName("site")
    private LocationRequest site;
    private String business;

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public LocationRequest getDestination() {
        return destination;
    }

    public void setDestination(LocationRequest destination) {
        this.destination = destination;
    }

    public List<Long> getCategoryIDList() {
        return categoryIDList;
    }

    public void setCategoryIDList(List<Long> categoryIDList) {
        this.categoryIDList = categoryIDList;
    }

    public List<Long> getPoiIDList() {
        return poiIDList;
    }

    public void setPoiIDList(List<Long> poiIDList) {
        this.poiIDList = poiIDList;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getImageSize() {
        return imageSize;
    }

    public void setImageSize(String imageSize) {
        this.imageSize = imageSize;
    }

    public Long getLastUpdateProductID() {
        return lastUpdateProductID;
    }

    public void setLastUpdateProductID(Long lastUpdateProductID) {
        this.lastUpdateProductID = lastUpdateProductID;
    }

    public LocationRequest getSite() {
        return site;
    }

    public void setSite(LocationRequest site) {
        this.site = site;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }
}
