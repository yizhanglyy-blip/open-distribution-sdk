package com.trip.distribution.model.order;

import com.trip.distribution.util.Required;

import java.util.List;

public class BookingRequiredInfoRequestType {
    @Required
    private String locale;
    @Required
    private String currency;
    @Required
    private Long productID;
    @Required
    private Long packageID;
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

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    public Long getPackageID() {
        return packageID;
    }

    public void setPackageID(Long packageID) {
        this.packageID = packageID;
    }

    public List<AllianceExtendProperty> getAllianceExtendPropertys() {
        return allianceExtendPropertys;
    }

    public void setAllianceExtendPropertys(List<AllianceExtendProperty> allianceExtendPropertys) {
        this.allianceExtendPropertys = allianceExtendPropertys;
    }
}
