package com.trip.distribution.model.order;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

public class RefundDetailResponseType {
    private JsonObject ResponseStatus;
    private Boolean success;
    private String errcode;
    private String errmsg;
    private RefundDetailData data;

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

    public RefundDetailData getData() {
        return data;
    }

    public void setData(RefundDetailData data) {
        this.data = data;
    }

    public static class RefundDetailData{
        private BigDecimal orderAmount;
        private List<RefundDetail> refundDetails;

        public BigDecimal getOrderAmount() {
            return orderAmount;
        }

        public void setOrderAmount(BigDecimal orderAmount) {
            this.orderAmount = orderAmount;
        }

        public List<RefundDetail> getRefundDetails() {
            return refundDetails;
        }

        public void setRefundDetails(List<RefundDetail> refundDetails) {
            this.refundDetails = refundDetails;
        }
    }

    public static class RefundDetail{
        private Long refundSerialID;
        private Long resourceID;
        private Integer refundQuantity;
        private BigDecimal refundAmount;
        private BigDecimal lossAmount;
        private String currency;
        private Calendar refundTime;
        private Integer refundStatus;
        private String reason;
        private String remark;
        private Integer orderRefundCostType;
        private Integer comeFrom;

        public Long getRefundSerialID() {
            return refundSerialID;
        }

        public void setRefundSerialID(Long refundSerialID) {
            this.refundSerialID = refundSerialID;
        }

        public Long getResourceID() {
            return resourceID;
        }

        public void setResourceID(Long resourceID) {
            this.resourceID = resourceID;
        }

        public Integer getRefundQuantity() {
            return refundQuantity;
        }

        public void setRefundQuantity(Integer refundQuantity) {
            this.refundQuantity = refundQuantity;
        }

        public BigDecimal getRefundAmount() {
            return refundAmount;
        }

        public void setRefundAmount(BigDecimal refundAmount) {
            this.refundAmount = refundAmount;
        }

        public BigDecimal getLossAmount() {
            return lossAmount;
        }

        public void setLossAmount(BigDecimal lossAmount) {
            this.lossAmount = lossAmount;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public Calendar getRefundTime() {
            return refundTime;
        }

        public void setRefundTime(Calendar refundTime) {
            this.refundTime = refundTime;
        }

        public Integer getRefundStatus() {
            return refundStatus;
        }

        public void setRefundStatus(Integer refundStatus) {
            this.refundStatus = refundStatus;
        }

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public Integer getOrderRefundCostType() {
            return orderRefundCostType;
        }

        public void setOrderRefundCostType(Integer orderRefundCostType) {
            this.orderRefundCostType = orderRefundCostType;
        }

        public Integer getComeFrom() {
            return comeFrom;
        }

        public void setComeFrom(Integer comeFrom) {
            this.comeFrom = comeFrom;
        }
    }
}
