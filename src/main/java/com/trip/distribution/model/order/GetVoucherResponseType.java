package com.trip.distribution.model.order;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.util.Calendar;
import java.util.List;

public class GetVoucherResponseType {
    private JsonObject ResponseStatus;
    private GetVoucherData data;
    private Boolean success;
    private String errcode;
    private String errmsg;

    public JsonObject getResponseStatus() {
        return ResponseStatus;
    }

    public void setResponseStatus(JsonObject responseStatus) {
        ResponseStatus = responseStatus;
    }

    public GetVoucherData getData() {
        return data;
    }

    public void setData(GetVoucherData data) {
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

    public static class GetVoucherData{
        Long orderID;
        String thirdOrderID;
        String voucherUrl;
        List<VoucherWrap> voucherWrapList;

        public Long getOrderID() {
            return orderID;
        }

        public void setOrderID(Long orderID) {
            this.orderID = orderID;
        }

        public String getThirdOrderID() {
            return thirdOrderID;
        }

        public void setThirdOrderID(String thirdOrderID) {
            this.thirdOrderID = thirdOrderID;
        }

        public String getVoucherUrl() {
            return voucherUrl;
        }

        public void setVoucherUrl(String voucherUrl) {
            this.voucherUrl = voucherUrl;
        }

        public List<VoucherWrap> getVoucherWrapList() {
            return voucherWrapList;
        }

        public void setVoucherWrapList(List<VoucherWrap> voucherWrapList) {
            this.voucherWrapList = voucherWrapList;
        }
    }
    
    public static class VoucherWrap{
        Long resourceID;
        String resourceName;
        String supplierConfirmation;
        List<VoucherInfo> voucherInfoList;
        Calendar useDate;
        Calendar endDate;
        String useValidity;
        String productUseMsg;
        String vendorVoucher;

        public Long getResourceID() {
            return resourceID;
        }

        public void setResourceID(Long resourceID) {
            this.resourceID = resourceID;
        }

        public String getResourceName() {
            return resourceName;
        }

        public void setResourceName(String resourceName) {
            this.resourceName = resourceName;
        }

        public String getSupplierConfirmation() {
            return supplierConfirmation;
        }

        public void setSupplierConfirmation(String supplierConfirmation) {
            this.supplierConfirmation = supplierConfirmation;
        }

        public List<VoucherInfo> getVoucherInfoList() {
            return voucherInfoList;
        }

        public void setVoucherInfoList(List<VoucherInfo> voucherInfoList) {
            this.voucherInfoList = voucherInfoList;
        }

        public Calendar getUseDate() {
            return useDate;
        }

        public void setUseDate(Calendar useDate) {
            this.useDate = useDate;
        }

        public Calendar getEndDate() {
            return endDate;
        }

        public void setEndDate(Calendar endDate) {
            this.endDate = endDate;
        }

        public String getUseValidity() {
            return useValidity;
        }

        public void setUseValidity(String useValidity) {
            this.useValidity = useValidity;
        }

        public String getProductUseMsg() {
            return productUseMsg;
        }

        public void setProductUseMsg(String productUseMsg) {
            this.productUseMsg = productUseMsg;
        }

        public String getVendorVoucher() {
            return vendorVoucher;
        }

        public void setVendorVoucher(String vendorVoucher) {
            this.vendorVoucher = vendorVoucher;
        }
    }

    public static class VoucherInfo{
        String voucherDescription;
        String voucherNO;
        String imageShortUrl;
        String imageUrl;
        String voucherFileUrl;
        String supplierVoucherUrl;
        String extendMessage;
        String imageOriginalCode;
        String seatInfo;
        String originalExtendMessage;
        String voucherExtendMessage;

        public String getVoucherDescription() {
            return voucherDescription;
        }

        public void setVoucherDescription(String voucherDescription) {
            this.voucherDescription = voucherDescription;
        }

        public String getVoucherNO() {
            return voucherNO;
        }

        public void setVoucherNO(String voucherNO) {
            this.voucherNO = voucherNO;
        }

        public String getImageShortUrl() {
            return imageShortUrl;
        }

        public void setImageShortUrl(String imageShortUrl) {
            this.imageShortUrl = imageShortUrl;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getVoucherFileUrl() {
            return voucherFileUrl;
        }

        public void setVoucherFileUrl(String voucherFileUrl) {
            this.voucherFileUrl = voucherFileUrl;
        }

        public String getSupplierVoucherUrl() {
            return supplierVoucherUrl;
        }

        public void setSupplierVoucherUrl(String supplierVoucherUrl) {
            this.supplierVoucherUrl = supplierVoucherUrl;
        }

        public String getExtendMessage() {
            return extendMessage;
        }

        public void setExtendMessage(String extendMessage) {
            this.extendMessage = extendMessage;
        }

        public String getImageOriginalCode() {
            return imageOriginalCode;
        }

        public void setImageOriginalCode(String imageOriginalCode) {
            this.imageOriginalCode = imageOriginalCode;
        }

        public String getSeatInfo() {
            return seatInfo;
        }

        public void setSeatInfo(String seatInfo) {
            this.seatInfo = seatInfo;
        }

        public String getOriginalExtendMessage() {
            return originalExtendMessage;
        }

        public void setOriginalExtendMessage(String originalExtendMessage) {
            this.originalExtendMessage = originalExtendMessage;
        }

        public String getVoucherExtendMessage() {
            return voucherExtendMessage;
        }

        public void setVoucherExtendMessage(String voucherExtendMessage) {
            this.voucherExtendMessage = voucherExtendMessage;
        }
    }
}
