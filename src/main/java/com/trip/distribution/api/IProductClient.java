package com.trip.distribution.api;

import com.google.gson.JsonObject;
import com.trip.distribution.model.product.*;
import com.trip.distribution.util.ApiException;

public interface IProductClient {
    /**
     * 3.1产品列表
     */
    JsonObject searchProductJsonObject(SearchProductRequestType model, String icode) throws ApiException;

    SearchProductResponseType searchProduct(SearchProductRequestType model, String icode) throws ApiException;

    /**
     * 3.2产品详情
     */
    JsonObject productDetailJsonObject(ProductDetailRequestType model, String icode) throws ApiException;

    ProductDetailResponseType productDetail(ProductDetailRequestType model, String icode) throws ApiException;

    /**
     * 3.3产品价格日历
     */
    JsonObject priceCalendarJsonObject(PriceCalendarRequestType model, String icode) throws ApiException;

    PriceCalendarResponseType priceCalendar(PriceCalendarRequestType model, String icode) throws ApiException;

    /**
     * 3.4获取POI信息
     */
    JsonObject poiDetailJsonObject(PoiDetailRequestType model, String icode) throws ApiException;

    PoiDetailResponseType poiDetail(PoiDetailRequestType model, String icode) throws ApiException;

    /**
     * 3.5产品全量
     */
    JsonObject getAllProductJsonObject(GetAllProductRequestType model, String icode) throws ApiException;

    GetAllProductResponseType getAllProduct(GetAllProductRequestType model, String icode) throws ApiException;

    /**
     * 3.6POI全量
     */
    JsonObject getAllPoiJsonObject(GetAllPoiRequestType model, String icode) throws ApiException;

    GetAllPoiResponseType getAllPoi(GetAllPoiRequestType model, String icode) throws ApiException;
}
