package com.trip.distribution;

import com.google.gson.JsonObject;
import com.trip.distribution.api.impl.CategoryClientImpl;
import com.trip.distribution.model.category.*;
import com.trip.distribution.util.ApiException;
import com.trip.distribution.util.GsonUtil;

/**
 * Part G Classification Information API
 */
public class CategoryDemo {

    static final String AID = AccountParams.AID;
    static final String SID = AccountParams.SID;
    static final String TOKEN = AccountParams.TOKEN;


    CategoryClientImpl categoryClient;

    public CategoryDemo() {
        categoryClient = new CategoryClientImpl(AID, SID, TOKEN);
    }

    public static void main(String[] args) throws ApiException {
        CategoryDemo demo = new CategoryDemo();
        demo.getLocales();

    }

    //5.1获取品类demo
    public void categories() throws ApiException{
        CategoriesRequestType categoriesRequestType = new CategoriesRequestType();
        categoriesRequestType.setLocale("zh-CN");
        //获取Response,JsonObject
        JsonObject jsonObject = categoryClient.categoriesJsonObject(categoriesRequestType,"fdc2b31b43b2460f943a4dec817e0f65");
        //获取Response,API dto格式
        CategoriesResponseType categoriesResponseType = categoryClient.categories(categoriesRequestType, "fdc2b31b43b2460f943a4dec817e0f65");
        System.out.println(jsonObject);
        System.out.println(GsonUtil.toJson(categoriesResponseType));
    }

    //5.2获取位置demo
    public void locations() throws ApiException{
        LocationsRequestType locationsRequestType = new LocationsRequestType();
        locationsRequestType.setLocale("zh-CN");
        locationsRequestType.setPageIndex(1);
        locationsRequestType.setPageSize(100);
        //获取Response,JsonObject格式
        JsonObject jsonObject = categoryClient.locationsJsonObject(locationsRequestType,"63bc9b16f83e42d4aefa5200c1ee3326");
        //获取Response,API dto格式
        LocationsResponseType locationsResponseType = categoryClient.locations(locationsRequestType, "63bc9b16f83e42d4aefa5200c1ee3326");
        System.out.println(jsonObject);
        System.out.println(GsonUtil.toJson(locationsResponseType));

    }

    //5.3获取货币demo
    public void getCurrencies() throws ApiException{
        GetCurrenciesRequestType getCurrenciesRequestType = new GetCurrenciesRequestType();
        //获取Response,JsonObject格式
        JsonObject jsonObject = categoryClient.getCurrenciesJsonObject(getCurrenciesRequestType,"a3bb8914625c45889667abdb017dc3bc");
        //获取Response,API dto格式
        GetCurrenciesResponseType getCurrenciesResponseType = categoryClient.getCurrencies(getCurrenciesRequestType, "a3bb8914625c45889667abdb017dc3bc");
        System.out.println(jsonObject);
        System.out.println(GsonUtil.toJson(getCurrenciesResponseType));
    }

    //5.4获取语言demo
    public void getLocales() throws ApiException{
        GetLocalesRequestType getLocalesRequestType = new GetLocalesRequestType();
        //获取Response,JsonObject格式
        JsonObject jsonObject = categoryClient.getLocalesJsonObject(getLocalesRequestType,"ad24bb7be681419295af1803dea3cc62");
        //获取Response,API dto格式
        GetLocalesResponseType getLocalesResponseType = categoryClient.getLocales(getLocalesRequestType, "ad24bb7be681419295af1803dea3cc62");
        System.out.println(jsonObject);
        System.out.println(GsonUtil.toJson(getLocalesResponseType));
    }



}
