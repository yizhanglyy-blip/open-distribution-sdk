package com.trip.distribution.model.product;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetAllProductResponseType {
    @SerializedName("ResponseStatus")
    private JsonObject ResponseStatus;
    private Boolean success;
    private String errcode;
    private String errmsg;
    private List<AllProductType> productList;
    private String maxId;

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

    public List<AllProductType> getProductList() {
        return productList;
    }

    public void setProductList(List<AllProductType> productList) {
        this.productList = productList;
    }

    public String getMaxId() {
        return maxId;
    }

    public void setMaxId(String maxId) {
        this.maxId = maxId;
    }

    public static class AllProductType{
        private Long productId;
        private Boolean canSale;

        public Long getProductId() {
            return productId;
        }

        public void setProductId(Long productId) {
            this.productId = productId;
        }

        public Boolean getCanSale() {
            return canSale;
        }

        public void setCanSale(Boolean canSale) {
            this.canSale = canSale;
        }
    }
}
