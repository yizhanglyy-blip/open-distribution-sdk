package com.trip.distribution.model.product;

import com.trip.distribution.model.order.AllianceExtendProperty;

import java.util.List;

public class ProductDetailRequestType {
    private String locale;
    private String currency;
    private List<Long> productIDList;
    private String imageSize;
    private Boolean isCompensate;
    private List<AllianceExtendProperty> allianceExtendPropertys;

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

    public List<Long> getProductIDList() {
        return productIDList;
    }

    public void setProductIDList(List<Long> productIDList) {
        this.productIDList = productIDList;
    }

    public String getImageSize() {
        return imageSize;
    }

    public void setImageSize(String imageSize) {
        this.imageSize = imageSize;
    }

    public Boolean getCompensate() {
        return isCompensate;
    }

    public void setCompensate(Boolean compensate) {
        isCompensate = compensate;
    }

    public List<AllianceExtendProperty> getAllianceExtendPropertys() {
        return allianceExtendPropertys;
    }

    public void setAllianceExtendPropertys(List<AllianceExtendProperty> allianceExtendPropertys) {
        this.allianceExtendPropertys = allianceExtendPropertys;
    }
}
