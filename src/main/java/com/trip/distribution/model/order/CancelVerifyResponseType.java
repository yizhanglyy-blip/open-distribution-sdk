package com.trip.distribution.model.order;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.List;

public class CancelVerifyResponseType {
    private JsonObject ResponseStatus;
    private Boolean success;
    private String errcode;
    private String errmsg;
    private CancelVerifyType cancelVerifyData;

    public JsonObject getResponseStatus() {
        return ResponseStatus;
    }

    public void setResponseStatus(JsonObject responseStatus) {
        ResponseStatus = responseStatus;
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

    public CancelVerifyType getCancelVerifyData() {
        return cancelVerifyData;
    }

    public void setCancelVerifyData(CancelVerifyType cancelVerifyData) {
        this.cancelVerifyData = cancelVerifyData;
    }

    public static class CancelVerifyType{
        private Integer cancelVerifyStatus;
        private BigDecimal refundAmount;
        private Integer canPartRefund;
        private List<CancelItemType> cancelItems;

        public Integer getCancelVerifyStatus() {
            return cancelVerifyStatus;
        }

        public void setCancelVerifyStatus(Integer cancelVerifyStatus) {
            this.cancelVerifyStatus = cancelVerifyStatus;
        }

        public BigDecimal getRefundAmount() {
            return refundAmount;
        }

        public void setRefundAmount(BigDecimal refundAmount) {
            this.refundAmount = refundAmount;
        }

        public Integer getCanPartRefund() {
            return canPartRefund;
        }

        public void setCanPartRefund(Integer canPartRefund) {
            this.canPartRefund = canPartRefund;
        }

        public List<CancelItemType> getCancelItems() {
            return cancelItems;
        }

        public void setCancelItems(List<CancelItemType> cancelItems) {
            this.cancelItems = cancelItems;
        }
    }

    public static class CancelItemType{
        private Long orderItemId;
        private String resourceName;
        private Integer cancelItemStatus;
        private Integer quantity;
        private BigDecimal refundAmount;
        private BigDecimal refundCostAmount;
        private Integer refundCostType;
        private BigDecimal refundCostValue;
        private Integer refundOtherRequirement;
        private List<PassengerData> passengerList;
        private Integer refundQuantity;

        public Long getOrderItemId() {
            return orderItemId;
        }

        public void setOrderItemId(Long orderItemId) {
            this.orderItemId = orderItemId;
        }

        public String getResourceName() {
            return resourceName;
        }

        public void setResourceName(String resourceName) {
            this.resourceName = resourceName;
        }

        public Integer getCancelItemStatus() {
            return cancelItemStatus;
        }

        public void setCancelItemStatus(Integer cancelItemStatus) {
            this.cancelItemStatus = cancelItemStatus;
        }

        public Integer getQuantity() {
            return quantity;
        }

        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }

        public BigDecimal getRefundAmount() {
            return refundAmount;
        }

        public void setRefundAmount(BigDecimal refundAmount) {
            this.refundAmount = refundAmount;
        }

        public BigDecimal getRefundCostAmount() {
            return refundCostAmount;
        }

        public void setRefundCostAmount(BigDecimal refundCostAmount) {
            this.refundCostAmount = refundCostAmount;
        }

        public Integer getRefundCostType() {
            return refundCostType;
        }

        public void setRefundCostType(Integer refundCostType) {
            this.refundCostType = refundCostType;
        }

        public BigDecimal getRefundCostValue() {
            return refundCostValue;
        }

        public void setRefundCostValue(BigDecimal refundCostValue) {
            this.refundCostValue = refundCostValue;
        }

        public Integer getRefundOtherRequirement() {
            return refundOtherRequirement;
        }

        public void setRefundOtherRequirement(Integer refundOtherRequirement) {
            this.refundOtherRequirement = refundOtherRequirement;
        }

        public List<PassengerData> getPassengerList() {
            return passengerList;
        }

        public void setPassengerList(List<PassengerData> passengerList) {
            this.passengerList = passengerList;
        }

        public Integer getRefundQuantity() {
            return refundQuantity;
        }

        public void setRefundQuantity(Integer refundQuantity) {
            this.refundQuantity = refundQuantity;
        }
    }

    public static class PassengerData{

        private List<QuestionAnswer> questionAnswerList;

        public List<QuestionAnswer> getQuestionAnswerList() {
            return questionAnswerList;
        }

        public void setQuestionAnswerList(List<QuestionAnswer> questionAnswerList) {
            this.questionAnswerList = questionAnswerList;
        }
    }
}
