package com.trip.distribution.model.product;

import com.google.gson.JsonObject;
import java.math.BigDecimal;
import java.util.List;

public class ProductDetailResponseType {
    private ProductDetailData data;
    private JsonObject ResponseStatus;
    private Boolean success;
    private String errcode;
    private String errmsg;

    public ProductDetailData getData() {
        return data;
    }

    public void setData(ProductDetailData data) {
        this.data = data;
    }

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

    public static class ProductDetailData{
        private List<Product> productList;

        public List<Product> getProductList() {
            return productList;
        }

        public void setProductList(List<Product> productList) {
            this.productList = productList;
        }
    }

    public static class Product{
        private Long productID;
        private Category category;
        private Boolean saleAvailable;
        private String locale;
        private String name;
        private String url;
        private List<Location> departureList;
        private List<Location> destinationList;
        private List<Long> poiIdList;
        private Integer timeZone;
        private String currency;
        private BigDecimal salePrice;
        private BigDecimal netPrice;
        private String meetMode;
        private List<String> serviceLanguageList;
        private Boolean sendVoucher;
        private String voucherSender;
        private String voucherOption;
        private List<Image> imageList;
        private String description;
        private String salesPoint;
        private String inclusion;
        private String exclusion;
        private String attention;
        private String instruction;
        private String tourDescription;
        private String confirmType;
        private RefundPolicy refundPolicy;
        private String bookingEffectiveTimeDescription;
        private List<Package> packageList;
        private List<BandUnit> bandList;
        private String applicableGroups;
        private String productDescription;
        private BigDecimal rating;
        private String priceMode;
        private Integer dayCountMin;
        private Integer dayCountMax;
        private Duration duration;
        private String usageTime;
        private ConfirmTime confirmTime;
        private String deposit;
        private List<ProductLabel> productLabels;
        private Integer invoiceMode;
        private ServiceProvider serviceProviderInfo;
        private Integer commentTotalCount;
        private Boolean isReservation;
        private List<ProductAdditionInfoType> productAdditionalInfoList;
        private CustomizeRefundPolicy customizeRefundPolicy;
        private String business;
        private String refundDescription;
        private Boolean overdueRefund;
        private BigDecimal marketPrice;
        private String marketPriceCurrency;
        private Integer type;
        private EduCertificationInfoType eduCertificationInfo;
        private boolean isPackage;

        public Long getProductID() {
            return productID;
        }

        public void setProductID(Long productID) {
            this.productID = productID;
        }

        public Category getCategory() {
            return category;
        }

        public void setCategory(Category category) {
            this.category = category;
        }

        public Boolean getSaleAvailable() {
            return saleAvailable;
        }

        public void setSaleAvailable(Boolean saleAvailable) {
            this.saleAvailable = saleAvailable;
        }

        public String getLocale() {
            return locale;
        }

        public void setLocale(String locale) {
            this.locale = locale;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public List<Location> getDepartureList() {
            return departureList;
        }

        public void setDepartureList(List<Location> departureList) {
            this.departureList = departureList;
        }

        public List<Location> getDestinationList() {
            return destinationList;
        }

        public void setDestinationList(List<Location> destinationList) {
            this.destinationList = destinationList;
        }

        public List<Long> getPoiIdList() {
            return poiIdList;
        }

        public void setPoiIdList(List<Long> poiIdList) {
            this.poiIdList = poiIdList;
        }

        public Integer getTimeZone() {
            return timeZone;
        }

        public void setTimeZone(Integer timeZone) {
            this.timeZone = timeZone;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public BigDecimal getSalePrice() {
            return salePrice;
        }

        public void setSalePrice(BigDecimal salePrice) {
            this.salePrice = salePrice;
        }

        public BigDecimal getNetPrice() {
            return netPrice;
        }

        public void setNetPrice(BigDecimal netPrice) {
            this.netPrice = netPrice;
        }

        public String getMeetMode() {
            return meetMode;
        }

        public void setMeetMode(String meetMode) {
            this.meetMode = meetMode;
        }

        public List<String> getServiceLanguageList() {
            return serviceLanguageList;
        }

        public void setServiceLanguageList(List<String> serviceLanguageList) {
            this.serviceLanguageList = serviceLanguageList;
        }

        public Boolean getSendVoucher() {
            return sendVoucher;
        }

        public void setSendVoucher(Boolean sendVoucher) {
            this.sendVoucher = sendVoucher;
        }

        public String getVoucherSender() {
            return voucherSender;
        }

        public void setVoucherSender(String voucherSender) {
            this.voucherSender = voucherSender;
        }

        public String getVoucherOption() {
            return voucherOption;
        }

        public void setVoucherOption(String voucherOption) {
            this.voucherOption = voucherOption;
        }

        public List<Image> getImageList() {
            return imageList;
        }

        public void setImageList(List<Image> imageList) {
            this.imageList = imageList;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getSalesPoint() {
            return salesPoint;
        }

        public void setSalesPoint(String salesPoint) {
            this.salesPoint = salesPoint;
        }

        public String getInclusion() {
            return inclusion;
        }

        public void setInclusion(String inclusion) {
            this.inclusion = inclusion;
        }

        public String getExclusion() {
            return exclusion;
        }

        public void setExclusion(String exclusion) {
            this.exclusion = exclusion;
        }

        public String getAttention() {
            return attention;
        }

        public void setAttention(String attention) {
            this.attention = attention;
        }

        public String getInstruction() {
            return instruction;
        }

        public void setInstruction(String instruction) {
            this.instruction = instruction;
        }

        public String getTourDescription() {
            return tourDescription;
        }

        public void setTourDescription(String tourDescription) {
            this.tourDescription = tourDescription;
        }

        public String getConfirmType() {
            return confirmType;
        }

        public void setConfirmType(String confirmType) {
            this.confirmType = confirmType;
        }

        public RefundPolicy getRefundPolicy() {
            return refundPolicy;
        }

        public void setRefundPolicy(RefundPolicy refundPolicy) {
            this.refundPolicy = refundPolicy;
        }

        public String getBookingEffectiveTimeDescription() {
            return bookingEffectiveTimeDescription;
        }

        public void setBookingEffectiveTimeDescription(String bookingEffectiveTimeDescription) {
            this.bookingEffectiveTimeDescription = bookingEffectiveTimeDescription;
        }

        public List<Package> getPackageList() {
            return packageList;
        }

        public void setPackageList(List<Package> packageList) {
            this.packageList = packageList;
        }

        public List<BandUnit> getBandList() {
            return bandList;
        }

        public void setBandList(List<BandUnit> bandList) {
            this.bandList = bandList;
        }

        public String getApplicableGroups() {
            return applicableGroups;
        }

        public void setApplicableGroups(String applicableGroups) {
            this.applicableGroups = applicableGroups;
        }

        public String getProductDescription() {
            return productDescription;
        }

        public void setProductDescription(String productDescription) {
            this.productDescription = productDescription;
        }

        public BigDecimal getRating() {
            return rating;
        }

        public void setRating(BigDecimal rating) {
            this.rating = rating;
        }

        public String getPriceMode() {
            return priceMode;
        }

        public void setPriceMode(String priceMode) {
            this.priceMode = priceMode;
        }

        public Integer getDayCountMin() {
            return dayCountMin;
        }

        public void setDayCountMin(Integer dayCountMin) {
            this.dayCountMin = dayCountMin;
        }

        public Integer getDayCountMax() {
            return dayCountMax;
        }

        public void setDayCountMax(Integer dayCountMax) {
            this.dayCountMax = dayCountMax;
        }

        public Duration getDuration() {
            return duration;
        }

        public void setDuration(Duration duration) {
            this.duration = duration;
        }

        public String getUsageTime() {
            return usageTime;
        }

        public void setUsageTime(String usageTime) {
            this.usageTime = usageTime;
        }

        public ConfirmTime getConfirmTime() {
            return confirmTime;
        }

        public void setConfirmTime(ConfirmTime confirmTime) {
            this.confirmTime = confirmTime;
        }

        public String getDeposit() {
            return deposit;
        }

        public void setDeposit(String deposit) {
            this.deposit = deposit;
        }

        public List<ProductLabel> getProductLabels() {
            return productLabels;
        }

        public void setProductLabels(List<ProductLabel> productLabels) {
            this.productLabels = productLabels;
        }

        public Integer getInvoiceMode() {
            return invoiceMode;
        }

        public void setInvoiceMode(Integer invoiceMode) {
            this.invoiceMode = invoiceMode;
        }

        public ServiceProvider getServiceProviderInfo() {
            return serviceProviderInfo;
        }

        public void setServiceProviderInfo(ServiceProvider serviceProviderInfo) {
            this.serviceProviderInfo = serviceProviderInfo;
        }

        public Integer getCommentTotalCount() {
            return commentTotalCount;
        }

        public void setCommentTotalCount(Integer commentTotalCount) {
            this.commentTotalCount = commentTotalCount;
        }

        public Boolean getReservation() {
            return isReservation;
        }

        public void setReservation(Boolean reservation) {
            isReservation = reservation;
        }

        public List<ProductAdditionInfoType> getProductAdditionalInfoList() {
            return productAdditionalInfoList;
        }

        public void setProductAdditionalInfoList(List<ProductAdditionInfoType> productAdditionalInfoList) {
            this.productAdditionalInfoList = productAdditionalInfoList;
        }

        public CustomizeRefundPolicy getCustomizeRefundPolicy() {
            return customizeRefundPolicy;
        }

        public void setCustomizeRefundPolicy(CustomizeRefundPolicy customizeRefundPolicy) {
            this.customizeRefundPolicy = customizeRefundPolicy;
        }

        public String getBusiness() {
            return business;
        }

        public void setBusiness(String business) {
            this.business = business;
        }

        public String getRefundDescription() {
            return refundDescription;
        }

        public void setRefundDescription(String refundDescription) {
            this.refundDescription = refundDescription;
        }

        public Boolean getOverdueRefund() {
            return overdueRefund;
        }

        public void setOverdueRefund(Boolean overdueRefund) {
            this.overdueRefund = overdueRefund;
        }

        public BigDecimal getMarketPrice() {
            return marketPrice;
        }

        public void setMarketPrice(BigDecimal marketPrice) {
            this.marketPrice = marketPrice;
        }

        public String getMarketPriceCurrency() {
            return marketPriceCurrency;
        }

        public void setMarketPriceCurrency(String marketPriceCurrency) {
            this.marketPriceCurrency = marketPriceCurrency;
        }

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public EduCertificationInfoType getEduCertificationInfo() {
            return eduCertificationInfo;
        }

        public void setEduCertificationInfo(EduCertificationInfoType eduCertificationInfo) {
            this.eduCertificationInfo = eduCertificationInfo;
        }

        public boolean isPackage() {
            return isPackage;
        }

        public void setPackage(boolean aPackage) {
            isPackage = aPackage;
        }
    }

    public static class Category{
        private Long categoryID;
        private String categoryName;
        private List<Category> subcategoryList;

        public Long getCategoryID() {
            return categoryID;
        }

        public void setCategoryID(Long categoryID) {
            this.categoryID = categoryID;
        }

        public String getCategoryName() {
            return categoryName;
        }

        public void setCategoryName(String categoryName) {
            this.categoryName = categoryName;
        }

        public List<Category> getSubcategoryList() {
            return subcategoryList;
        }

        public void setSubcategoryList(List<Category> subcategoryList) {
            this.subcategoryList = subcategoryList;
        }
    }

    public static class Location{
        private Long locationID;
        private String type;
        private String name;
        private Location parentLocation;

        public Long getLocationID() {
            return locationID;
        }

        public void setLocationID(Long locationID) {
            this.locationID = locationID;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Location getParentLocation() {
            return parentLocation;
        }

        public void setParentLocation(Location parentLocation) {
            this.parentLocation = parentLocation;
        }
    }

    public static class Image{
        private Long imageID;
        private String imageUrl;
        private String processedImageUrl;

        public Long getImageID() {
            return imageID;
        }

        public void setImageID(Long imageID) {
            this.imageID = imageID;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getProcessedImageUrl() {
            return processedImageUrl;
        }

        public void setProcessedImageUrl(String processedImageUrl) {
            this.processedImageUrl = processedImageUrl;
        }
    }

    public static class RefundPolicy{
        private String refundType;
        private Boolean partialRefund;
        private String dateType;
        private List<RefundPolicyDetail> refundPolicyDetailList;
        private String additionalNote;
        private Boolean overdueRefund;

        public String getRefundType() {
            return refundType;
        }

        public void setRefundType(String refundType) {
            this.refundType = refundType;
        }

        public Boolean getPartialRefund() {
            return partialRefund;
        }

        public void setPartialRefund(Boolean partialRefund) {
            this.partialRefund = partialRefund;
        }

        public String getDateType() {
            return dateType;
        }

        public void setDateType(String dateType) {
            this.dateType = dateType;
        }

        public List<RefundPolicyDetail> getRefundPolicyDetailList() {
            return refundPolicyDetailList;
        }

        public void setRefundPolicyDetailList(List<RefundPolicyDetail> refundPolicyDetailList) {
            this.refundPolicyDetailList = refundPolicyDetailList;
        }

        public String getAdditionalNote() {
            return additionalNote;
        }

        public void setAdditionalNote(String additionalNote) {
            this.additionalNote = additionalNote;
        }

        public Boolean getOverdueRefund() {
            return overdueRefund;
        }

        public void setOverdueRefund(Boolean overdueRefund) {
            this.overdueRefund = overdueRefund;
        }
    }

    public static class RefundPolicyDetail{
        private Integer day;
        private String time;
        private Boolean timeAfter;
        private String costType;
        private BigDecimal costValue;
        private String costCurrency;

        public Integer getDay() {
            return day;
        }

        public void setDay(Integer day) {
            this.day = day;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public Boolean getTimeAfter() {
            return timeAfter;
        }

        public void setTimeAfter(Boolean timeAfter) {
            this.timeAfter = timeAfter;
        }

        public String getCostType() {
            return costType;
        }

        public void setCostType(String costType) {
            this.costType = costType;
        }

        public BigDecimal getCostValue() {
            return costValue;
        }

        public void setCostValue(BigDecimal costValue) {
            this.costValue = costValue;
        }

        public String getCostCurrency() {
            return costCurrency;
        }

        public void setCostCurrency(String costCurrency) {
            this.costCurrency = costCurrency;
        }
    }

    public static class BandUnit{
        private Long bandID;
        private String bandCode;
        private String bandTitle;
        private BigDecimal min;
        private BigDecimal max;
        private String rangeType;

        public Long getBandID() {
            return bandID;
        }

        public void setBandID(Long bandID) {
            this.bandID = bandID;
        }

        public String getBandCode() {
            return bandCode;
        }

        public void setBandCode(String bandCode) {
            this.bandCode = bandCode;
        }

        public String getBandTitle() {
            return bandTitle;
        }

        public void setBandTitle(String bandTitle) {
            this.bandTitle = bandTitle;
        }

        public BigDecimal getMin() {
            return min;
        }

        public void setMin(BigDecimal min) {
            this.min = min;
        }

        public BigDecimal getMax() {
            return max;
        }

        public void setMax(BigDecimal max) {
            this.max = max;
        }

        public String getRangeType() {
            return rangeType;
        }

        public void setRangeType(String rangeType) {
            this.rangeType = rangeType;
        }
    }

    public static class Duration{
        private String type;
        private BigDecimal min;
        private BigDecimal max;
        private String unit;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public BigDecimal getMin() {
            return min;
        }

        public void setMin(BigDecimal min) {
            this.min = min;
        }

        public BigDecimal getMax() {
            return max;
        }

        public void setMax(BigDecimal max) {
            this.max = max;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }
    }

    public static class ConfirmTime{
        private String type;
        private Integer confirmMinute;
        private List<ConfirmTimeLayer> confirmTimeLayerList;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Integer getConfirmMinute() {
            return confirmMinute;
        }

        public void setConfirmMinute(Integer confirmMinute) {
            this.confirmMinute = confirmMinute;
        }

        public List<ConfirmTimeLayer> getConfirmTimeLayerList() {
            return confirmTimeLayerList;
        }

        public void setConfirmTimeLayerList(List<ConfirmTimeLayer> confirmTimeLayerList) {
            this.confirmTimeLayerList = confirmTimeLayerList;
        }
    }

    public static class ConfirmTimeLayer{
        private Integer day;
        private String time;
        private Boolean timeAfter;
        private Integer confirmMinute;

        public Integer getDay() {
            return day;
        }

        public void setDay(Integer day) {
            this.day = day;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public Boolean getTimeAfter() {
            return timeAfter;
        }

        public void setTimeAfter(Boolean timeAfter) {
            this.timeAfter = timeAfter;
        }

        public Integer getConfirmMinute() {
            return confirmMinute;
        }

        public void setConfirmMinute(Integer confirmMinute) {
            this.confirmMinute = confirmMinute;
        }
    }

    public static class ProductLabel{
        private String labelCode;
        private String labelName;

        public String getLabelCode() {
            return labelCode;
        }

        public void setLabelCode(String labelCode) {
            this.labelCode = labelCode;
        }

        public String getLabelName() {
            return labelName;
        }

        public void setLabelName(String labelName) {
            this.labelName = labelName;
        }
    }

    public static class ServiceProvider{
        private Integer brandType;
        private String brandName;
        private Integer vendorID;
        private String vendorName;
        private Integer preServiceProvider;
        private Integer afterServiceProvider;
        private Boolean isIMService;
        private String preServiceWorkDay;
        private String preServicePhone;
        private String afterServiceWorkDay;
        private String afterServicePhone;
        private String licence;
        private String businessLicense;

        public Integer getBrandType() {
            return brandType;
        }

        public void setBrandType(Integer brandType) {
            this.brandType = brandType;
        }

        public String getBrandName() {
            return brandName;
        }

        public void setBrandName(String brandName) {
            this.brandName = brandName;
        }

        public Integer getVendorID() {
            return vendorID;
        }

        public void setVendorID(Integer vendorID) {
            this.vendorID = vendorID;
        }

        public String getVendorName() {
            return vendorName;
        }

        public void setVendorName(String vendorName) {
            this.vendorName = vendorName;
        }

        public Integer getPreServiceProvider() {
            return preServiceProvider;
        }

        public void setPreServiceProvider(Integer preServiceProvider) {
            this.preServiceProvider = preServiceProvider;
        }

        public Integer getAfterServiceProvider() {
            return afterServiceProvider;
        }

        public void setAfterServiceProvider(Integer afterServiceProvider) {
            this.afterServiceProvider = afterServiceProvider;
        }

        public Boolean getIMService() {
            return isIMService;
        }

        public void setIMService(Boolean IMService) {
            isIMService = IMService;
        }

        public String getPreServiceWorkDay() {
            return preServiceWorkDay;
        }

        public void setPreServiceWorkDay(String preServiceWorkDay) {
            this.preServiceWorkDay = preServiceWorkDay;
        }

        public String getPreServicePhone() {
            return preServicePhone;
        }

        public void setPreServicePhone(String preServicePhone) {
            this.preServicePhone = preServicePhone;
        }

        public String getAfterServiceWorkDay() {
            return afterServiceWorkDay;
        }

        public void setAfterServiceWorkDay(String afterServiceWorkDay) {
            this.afterServiceWorkDay = afterServiceWorkDay;
        }

        public String getAfterServicePhone() {
            return afterServicePhone;
        }

        public void setAfterServicePhone(String afterServicePhone) {
            this.afterServicePhone = afterServicePhone;
        }

        public String getLicence() {
            return licence;
        }

        public void setLicence(String licence) {
            this.licence = licence;
        }

        public String getBusinessLicense() {
            return businessLicense;
        }

        public void setBusinessLicense(String businessLicense) {
            this.businessLicense = businessLicense;
        }
    }

    public static class ProductAdditionInfoType{
        private String titleCode;
        private String titleName;
        private List<String> contentList;

        public String getTitleCode() {
            return titleCode;
        }

        public void setTitleCode(String titleCode) {
            this.titleCode = titleCode;
        }

        public String getTitleName() {
            return titleName;
        }

        public void setTitleName(String titleName) {
            this.titleName = titleName;
        }

        public List<String> getContentList() {
            return contentList;
        }

        public void setContentList(List<String> contentList) {
            this.contentList = contentList;
        }
    }

    public static class CustomizeRefundPolicy{
        private String dateType;
        private String dateLimitType;
        private Boolean specialPolicy;
        private Boolean allWeekends;
        private Boolean chineseHolidays;
        private String customizedDate;
        private Integer specialPolicyType;
        private List<String> specialDateList;
        private List<RefundPolicyCostType> customizeRefundPolicyCostList;

        public String getDateType() {
            return dateType;
        }

        public void setDateType(String dateType) {
            this.dateType = dateType;
        }

        public String getDateLimitType() {
            return dateLimitType;
        }

        public void setDateLimitType(String dateLimitType) {
            this.dateLimitType = dateLimitType;
        }

        public Boolean getSpecialPolicy() {
            return specialPolicy;
        }

        public void setSpecialPolicy(Boolean specialPolicy) {
            this.specialPolicy = specialPolicy;
        }

        public Boolean getAllWeekends() {
            return allWeekends;
        }

        public void setAllWeekends(Boolean allWeekends) {
            this.allWeekends = allWeekends;
        }

        public Boolean getChineseHolidays() {
            return chineseHolidays;
        }

        public void setChineseHolidays(Boolean chineseHolidays) {
            this.chineseHolidays = chineseHolidays;
        }

        public String getCustomizedDate() {
            return customizedDate;
        }

        public void setCustomizedDate(String customizedDate) {
            this.customizedDate = customizedDate;
        }

        public Integer getSpecialPolicyType() {
            return specialPolicyType;
        }

        public void setSpecialPolicyType(Integer specialPolicyType) {
            this.specialPolicyType = specialPolicyType;
        }

        public List<String> getSpecialDateList() {
            return specialDateList;
        }

        public void setSpecialDateList(List<String> specialDateList) {
            this.specialDateList = specialDateList;
        }

        public List<RefundPolicyCostType> getCustomizeRefundPolicyCostList() {
            return customizeRefundPolicyCostList;
        }

        public void setCustomizeRefundPolicyCostList(List<RefundPolicyCostType> customizeRefundPolicyCostList) {
            this.customizeRefundPolicyCostList = customizeRefundPolicyCostList;
        }
    }

    public static class RefundPolicyCostType{
        private Integer refundDateType;
        private Integer day;
        private String time;
        private Boolean timeAfter;
        private Integer costType;
        private BigDecimal costValue;

        public Integer getRefundDateType() {
            return refundDateType;
        }

        public void setRefundDateType(Integer refundDateType) {
            this.refundDateType = refundDateType;
        }

        public Integer getDay() {
            return day;
        }

        public void setDay(Integer day) {
            this.day = day;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public Boolean getTimeAfter() {
            return timeAfter;
        }

        public void setTimeAfter(Boolean timeAfter) {
            this.timeAfter = timeAfter;
        }

        public Integer getCostType() {
            return costType;
        }

        public void setCostType(Integer costType) {
            this.costType = costType;
        }

        public BigDecimal getCostValue() {
            return costValue;
        }

        public void setCostValue(BigDecimal costValue) {
            this.costValue = costValue;
        }
    }

    public static class EduCertificationInfoType{
        private Boolean isEduCertificationNecessary;
        private List<Integer> educationType;
        private List<Integer> educationRequirement;

        public Boolean getEduCertificationNecessary() {
            return isEduCertificationNecessary;
        }

        public void setEduCertificationNecessary(Boolean eduCertificationNecessary) {
            isEduCertificationNecessary = eduCertificationNecessary;
        }
    }
}
