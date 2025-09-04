package com.trip.distribution.api.impl;

import com.google.gson.JsonObject;
import com.trip.distribution.api.ICategoryClient;
import com.trip.distribution.api.TourOpRequest;
import com.trip.distribution.model.category.*;
import com.trip.distribution.util.ApiException;
import com.trip.distribution.util.Constants;

public class CategoryClientImpl extends TourOpAgent implements ICategoryClient {

    public CategoryClientImpl(String AID, String SID, String TOKEN) {
        super(AID, SID, TOKEN);
    }

    /**
     * 5.1获取品类
     */
    @Override
    public JsonObject categoriesJsonObject(CategoriesRequestType model, String icode) throws ApiException {
        TourOpRequest<CategoriesRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.CATEGORIES);
        return getAPIResponse(request);
    }

    @Override
    public CategoriesResponseType categories(CategoriesRequestType model, String icode) throws ApiException {
        TourOpRequest<CategoriesRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.CATEGORIES);
        return getAPIResponseV2(request, CategoriesResponseType.class);
    }


    /**
     * 5.2获取位置
     */
    @Override
    public JsonObject locationsJsonObject(LocationsRequestType model, String icode) throws ApiException {
        TourOpRequest<LocationsRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.LOCATIONS);
        return getAPIResponse(request);
    }

    @Override
    public LocationsResponseType locations(LocationsRequestType model, String icode) throws ApiException {
        TourOpRequest<LocationsRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.LOCATIONS);
        return getAPIResponseV2(request, LocationsResponseType.class);
    }

    /**
     * 5.3获取货币
     */
    @Override
    public JsonObject getCurrenciesJsonObject(GetCurrenciesRequestType model, String icode) throws ApiException {
        TourOpRequest<GetCurrenciesRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.GETCURRENCIES);
        return getAPIResponse(request);
    }

    @Override
    public GetCurrenciesResponseType getCurrencies(GetCurrenciesRequestType model, String icode) throws ApiException {
        TourOpRequest<GetCurrenciesRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.GETCURRENCIES);
        return getAPIResponseV2(request, GetCurrenciesResponseType.class);
    }

    /**
     * 5.4获取语言
     */
    @Override
    public JsonObject getLocalesJsonObject(GetLocalesRequestType model, String icode) throws ApiException {
        TourOpRequest<GetLocalesRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.GETLOCALES);
        return getAPIResponse(request);
    }

    @Override
    public GetLocalesResponseType getLocales(GetLocalesRequestType model, String icode) throws ApiException {
        TourOpRequest<GetLocalesRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.GETLOCALES);
        return getAPIResponseV2(request, GetLocalesResponseType.class);
    }
}
