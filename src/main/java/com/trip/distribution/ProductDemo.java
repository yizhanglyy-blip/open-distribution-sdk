package com.trip.distribution;

import com.google.gson.JsonObject;
import com.trip.distribution.api.impl.ProductClientImpl;
import com.trip.distribution.model.product.*;
import com.trip.distribution.util.ApiException;
import com.trip.distribution.util.GsonUtil;

import java.util.Arrays;

/**
 * Part E Related to product information API
 */
public class ProductDemo {

    static final String AID = AccountParams.AID;
    static final String SID = AccountParams.SID;
    static final String TOKEN = AccountParams.TOKEN;

    ProductClientImpl productClient;


    public ProductDemo() {
        productClient = new ProductClientImpl( AID, SID, TOKEN);
    }

    public static void main(String[] args) throws ApiException {
        ProductDemo demo = new ProductDemo();
        demo.getAllPoi();

    }

    //3.1产品列表demo
    public void searchProduct() throws ApiException{
        SearchProductRequestType searchProductRequestType = new SearchProductRequestType();

        searchProductRequestType.setLocale("zh-CN");
        searchProductRequestType.setCurrency("CNY");
        searchProductRequestType.setCategoryIDList(Arrays.asList(3L,20L));//根据品类id-categoryID查询
        searchProductRequestType.setSortOrder("ID_A");
        searchProductRequestType.setPageIndex(1);
        searchProductRequestType.setPageSize(20);
        searchProductRequestType.setLastUpdateProductID(0L);
        searchProductRequestType.setBusiness("TICKET");// 如果业务线不传，默认活动业务线ACTIVITY
        //根据位置参数-destination查询
//        LocationRequest destination = new LocationRequest();
//        destination.setLocationID(2L);
//        destination.setLocationType("CITY");
//        searchProductRequestType.setDestination(destination);

        //获取Response,JsonObject格式
        JsonObject jsonObject = productClient.searchProductJsonObject(searchProductRequestType,"17e414dba020473db7bc5c108f1c6826");
        //获取Response,API dto格式
        SearchProductResponseType searchProductResponseType = productClient.searchProduct(searchProductRequestType, "17e414dba020473db7bc5c108f1c6826");

        System.out.println(jsonObject);
        System.out.println(GsonUtil.toJson(searchProductResponseType));
    }

    //3.2产品详情demo
    public void productDetail() throws ApiException{
        ProductDetailRequestType productDetailRequestType = new ProductDetailRequestType();

        productDetailRequestType.setLocale("zh-CN");
        productDetailRequestType.setCurrency("CNY");
        productDetailRequestType.setProductIDList(Arrays.asList(67893182L));
        productDetailRequestType.setImageSize("500_280");//图片尺寸

        //获取Response,JsonObject格式
        JsonObject jsonObject = productClient.productDetailJsonObject(productDetailRequestType,"f8c5e03752644552a8546ae445069c59");
        //获取Response,API dto格式
        ProductDetailResponseType productDetailResponseType = productClient.productDetail(productDetailRequestType, "f8c5e03752644552a8546ae445069c59");

        System.out.println(jsonObject);
        System.out.println(GsonUtil.toJson(productDetailResponseType));
    }

    //3.3产品价格日历demo
    public void priceCalendar() throws ApiException{
        PriceCalendarRequestType priceCalendarRequestType = new PriceCalendarRequestType();

        priceCalendarRequestType.setLocale("zh-CN");
        priceCalendarRequestType.setCurrency("CNY");
        priceCalendarRequestType.setProductID(47060855L);
        priceCalendarRequestType.setStartDate("2025-08-30");
        priceCalendarRequestType.setEndDate("2025-09-10");

        //获取Response,JsonObject格式
        JsonObject jsonObject = productClient.priceCalendarJsonObject(priceCalendarRequestType,"2543fc84edf54c7186f6ae9ec8ee70d3");
        //获取Response,API dto格式
        PriceCalendarResponseType priceCalendarResponseType = productClient.priceCalendar(priceCalendarRequestType, "2543fc84edf54c7186f6ae9ec8ee70d3");
        System.out.println(jsonObject);
        System.out.println(GsonUtil.toJson(priceCalendarResponseType));
    }

    //3.4获取POI信息demo
    public void poiDetail() throws ApiException{
        PoiDetailRequestType poiDetailRequestType = new PoiDetailRequestType();
        poiDetailRequestType.setLocale("zh-CN");
        poiDetailRequestType.setPoiIdList(Arrays.asList(75594L, 1234L));
        poiDetailRequestType.setImageSize("500_280");
        //获取Response,JsonObject格式
        JsonObject jsonObject = productClient.poiDetailJsonObject(poiDetailRequestType,"1e44c223968e4382959d9bfdac25fc36");
        //获取Response,API dto格式
        PoiDetailResponseType poiDetailResponseType = productClient.poiDetail(poiDetailRequestType, "1e44c223968e4382959d9bfdac25fc36");
        System.out.println(jsonObject);
        System.out.println(GsonUtil.toJson(poiDetailResponseType));
    }

    //3.5产品全量demo
    public void getAllProduct() throws ApiException{
        GetAllProductRequestType getAllProductRequestType = new GetAllProductRequestType();
        getAllProductRequestType.setBusiness("TICKET");
        getAllProductRequestType.setLastMaxId("0");
        getAllProductRequestType.setLimit(50);//注意limit取值范围： 50至100
        //获取Response,JsonObject格式
        JsonObject jsonObject = productClient.getAllProductJsonObject(getAllProductRequestType,"816a39440838419f9b305d52daf2d90f");
        //获取Response,API dto格式
        GetAllProductResponseType getAllProductResponseType = productClient.getAllProduct(getAllProductRequestType, "816a39440838419f9b305d52daf2d90f");
        System.out.println(jsonObject);
        System.out.println(GsonUtil.toJson(getAllProductResponseType));
    }

    //3.6POI全量demo
    public void getAllPoi() throws ApiException{
        GetAllPoiRequestType getAllPoiRequestType = new GetAllPoiRequestType();
        getAllPoiRequestType.setLastMaxId("0");
        getAllPoiRequestType.setLimit(100);

        //获取Response,JsonObject格式
        JsonObject jsonObject = productClient.getAllPoiJsonObject(getAllPoiRequestType,"50611eab45504f108af2109da1ff0777");
        //获取Response,API dto格式
        GetAllPoiResponseType getAllPoiResponseType = productClient.getAllPoi(getAllPoiRequestType, "50611eab45504f108af2109da1ff0777");
        System.out.println(jsonObject);
        System.out.println(GsonUtil.toJson(getAllPoiResponseType));
    }

}
