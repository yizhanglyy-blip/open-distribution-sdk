package com.trip.distribution.api;

import com.trip.distribution.util.Constants;

public class TourOpRequest<BizModel> {

    protected BizModel bizModel;

    private String endPoint;

    private String serviceName;

    private String version = "1.0";

    private String httpMethod = Constants.METHOD_POST;


    public TourOpRequest() {

    }
    public static <T> TourOpRequest<T> ofModel(T model, String endPoint) {
        TourOpRequest<T> request = new TourOpRequest();
        request.setBizModel(model);
        request.setEndPoint(endPoint);
        return request;
    }


    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public BizModel getBizModel() {
        return bizModel;
    }

    public void setBizModel(BizModel bizModel) {
        this.bizModel = bizModel;
    }


}
