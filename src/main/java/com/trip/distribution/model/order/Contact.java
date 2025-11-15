package com.trip.distribution.model.order;

public class Contact {
    private String name;
    private Mobile mobile;
    private String email;
    private Delivery delivery;
    private Integer imType;
    private String imName;
    private String imId;
    private Integer imModifyStatus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public Integer getImType() {
        return imType;
    }

    public void setImType(Integer imType) {
        this.imType = imType;
    }

    public String getImName() {
        return imName;
    }

    public void setImName(String imName) {
        this.imName = imName;
    }

    public String getImId() {
        return imId;
    }

    public void setImId(String imId) {
        this.imId = imId;
    }

    public Integer getImModifyStatus() {
        return imModifyStatus;
    }

    public void setImModifyStatus(Integer imModifyStatus) {
        this.imModifyStatus = imModifyStatus;
    }
}
