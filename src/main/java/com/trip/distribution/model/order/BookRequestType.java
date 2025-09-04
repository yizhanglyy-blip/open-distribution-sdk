package com.trip.distribution.model.order;

import java.util.List;

public class BookRequestType {
    private String locale;
    private String currency;
    private String distributorOrderID;
    private String specialUniqueKey;
    private Contact contact;
    private List<Passenger> passengerList;
    private BasicOrder basicOrder;
    private List<OrderPromotion> promotionList;
    private Integer paymentType;
    private List<KeyValuePairType> extraParams;
    private List<AllianceExtendProperty> allianceExtendPropertys;
    private Long contractTemplateId;

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

    public String getDistributorOrderID() {
        return distributorOrderID;
    }

    public void setDistributorOrderID(String distributorOrderID) {
        this.distributorOrderID = distributorOrderID;
    }

    public String getSpecialUniqueKey() {
        return specialUniqueKey;
    }

    public void setSpecialUniqueKey(String specialUniqueKey) {
        this.specialUniqueKey = specialUniqueKey;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;
    }

    public BasicOrder getBasicOrder() {
        return basicOrder;
    }

    public void setBasicOrder(BasicOrder basicOrder) {
        this.basicOrder = basicOrder;
    }

    public List<OrderPromotion> getPromotionList() {
        return promotionList;
    }

    public void setPromotionList(List<OrderPromotion> promotionList) {
        this.promotionList = promotionList;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public List<KeyValuePairType> getExtraParams() {
        return extraParams;
    }

    public void setExtraParams(List<KeyValuePairType> extraParams) {
        this.extraParams = extraParams;
    }

    public List<AllianceExtendProperty> getAllianceExtendPropertys() {
        return allianceExtendPropertys;
    }

    public void setAllianceExtendPropertys(List<AllianceExtendProperty> allianceExtendPropertys) {
        this.allianceExtendPropertys = allianceExtendPropertys;
    }

    public Long getContractTemplateId() {
        return contractTemplateId;
    }

    public void setContractTemplateId(Long contractTemplateId) {
        this.contractTemplateId = contractTemplateId;
    }
}
