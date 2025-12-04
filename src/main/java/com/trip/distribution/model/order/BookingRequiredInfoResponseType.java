package com.trip.distribution.model.order;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BookingRequiredInfoResponseType {
    private JsonObject ResponseStatus;
    private BookingRequiredInfoData data;
    private Boolean success;
    private String errcode;
    private String errmsg;

    public JsonObject getResponseStatus() {
        return ResponseStatus;
    }

    public void setResponseStatus(JsonObject responseStatus) {
        ResponseStatus = responseStatus;
    }

    public BookingRequiredInfoData getData() {
        return data;
    }

    public void setData(BookingRequiredInfoData data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public static class BookingRequiredInfoData{
        private ContactRequried contact;
        private List<Question> passengerQuestionList;
        private BookingLimit bookingLimit;

        public ContactRequried getContact() {
            return contact;
        }

        public void setContact(ContactRequried contact) {
            this.contact = contact;
        }

        public List<Question> getPassengerQuestionList() {
            return passengerQuestionList;
        }

        public void setPassengerQuestionList(List<Question> passengerQuestionList) {
            this.passengerQuestionList = passengerQuestionList;
        }

        public BookingLimit getBookingLimit() {
            return bookingLimit;
        }

        public void setBookingLimit(BookingLimit bookingLimit) {
            this.bookingLimit = bookingLimit;
        }
    }
    
    
    public static class ContactRequried{
        private Boolean nameRequried;
        private Boolean mobileRequried;
        private Boolean emailRequried;
        private Boolean deliveryRequried;

        private Boolean nameRequired;
        private Boolean mobileRequired;
        private Boolean emailRequired;
        private Boolean deliveryRequired;

        private Boolean imRequired;
        private List<ContactItem> contactItemList;

        public Boolean getNameRequried() {
            return nameRequried;
        }

        public void setNameRequried(Boolean nameRequried) {
            this.nameRequried = nameRequried;
        }

        public Boolean getMobileRequried() {
            return mobileRequried;
        }

        public void setMobileRequried(Boolean mobileRequried) {
            this.mobileRequried = mobileRequried;
        }

        public Boolean getEmailRequried() {
            return emailRequried;
        }

        public void setEmailRequried(Boolean emailRequried) {
            this.emailRequried = emailRequried;
        }

        public Boolean getDeliveryRequried() {
            return deliveryRequried;
        }

        public void setDeliveryRequried(Boolean deliveryRequried) {
            this.deliveryRequried = deliveryRequried;
        }

        public Boolean getNameRequired() {
            return nameRequired;
        }

        public void setNameRequired(Boolean nameRequired) {
            this.nameRequired = nameRequired;
        }

        public Boolean getMobileRequired() {
            return mobileRequired;
        }

        public void setMobileRequired(Boolean mobileRequired) {
            this.mobileRequired = mobileRequired;
        }

        public Boolean getEmailRequired() {
            return emailRequired;
        }

        public void setEmailRequired(Boolean emailRequired) {
            this.emailRequired = emailRequired;
        }

        public Boolean getDeliveryRequired() {
            return deliveryRequired;
        }

        public void setDeliveryRequired(Boolean deliveryRequired) {
            this.deliveryRequired = deliveryRequired;
        }

        public Boolean getImRequired() {
            return imRequired;
        }

        public void setImRequired(Boolean imRequired) {
            this.imRequired = imRequired;
        }

        public List<ContactItem> getContactItemList() {
            return contactItemList;
        }

        public void setContactItemList(List<ContactItem> contactItemList) {
            this.contactItemList = contactItemList;
        }
    }


    public static class ContactItem{
        private Integer id;
        private String name;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


    public static class Question{
        private Long questionID;
        private String code;
        private String type;
        private Boolean allPassagerRequired;
        private String title;
        private String selectType;
        private String dataType;
        private List<QuestionItem> questionItemList;
        private String remark;
        private Long resourceId;

        public Long getQuestionID() {
            return questionID;
        }

        public void setQuestionID(Long questionID) {
            this.questionID = questionID;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Boolean getAllPassagerRequired() {
            return allPassagerRequired;
        }

        public void setAllPassagerRequired(Boolean allPassagerRequired) {
            this.allPassagerRequired = allPassagerRequired;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSelectType() {
            return selectType;
        }

        public void setSelectType(String selectType) {
            this.selectType = selectType;
        }

        public String getDataType() {
            return dataType;
        }

        public void setDataType(String dataType) {
            this.dataType = dataType;
        }

        public List<QuestionItem> getQuestionItemList() {
            return questionItemList;
        }

        public void setQuestionItemList(List<QuestionItem> questionItemList) {
            this.questionItemList = questionItemList;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public Long getResourceId() {
            return resourceId;
        }

        public void setResourceId(Long resourceId) {
            this.resourceId = resourceId;
        }
    }
    
    public static class QuestionItem{
        private Long itemID;
        private String title;

        public Long getItemID() {
            return itemID;
        }

        public void setItemID(Long itemID) {
            this.itemID = itemID;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }

    public static class BookingLimit{
        private Integer limit;

        public Integer getLimit() {
            return limit;
        }

        public void setLimit(Integer limit) {
            this.limit = limit;
        }
    }
    
}
