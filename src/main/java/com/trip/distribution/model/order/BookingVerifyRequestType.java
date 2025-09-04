package com.trip.distribution.model.order;

import com.trip.distribution.util.Required;

import java.util.List;

public class BookingVerifyRequestType {
    @Required
    private String locale;
    @Required
    private String currency;
    @Required
    private BasicOrder basicOrder;
    @Required
    private Contact contact;
    private List<Passenger> passengerList;
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

    public BasicOrder getBasicOrder() {
        return basicOrder;
    }

    public void setBasicOrder(BasicOrder basicOrder) {
        this.basicOrder = basicOrder;
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

    public List<AllianceExtendProperty> getAllianceExtendPropertys() {
        return allianceExtendPropertys;
    }

    public void setAllianceExtendPropertys(List<AllianceExtendProperty> allianceExtendPropertys) {
        this.allianceExtendPropertys = allianceExtendPropertys;
    }
}
