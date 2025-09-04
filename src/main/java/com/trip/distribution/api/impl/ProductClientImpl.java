package com.trip.distribution.api.impl;

import com.google.gson.JsonObject;
import com.trip.distribution.api.IProductClient;
import com.trip.distribution.api.TourOpRequest;
import com.trip.distribution.model.product.*;
import com.trip.distribution.util.ApiException;
import com.trip.distribution.util.Constants;

public class ProductClientImpl extends TourOpAgent implements IProductClient {

    public ProductClientImpl(String AID, String SID, String TOKEN) {
        super(AID, SID, TOKEN);
    }

    /**
     * 3.1产品列表
     */
    @Override
    public JsonObject searchProductJsonObject(SearchProductRequestType model, String icode) throws ApiException {
        TourOpRequest<SearchProductRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.SEARCHPRODUCT);
        return getAPIResponse(request);
    }

    @Override
    public SearchProductResponseType searchProduct(SearchProductRequestType model, String icode) throws ApiException {
        TourOpRequest<SearchProductRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.SEARCHPRODUCT);
        return getAPIResponseV2(request, SearchProductResponseType.class);
    }

    /**
     * 3.2产品详情
     */
    @Override
    public JsonObject productDetailJsonObject(ProductDetailRequestType model, String icode) throws ApiException {
        TourOpRequest<ProductDetailRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.PRODUCTDETAIL);
        return getAPIResponse(request);
    }

    @Override
    public ProductDetailResponseType productDetail(ProductDetailRequestType model, String icode) throws ApiException {
        TourOpRequest<ProductDetailRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.PRODUCTDETAIL);
        return getAPIResponseV2(request, ProductDetailResponseType.class);
    }

    /**
     * 3.3产品价格日历
     */
    @Override
    public JsonObject priceCalendarJsonObject(PriceCalendarRequestType model, String icode) throws ApiException {
        TourOpRequest<PriceCalendarRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.PRICECALENDAR);
        return getAPIResponse(request);
    }

    @Override
    public PriceCalendarResponseType priceCalendar(PriceCalendarRequestType model, String icode) throws ApiException {
        TourOpRequest<PriceCalendarRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.PRICECALENDAR);
        return getAPIResponseV2(request, PriceCalendarResponseType.class);
    }

    /**
     * 3.4获取POI信息
     */
    @Override
    public JsonObject poiDetailJsonObject(PoiDetailRequestType model, String icode) throws ApiException {
        TourOpRequest<PoiDetailRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.POIDETAIL);
        return getAPIResponse(request);
    }

    @Override
    public PoiDetailResponseType poiDetail(PoiDetailRequestType model, String icode) throws ApiException {
        TourOpRequest<PoiDetailRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.POIDETAIL);
        return getAPIResponseV2(request, PoiDetailResponseType.class);
    }

    /**
     * 3.5产品全量
     */
    @Override
    public JsonObject getAllProductJsonObject(GetAllProductRequestType model, String icode) throws ApiException {
        TourOpRequest<GetAllProductRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.GETALLPRODUCT);
        return getAPIResponse(request);
    }

    @Override
    public GetAllProductResponseType getAllProduct(GetAllProductRequestType model, String icode) throws ApiException {
        TourOpRequest<GetAllProductRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.GETALLPRODUCT);
        return getAPIResponseV2(request, GetAllProductResponseType.class);
    }

    /**
     * 3.6POI全量
     */
    @Override
    public JsonObject getAllPoiJsonObject(GetAllPoiRequestType model, String icode) throws ApiException {
        TourOpRequest<GetAllPoiRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.GETALLPOI);
        return getAPIResponse(request);
    }

    @Override
    public GetAllPoiResponseType getAllPoi(GetAllPoiRequestType model, String icode) throws ApiException {
        TourOpRequest<GetAllPoiRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.GETALLPOI);
        return getAPIResponseV2(request, GetAllPoiResponseType.class);
    }

}
