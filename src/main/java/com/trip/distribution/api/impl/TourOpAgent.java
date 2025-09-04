package com.trip.distribution.api.impl;

import com.google.gson.JsonObject;
import com.trip.distribution.api.TourOpRequest;
import com.trip.distribution.util.ApiException;
import com.trip.distribution.util.GsonUtil;
import com.trip.distribution.util.HttpUtil;
import com.trip.distribution.util.UUIDUtil;
import jodd.http.HttpResponse;

public abstract class TourOpAgent {

    protected String AID;
    protected String SID;
    protected String TOKEN;

    protected TourOpAgent(String AID, String SID, String TOKEN) {
        this.AID = AID;
        this.SID = SID;
        this.TOKEN= TOKEN;
    }


    //http url
    public static final String api_url_test = "https://openservice.open.uat.ctripqa.com/openservice/serviceproxy.ashx";
    public static final String api_url_prod = "https://sopenservice.ctrip.com/openservice/serviceproxy.ashx";

    /**
     * response:JsonObject格式
     * @param request
     * @return
     * @throws ApiException
     */
    protected JsonObject getAPIResponse(TourOpRequest request) throws ApiException {
        //拼接请求url
        String testUrl = api_url_test +
                "?aid=" + this.AID +
                "&sid=" + this.SID +
                "&token=" + this.TOKEN +
                "&uuid=" + UUIDUtil.generateUUID() +
                "&icode=" + request.getEndPoint();

        String requestJson = GsonUtil.toJson(request.getBizModel());
        HttpResponse httpResponse = HttpUtil.doPost(testUrl, null, requestJson);
        JsonObject repJson = GsonUtil.parse(httpResponse.bodyText(), JsonObject.class);
        return repJson;
    }

    /**
     * response:API DTO格式
     * @param request
     * @param clazz
     * @param <T>
     * @return
     * @throws ApiException
     */
    protected <T> T getAPIResponseV2(TourOpRequest request, Class<T> clazz) throws ApiException {
        //拼接请求url
        String testUrl = api_url_test +
                "?aid=" + this.AID +
                "&sid=" + this.SID +
                "&token=" + this.TOKEN +
                "&uuid=" + UUIDUtil.generateUUID() +
                "&icode=" + request.getEndPoint();

        String requestJson = GsonUtil.toJson(request.getBizModel());
        HttpResponse httpResponse = HttpUtil.doPost(testUrl, null, requestJson);
        return GsonUtil.parse(httpResponse.bodyText(), clazz);
    }

}
