package com.trip.distribution.model.product;

import com.google.gson.JsonObject;
import java.util.List;

public class GetAllPoiResponseType {
    private JsonObject ResponseStatus;
    private Boolean success;
    private String errcode;
    private String errmsg;
    private List<AllPoiType> poiList;
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

    public List<AllPoiType> getPoiList() {
        return poiList;
    }

    public void setPoiList(List<AllPoiType> poiList) {
        this.poiList = poiList;
    }

    public String getMaxId() {
        return maxId;
    }

    public void setMaxId(String maxId) {
        this.maxId = maxId;
    }

    public static class AllPoiType{
        private Long poiId;
        private Boolean canSale;

        public Long getPoiId() {
            return poiId;
        }

        public void setPoiId(Long poiId) {
            this.poiId = poiId;
        }

        public Boolean getCanSale() {
            return canSale;
        }

        public void setCanSale(Boolean canSale) {
            this.canSale = canSale;
        }
    }
    
}
