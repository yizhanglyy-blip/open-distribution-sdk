package com.trip.distribution.model.category;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CategoriesResponseType {
    private JsonObject ResponseStatus;
    private CategoriesData data;
    private Boolean success;
    private String errcode;
    private String errmsg;

    public JsonObject getResponseStatus() {
        return ResponseStatus;
    }

    public void setResponseStatus(JsonObject responseStatus) {
        ResponseStatus = responseStatus;
    }

    public CategoriesData getData() {
        return data;
    }

    public void setData(CategoriesData data) {
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

    public static class CategoriesData{
        private List<CategoryType> categoryList;

        public List<CategoryType> getCategoryList() {
            return categoryList;
        }

        public void setCategoryList(List<CategoryType> categoryList) {
            this.categoryList = categoryList;
        }
    }

    public static class CategoryType{
        private Long categoryID;
        private String categoryName;
        private List<CategoryType> subcategoryList;
        private String business;


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

        public List<CategoryType> getSubcategoryList() {
            return subcategoryList;
        }

        public void setSubcategoryList(List<CategoryType> subcategoryList) {
            this.subcategoryList = subcategoryList;
        }

        public String getBusiness() {
            return business;
        }

        public void setBusiness(String business) {
            this.business = business;
        }
    }
}
