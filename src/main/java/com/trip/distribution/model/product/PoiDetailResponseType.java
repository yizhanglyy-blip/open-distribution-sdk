package com.trip.distribution.model.product;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.List;

public class PoiDetailResponseType {
    private List<PoiDetailData> data;
    @SerializedName("ResponseStatus")
    private JsonObject ResponseStatus;
    private Boolean success;
    private String errcode;
    private String errmsg;

    public List<PoiDetailData> getData() {
        return data;
    }

    public void setData(List<PoiDetailData> data) {
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

    public static class PoiDetailData{
        Long poiId;
        String locale;
        String poiName;
        String poiAddress;
        List<String> imageList;
        Double rating;
        Integer commentNumber;
        Integer star;
        Double longitude;
        Double latitude;
        Integer locationID;
        String poiAnnouncement;
        String poiDesc;
        List<PoiTagType> poiTagList;
        String coverImageUrl;
        Long scenicSpotId;
        List<PreferentialPolicyDetail> preferentialPolicyList;
        String displayPriceType;
        BigDecimal displayPrice;
        String inAdvanceTimeDesc;
        String advancedTicketDesc;
        String openTimeDesc;
        String businessStatus;

        public Long getPoiId() {
            return poiId;
        }

        public void setPoiId(Long poiId) {
            this.poiId = poiId;
        }

        public String getLocale() {
            return locale;
        }

        public void setLocale(String locale) {
            this.locale = locale;
        }

        public String getPoiName() {
            return poiName;
        }

        public void setPoiName(String poiName) {
            this.poiName = poiName;
        }

        public String getPoiAddress() {
            return poiAddress;
        }

        public void setPoiAddress(String poiAddress) {
            this.poiAddress = poiAddress;
        }

        public List<String> getImageList() {
            return imageList;
        }

        public void setImageList(List<String> imageList) {
            this.imageList = imageList;
        }

        public Double getRating() {
            return rating;
        }

        public void setRating(Double rating) {
            this.rating = rating;
        }

        public Integer getCommentNumber() {
            return commentNumber;
        }

        public void setCommentNumber(Integer commentNumber) {
            this.commentNumber = commentNumber;
        }

        public Integer getStar() {
            return star;
        }

        public void setStar(Integer star) {
            this.star = star;
        }

        public Double getLongitude() {
            return longitude;
        }

        public void setLongitude(Double longitude) {
            this.longitude = longitude;
        }

        public Double getLatitude() {
            return latitude;
        }

        public void setLatitude(Double latitude) {
            this.latitude = latitude;
        }

        public Integer getLocationID() {
            return locationID;
        }

        public void setLocationID(Integer locationID) {
            this.locationID = locationID;
        }

        public String getPoiAnnouncement() {
            return poiAnnouncement;
        }

        public void setPoiAnnouncement(String poiAnnouncement) {
            this.poiAnnouncement = poiAnnouncement;
        }

        public String getPoiDesc() {
            return poiDesc;
        }

        public void setPoiDesc(String poiDesc) {
            this.poiDesc = poiDesc;
        }

        public List<PoiTagType> getPoiTagList() {
            return poiTagList;
        }

        public void setPoiTagList(List<PoiTagType> poiTagList) {
            this.poiTagList = poiTagList;
        }

        public String getCoverImageUrl() {
            return coverImageUrl;
        }

        public void setCoverImageUrl(String coverImageUrl) {
            this.coverImageUrl = coverImageUrl;
        }

        public Long getScenicSpotId() {
            return scenicSpotId;
        }

        public void setScenicSpotId(Long scenicSpotId) {
            this.scenicSpotId = scenicSpotId;
        }

        public List<PreferentialPolicyDetail> getPreferentialPolicyList() {
            return preferentialPolicyList;
        }

        public void setPreferentialPolicyList(List<PreferentialPolicyDetail> preferentialPolicyList) {
            this.preferentialPolicyList = preferentialPolicyList;
        }

        public String getDisplayPriceType() {
            return displayPriceType;
        }

        public void setDisplayPriceType(String displayPriceType) {
            this.displayPriceType = displayPriceType;
        }

        public BigDecimal getDisplayPrice() {
            return displayPrice;
        }

        public void setDisplayPrice(BigDecimal displayPrice) {
            this.displayPrice = displayPrice;
        }

        public String getInAdvanceTimeDesc() {
            return inAdvanceTimeDesc;
        }

        public void setInAdvanceTimeDesc(String inAdvanceTimeDesc) {
            this.inAdvanceTimeDesc = inAdvanceTimeDesc;
        }

        public String getAdvancedTicketDesc() {
            return advancedTicketDesc;
        }

        public void setAdvancedTicketDesc(String advancedTicketDesc) {
            this.advancedTicketDesc = advancedTicketDesc;
        }

        public String getOpenTimeDesc() {
            return openTimeDesc;
        }

        public void setOpenTimeDesc(String openTimeDesc) {
            this.openTimeDesc = openTimeDesc;
        }

        public String getBusinessStatus() {
            return businessStatus;
        }

        public void setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
        }
    }
    
    public static class PoiTagType{
        Long tagId;
        String tagName;

        public Long getTagId() {
            return tagId;
        }

        public void setTagId(Long tagId) {
            this.tagId = tagId;
        }

        public String getTagName() {
            return tagName;
        }

        public void setTagName(String tagName) {
            this.tagName = tagName;
        }
    }

    public static class PreferentialPolicyDetail{
        String descDetail;

        public String getDescDetail() {
            return descDetail;
        }

        public void setDescDetail(String descDetail) {
            this.descDetail = descDetail;
        }
    }
}
