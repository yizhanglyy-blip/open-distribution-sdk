package com.trip.distribution.model.product;

import java.math.BigDecimal;
import java.util.List;

public class Package{
    private Long packageID;
    private String name;
    private String description;
    private Integer unitQuantity;
    private Integer minQuantity;
    private Integer maxQuantity;
    private AdvanceBooking advanceBooking;
    private List<Resource> resourceList;
    private String bookingEffectiveTimeDescription;
    private List<RouteInfo> routeInfoList;
    private DeliveryInfo deliveryInfo;
    private String itineraryDesc;
    private String highLights;
    private String groupModeName;
    private List<DistrictInfoType> departureList;

    public Long getPackageID() {
        return packageID;
    }

    public void setPackageID(Long packageID) {
        this.packageID = packageID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getUnitQuantity() {
        return unitQuantity;
    }

    public void setUnitQuantity(Integer unitQuantity) {
        this.unitQuantity = unitQuantity;
    }

    public Integer getMinQuantity() {
        return minQuantity;
    }

    public void setMinQuantity(Integer minQuantity) {
        this.minQuantity = minQuantity;
    }

    public Integer getMaxQuantity() {
        return maxQuantity;
    }

    public void setMaxQuantity(Integer maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    public AdvanceBooking getAdvanceBooking() {
        return advanceBooking;
    }

    public void setAdvanceBooking(AdvanceBooking advanceBooking) {
        this.advanceBooking = advanceBooking;
    }

    public List<Resource> getResourceList() {
        return resourceList;
    }

    public void setResourceList(List<Resource> resourceList) {
        this.resourceList = resourceList;
    }

    public String getBookingEffectiveTimeDescription() {
        return bookingEffectiveTimeDescription;
    }

    public void setBookingEffectiveTimeDescription(String bookingEffectiveTimeDescription) {
        this.bookingEffectiveTimeDescription = bookingEffectiveTimeDescription;
    }

    public List<RouteInfo> getRouteInfoList() {
        return routeInfoList;
    }

    public void setRouteInfoList(List<RouteInfo> routeInfoList) {
        this.routeInfoList = routeInfoList;
    }

    public DeliveryInfo getDeliveryInfo() {
        return deliveryInfo;
    }

    public void setDeliveryInfo(DeliveryInfo deliveryInfo) {
        this.deliveryInfo = deliveryInfo;
    }

    public String getItineraryDesc() {
        return itineraryDesc;
    }

    public void setItineraryDesc(String itineraryDesc) {
        this.itineraryDesc = itineraryDesc;
    }

    public String getHighLights() {
        return highLights;
    }

    public void setHighLights(String highLights) {
        this.highLights = highLights;
    }

    public String getGroupModeName() {
        return groupModeName;
    }

    public void setGroupModeName(String groupModeName) {
        this.groupModeName = groupModeName;
    }

    public List<DistrictInfoType> getDepartureList() {
        return departureList;
    }

    public void setDepartureList(List<DistrictInfoType> departureList) {
        this.departureList = departureList;
    }

    public static class AdvanceBooking{
        private Integer days;
        private String time;
        private String description;

        public Integer getDays() {
            return days;
        }

        public void setDays(Integer days) {
            this.days = days;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

    public static class Resource{
        private Long resourceID;
        private Long bandID;
        private String bandCode;
        private Boolean saleAlone;
        private Integer saleAloneType;
        private Integer minQuantity;
        private Integer maxQuantity;
        private String currency;
        private List<CalendarDetail> calendarDetailList;
        private String name;
        private String fullName;
        private Integer unitQuantity;
        private List<ResourceAdditionInfoType> resourceAdditionInfoList;
        private List<SubResource> subResourceList;
        private Boolean isPrivatePrice;
        private Integer waitType;

        public Integer getWaitType() {
            return waitType;
        }

        public void setWaitType(Integer waitType) {
            this.waitType = waitType;
        }

        public Long getResourceID() {
            return resourceID;
        }

        public void setResourceID(Long resourceID) {
            this.resourceID = resourceID;
        }

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

        public Boolean getSaleAlone() {
            return saleAlone;
        }

        public void setSaleAlone(Boolean saleAlone) {
            this.saleAlone = saleAlone;
        }

        public Integer getSaleAloneType() {
            return saleAloneType;
        }

        public void setSaleAloneType(Integer saleAloneType) {
            this.saleAloneType = saleAloneType;
        }

        public Integer getMinQuantity() {
            return minQuantity;
        }

        public void setMinQuantity(Integer minQuantity) {
            this.minQuantity = minQuantity;
        }

        public Integer getMaxQuantity() {
            return maxQuantity;
        }

        public void setMaxQuantity(Integer maxQuantity) {
            this.maxQuantity = maxQuantity;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public List<CalendarDetail> getCalendarDetailList() {
            return calendarDetailList;
        }

        public void setCalendarDetailList(List<CalendarDetail> calendarDetailList) {
            this.calendarDetailList = calendarDetailList;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public Integer getUnitQuantity() {
            return unitQuantity;
        }

        public void setUnitQuantity(Integer unitQuantity) {
            this.unitQuantity = unitQuantity;
        }

        public List<ResourceAdditionInfoType> getResourceAdditionInfoList() {
            return resourceAdditionInfoList;
        }

        public void setResourceAdditionInfoList(List<ResourceAdditionInfoType> resourceAdditionInfoList) {
            this.resourceAdditionInfoList = resourceAdditionInfoList;
        }

        public List<SubResource> getSubResourceList() {
            return subResourceList;
        }

        public void setSubResourceList(List<SubResource> subResourceList) {
            this.subResourceList = subResourceList;
        }

        public Boolean getPrivatePrice() {
            return isPrivatePrice;
        }

        public void setPrivatePrice(Boolean privatePrice) {
            isPrivatePrice = privatePrice;
        }
    }

    public static class SubResource{
        private Long resourceId;
        private String name;
        private String shortName;
        private Integer unitQuantity;

        public Long getResourceId() {
            return resourceId;
        }

        public void setResourceId(Long resourceId) {
            this.resourceId = resourceId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getShortName() {
            return shortName;
        }

        public void setShortName(String shortName) {
            this.shortName = shortName;
        }

        public Integer getUnitQuantity() {
            return unitQuantity;
        }

        public void setUnitQuantity(Integer unitQuantity) {
            this.unitQuantity = unitQuantity;
        }
    }

    public static class ResourceAdditionInfoType{
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

    public static class CalendarDetail{
        private String date;
        private BigDecimal netPrice;
        private BigDecimal salePrice;
        private String currency;
        private Integer stock;
        private BigDecimal marketPrice;
        private String marketPriceCurrency;
        private Boolean isReserveDate;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public BigDecimal getNetPrice() {
            return netPrice;
        }

        public void setNetPrice(BigDecimal netPrice) {
            this.netPrice = netPrice;
        }

        public BigDecimal getSalePrice() {
            return salePrice;
        }

        public void setSalePrice(BigDecimal salePrice) {
            this.salePrice = salePrice;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public Integer getStock() {
            return stock;
        }

        public void setStock(Integer stock) {
            this.stock = stock;
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

        public Boolean getReserveDate() {
            return isReserveDate;
        }

        public void setReserveDate(Boolean reserveDate) {
            isReserveDate = reserveDate;
        }
    }

    public static class RouteInfo{
        private Long routeId;
        private String routeName;
        private List<String> inclusion;
        private List<String> exclusion;
        private List<String> instruction;
        private List<String> description;
        private  List<ClauseItem> inclusionDescription;
        private List<ClauseItem> exclusionDescription;
        private List<ClauseItem> instructionDescription;
        private List<ClauseItem> descriptionDescription;

        public Long getRouteId() {
            return routeId;
        }

        public void setRouteId(Long routeId) {
            this.routeId = routeId;
        }

        public String getRouteName() {
            return routeName;
        }

        public void setRouteName(String routeName) {
            this.routeName = routeName;
        }

        public List<String> getInclusion() {
            return inclusion;
        }

        public void setInclusion(List<String> inclusion) {
            this.inclusion = inclusion;
        }

        public List<String> getExclusion() {
            return exclusion;
        }

        public void setExclusion(List<String> exclusion) {
            this.exclusion = exclusion;
        }

        public List<String> getInstruction() {
            return instruction;
        }

        public void setInstruction(List<String> instruction) {
            this.instruction = instruction;
        }

        public List<String> getDescription() {
            return description;
        }

        public void setDescription(List<String> description) {
            this.description = description;
        }

        public List<ClauseItem> getInclusionDescription() {
            return inclusionDescription;
        }

        public void setInclusionDescription(List<ClauseItem> inclusionDescription) {
            this.inclusionDescription = inclusionDescription;
        }

        public List<ClauseItem> getExclusionDescription() {
            return exclusionDescription;
        }

        public void setExclusionDescription(List<ClauseItem> exclusionDescription) {
            this.exclusionDescription = exclusionDescription;
        }

        public List<ClauseItem> getInstructionDescription() {
            return instructionDescription;
        }

        public void setInstructionDescription(List<ClauseItem> instructionDescription) {
            this.instructionDescription = instructionDescription;
        }

        public List<ClauseItem> getDescriptionDescription() {
            return descriptionDescription;
        }

        public void setDescriptionDescription(List<ClauseItem> descriptionDescription) {
            this.descriptionDescription = descriptionDescription;
        }
    }

    public static class ClauseItem{
        private String clauseName;
        private List<DescriptionItemType> clauseItemDescription;

        public String getClauseName() {
            return clauseName;
        }

        public void setClauseName(String clauseName) {
            this.clauseName = clauseName;
        }

        public List<DescriptionItemType> getClauseItemDescription() {
            return clauseItemDescription;
        }

        public void setClauseItemDescription(List<DescriptionItemType> clauseItemDescription) {
            this.clauseItemDescription = clauseItemDescription;
        }
    }

    public static class DescriptionItemType{
        private String description;
        private List<String> targetBandCodes;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public List<String> getTargetBandCodes() {
            return targetBandCodes;
        }

        public void setTargetBandCodes(List<String> targetBandCodes) {
            this.targetBandCodes = targetBandCodes;
        }
    }

    public static class DeliveryInfo{
        private Integer mode;
        private Integer type;

        public Integer getMode() {
            return mode;
        }

        public void setMode(Integer mode) {
            this.mode = mode;
        }

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }
    }

    public static class DistrictInfoType{
        private Long locationID;
        private String type;

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
    }
}


