package com.trip.distribution.model.product;

import java.util.List;

public class PoiDetailRequestType {
    private String locale;
    private List<Long> poiIdList;
    private String imageSize;

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public List<Long> getPoiIdList() {
        return poiIdList;
    }

    public void setPoiIdList(List<Long> poiIdList) {
        this.poiIdList = poiIdList;
    }

    public String getImageSize() {
        return imageSize;
    }

    public void setImageSize(String imageSize) {
        this.imageSize = imageSize;
    }
}
