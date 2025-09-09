package com.trip.distribution;

import com.google.gson.JsonObject;
import com.trip.distribution.util.GsonUtil;
import com.trip.distribution.util.HttpUtil;
import jodd.http.HttpResponse;

public class AccountParams {
    /**
     * account parameters
     **/
    // replace with your credentials
    public static String AID = "123";
    public static String SID = "456";
    public static String KEY = "abcdefg";
    public static String TOKEN = "tdgd23333";//下文main方法可生成token

    public static void main(String[] args) {
        //get token
        HttpResponse httpResponse = HttpUtil.getToken(AID, SID, KEY);
        JsonObject TokenResponse = GsonUtil.parse(httpResponse.bodyText(), JsonObject.class);
        String access_Token = String.valueOf(TokenResponse.get("Access_Token"));
        String refresh_Token = String.valueOf(TokenResponse.get("Refresh_Token"));

        System.out.println(access_Token);
        System.out.println(TokenResponse);
        //get refreshToken
//        JsonObject freshTokenJsonObject = refreshToken(refresh_Token);
//        System.out.println(freshTokenJsonObject);//refreshToken
    }

    public static JsonObject refreshToken(String refresh_Token) {
        HttpResponse httpResponse = HttpUtil.getRefreshToken(AID, SID, refresh_Token);
        JsonObject freshTokenResponse = GsonUtil.parse(httpResponse.bodyText(), JsonObject.class);
        return freshTokenResponse;
    }

}
