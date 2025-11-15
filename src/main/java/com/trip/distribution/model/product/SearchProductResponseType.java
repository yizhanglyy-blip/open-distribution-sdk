package com.trip.distribution.model.product;

import com.google.gson.JsonObject;
import java.math.BigDecimal;
import java.util.List;

public class SearchProductResponseType {
    private SearchProductData data;
    private JsonObject ResponseStatus;
    private Boolean success;
    private String errcode;
    private String errmsg;

    public SearchProductData getData() {
        return data;
    }

    public void setData(SearchProductData data) {
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

    public static class SearchProductData{
        private List<BasicProduct> productList;
        private Long totalCount;
        private Long lastUpdateProductID;

        public List<BasicProduct> getProductList() {
            return productList;
        }

        public void setProductList(List<BasicProduct> productList) {
            this.productList = productList;
        }

        public Long getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
        }

        public Long getLastUpdateProductID() {
            return lastUpdateProductID;
        }

        public void setLastUpdateProductID(Long lastUpdateProductID) {
            this.lastUpdateProductID = lastUpdateProductID;
        }
    }

    public static class BasicProduct{
        private Long productID;
        private Category category;
        private Boolean saleAvailable;
        private String locale;
        private String name;
        private String url;
        private List<Location> departureList;
        private List<Location> destinationList;
        private String currency;
        private BigDecimal salePrice;
        private BigDecimal netPrice;
        private Image coverImage;
        private BigDecimal rating;
        private String business;
        private BigDecimal marketPrice;
        private String marketPriceCurrency;

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

        public Image getCoverImage() {
            return coverImage;
        }

        public void setCoverImage(Image coverImage) {
            this.coverImage = coverImage;
        }

        public BigDecimal getRating() {
            return rating;
        }

        public void setRating(BigDecimal rating) {
            this.rating = rating;
        }

        public String getBusiness() {
            return business;
        }

        public void setBusiness(String business) {
            this.business = business;
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



}
