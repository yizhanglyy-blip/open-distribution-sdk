package com.trip.distribution.model.order;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

public class BookingDetailResponseType {
    private JsonObject ResponseStatus;
    private Boolean success;
    private String errcode;
    private String errmsg;
    private BookingDetailData data;

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

    public BookingDetailData getData() {
        return data;
    }

    public void setData(BookingDetailData data) {
        this.data = data;
    }

    public static class BookingDetailData{
        private Order order;

        public Order getOrder() {
            return order;
        }

        public void setOrder(Order order) {
            this.order = order;
        }
    }

    public static class Order{

        private Long orderId;
        private Calendar orderDate;
        private BigDecimal actualAmount;
        private Calendar clientConfirmDueDate;
        private String distributorOrderID;
        private Integer quantity;
        private BigDecimal amount;
        private String currency;
        private String locale;
        private String refundDetail;
        private Integer totalRefundQuantity;
        private BigDecimal totalRefundAmount;
        private BigDecimal totalLossyAmount;
        private String orderStatus;
        private List<OrderItem> orderItemList;
        private List<Passenger> passengerList;
        private Contact contact;
        private String voucherUrl;
        private Integer invoiceMode;
        private String ouid;
        private Integer remainingPayTime;
        private Boolean hasContract;
        private String pinCode;
        private Boolean canModifyUseDate;
        private Boolean canModifyCertificates;
        private Boolean isReserveOrder;
        private Calendar beginPurchaseTime;

        public Long getOrderId() {
            return orderId;
        }

        public void setOrderId(Long orderId) {
            this.orderId = orderId;
        }

        public Calendar getOrderDate() {
            return orderDate;
        }

        public void setOrderDate(Calendar orderDate) {
            this.orderDate = orderDate;
        }

        public BigDecimal getActualAmount() {
            return actualAmount;
        }

        public void setActualAmount(BigDecimal actualAmount) {
            this.actualAmount = actualAmount;
        }

        public Calendar getClientConfirmDueDate() {
            return clientConfirmDueDate;
        }

        public void setClientConfirmDueDate(Calendar clientConfirmDueDate) {
            this.clientConfirmDueDate = clientConfirmDueDate;
        }

        public String getDistributorOrderID() {
            return distributorOrderID;
        }

        public void setDistributorOrderID(String distributorOrderID) {
            this.distributorOrderID = distributorOrderID;
        }

        public Integer getQuantity() {
            return quantity;
        }

        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }

        public BigDecimal getAmount() {
            return amount;
        }

        public void setAmount(BigDecimal amount) {
            this.amount = amount;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public String getLocale() {
            return locale;
        }

        public void setLocale(String locale) {
            this.locale = locale;
        }

        public String getRefundDetail() {
            return refundDetail;
        }

        public void setRefundDetail(String refundDetail) {
            this.refundDetail = refundDetail;
        }

        public Integer getTotalRefundQuantity() {
            return totalRefundQuantity;
        }

        public void setTotalRefundQuantity(Integer totalRefundQuantity) {
            this.totalRefundQuantity = totalRefundQuantity;
        }

        public BigDecimal getTotalRefundAmount() {
            return totalRefundAmount;
        }

        public void setTotalRefundAmount(BigDecimal totalRefundAmount) {
            this.totalRefundAmount = totalRefundAmount;
        }

        public BigDecimal getTotalLossyAmount() {
            return totalLossyAmount;
        }

        public void setTotalLossyAmount(BigDecimal totalLossyAmount) {
            this.totalLossyAmount = totalLossyAmount;
        }

        public String getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
        }

        public List<OrderItem> getOrderItemList() {
            return orderItemList;
        }

        public void setOrderItemList(List<OrderItem> orderItemList) {
            this.orderItemList = orderItemList;
        }

        public List<Passenger> getPassengerList() {
            return passengerList;
        }

        public void setPassengerList(List<Passenger> passengerList) {
            this.passengerList = passengerList;
        }

        public Contact getContact() {
            return contact;
        }

        public void setContact(Contact contact) {
            this.contact = contact;
        }

        public String getVoucherUrl() {
            return voucherUrl;
        }

        public void setVoucherUrl(String voucherUrl) {
            this.voucherUrl = voucherUrl;
        }

        public Integer getInvoiceMode() {
            return invoiceMode;
        }

        public void setInvoiceMode(Integer invoiceMode) {
            this.invoiceMode = invoiceMode;
        }

        public String getOuid() {
            return ouid;
        }

        public void setOuid(String ouid) {
            this.ouid = ouid;
        }

        public Integer getRemainingPayTime() {
            return remainingPayTime;
        }

        public void setRemainingPayTime(Integer remainingPayTime) {
            this.remainingPayTime = remainingPayTime;
        }

        public Boolean getHasContract() {
            return hasContract;
        }

        public void setHasContract(Boolean hasContract) {
            this.hasContract = hasContract;
        }

        public String getPinCode() {
            return pinCode;
        }

        public void setPinCode(String pinCode) {
            this.pinCode = pinCode;
        }

        public Boolean getCanModifyUseDate() {
            return canModifyUseDate;
        }

        public void setCanModifyUseDate(Boolean canModifyUseDate) {
            this.canModifyUseDate = canModifyUseDate;
        }

        public Boolean getCanModifyCertificates() {
            return canModifyCertificates;
        }

        public void setCanModifyCertificates(Boolean canModifyCertificates) {
            this.canModifyCertificates = canModifyCertificates;
        }

        public Boolean getReserveOrder() {
            return isReserveOrder;
        }

        public void setReserveOrder(Boolean reserveOrder) {
            isReserveOrder = reserveOrder;
        }

        public Calendar getBeginPurchaseTime() {
            return beginPurchaseTime;
        }

        public void setBeginPurchaseTime(Calendar beginPurchaseTime) {
            this.beginPurchaseTime = beginPurchaseTime;
        }
    }
    
    public static class OrderItem{
        Long orderItemId;
        Long productID;
        String productName;
        Long packageID;
        String packageName;
        Long resourceID;
        String resourceName;
        Integer unitQuantity;
        BigDecimal amount;
        Integer quantity;
        BigDecimal price;
        String bandTitle;
        Calendar useDate;
        Calendar endDate;
        Integer actualQuantity;
        Integer refundQuantity;
        BigDecimal refundAmount;
        BigDecimal lossyAmount;
        String instruction;
        String additionalInformation;
        BigDecimal depositAmount;
        Integer depositQuantity;
        String depositChargeUnit;
        String depositCurrency;
        String depositPayMode;
        List<Logistics> logistics;
        Integer modifyProcessStatus;
        Integer modifyCertificatesStatus;
        Calendar modifyUseDate;

        public Long getOrderItemId() {
            return orderItemId;
        }

        public void setOrderItemId(Long orderItemId) {
            this.orderItemId = orderItemId;
        }

        public Long getProductID() {
            return productID;
        }

        public void setProductID(Long productID) {
            this.productID = productID;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public Long getPackageID() {
            return packageID;
        }

        public void setPackageID(Long packageID) {
            this.packageID = packageID;
        }

        public String getPackageName() {
            return packageName;
        }

        public void setPackageName(String packageName) {
            this.packageName = packageName;
        }

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

        public Integer getUnitQuantity() {
            return unitQuantity;
        }

        public void setUnitQuantity(Integer unitQuantity) {
            this.unitQuantity = unitQuantity;
        }

        public BigDecimal getAmount() {
            return amount;
        }

        public void setAmount(BigDecimal amount) {
            this.amount = amount;
        }

        public Integer getQuantity() {
            return quantity;
        }

        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }

        public String getBandTitle() {
            return bandTitle;
        }

        public void setBandTitle(String bandTitle) {
            this.bandTitle = bandTitle;
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

        public Integer getActualQuantity() {
            return actualQuantity;
        }

        public void setActualQuantity(Integer actualQuantity) {
            this.actualQuantity = actualQuantity;
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

        public BigDecimal getLossyAmount() {
            return lossyAmount;
        }

        public void setLossyAmount(BigDecimal lossyAmount) {
            this.lossyAmount = lossyAmount;
        }

        public String getInstruction() {
            return instruction;
        }

        public void setInstruction(String instruction) {
            this.instruction = instruction;
        }

        public String getAdditionalInformation() {
            return additionalInformation;
        }

        public void setAdditionalInformation(String additionalInformation) {
            this.additionalInformation = additionalInformation;
        }

        public BigDecimal getDepositAmount() {
            return depositAmount;
        }

        public void setDepositAmount(BigDecimal depositAmount) {
            this.depositAmount = depositAmount;
        }

        public Integer getDepositQuantity() {
            return depositQuantity;
        }

        public void setDepositQuantity(Integer depositQuantity) {
            this.depositQuantity = depositQuantity;
        }

        public String getDepositChargeUnit() {
            return depositChargeUnit;
        }

        public void setDepositChargeUnit(String depositChargeUnit) {
            this.depositChargeUnit = depositChargeUnit;
        }

        public String getDepositCurrency() {
            return depositCurrency;
        }

        public void setDepositCurrency(String depositCurrency) {
            this.depositCurrency = depositCurrency;
        }

        public String getDepositPayMode() {
            return depositPayMode;
        }

        public void setDepositPayMode(String depositPayMode) {
            this.depositPayMode = depositPayMode;
        }

        public List<Logistics> getLogistics() {
            return logistics;
        }

        public void setLogistics(List<Logistics> logistics) {
            this.logistics = logistics;
        }

        public Integer getModifyProcessStatus() {
            return modifyProcessStatus;
        }

        public void setModifyProcessStatus(Integer modifyProcessStatus) {
            this.modifyProcessStatus = modifyProcessStatus;
        }

        public Integer getModifyCertificatesStatus() {
            return modifyCertificatesStatus;
        }

        public void setModifyCertificatesStatus(Integer modifyCertificatesStatus) {
            this.modifyCertificatesStatus = modifyCertificatesStatus;
        }

        public Calendar getModifyUseDate() {
            return modifyUseDate;
        }

        public void setModifyUseDate(Calendar modifyUseDate) {
            this.modifyUseDate = modifyUseDate;
        }
    }
    
    public static class Logistics{
        String expressNumber;
        String companyName;
        String companyCode;

        public String getExpressNumber() {
            return expressNumber;
        }

        public void setExpressNumber(String expressNumber) {
            this.expressNumber = expressNumber;
        }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public String getCompanyCode() {
            return companyCode;
        }

        public void setCompanyCode(String companyCode) {
            this.companyCode = companyCode;
        }
    }
}
