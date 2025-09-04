package com.trip.distribution.model.category;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LocationsResponseType {
    private JsonObject ResponseStatus;
    private LocationsData data;
    private Boolean success;
    private String errcode;
    private String errmsg;


    public JsonObject getResponseStatus() {
        return ResponseStatus;
    }

    public void setResponseStatus(JsonObject responseStatus) {
        ResponseStatus = responseStatus;
    }

    public LocationsData getData() {
        return data;
    }

    public void setData(LocationsData data) {
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

    public static class LocationsData{
        private List<Location> locationList;

        public List<Location> getLocationList() {
            return locationList;
        }

        public void setLocationList(List<Location> locationList) {
            this.locationList = locationList;
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
}
