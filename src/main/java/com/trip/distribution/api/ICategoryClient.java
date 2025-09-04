package com.trip.distribution.api;

import com.google.gson.JsonObject;
import com.trip.distribution.model.category.*;
import com.trip.distribution.util.ApiException;

public interface ICategoryClient {
    /**
     * 5.1获取品类
     */
    JsonObject categoriesJsonObject(CategoriesRequestType model, String icode) throws ApiException;

    CategoriesResponseType categories(CategoriesRequestType model, String icode) throws ApiException;

    /**
     * 5.2获取位置
     */
    JsonObject locationsJsonObject(LocationsRequestType model, String icode) throws ApiException;

    LocationsResponseType locations(LocationsRequestType model, String icode) throws ApiException;

    /**
     * 5.3获取货币
     */
    JsonObject getCurrenciesJsonObject(GetCurrenciesRequestType model, String icode) throws ApiException;

    GetCurrenciesResponseType getCurrencies(GetCurrenciesRequestType model, String icode) throws ApiException;

    /**
     * 5.4获取语言
     */
    JsonObject getLocalesJsonObject(GetLocalesRequestType model, String icode) throws ApiException;

    GetLocalesResponseType getLocales(GetLocalesRequestType model, String icode) throws ApiException;

}
