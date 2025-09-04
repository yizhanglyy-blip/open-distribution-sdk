package com.trip.distribution;

import com.trip.distribution.util.GsonUtil;
import com.trip.distribution.util.HttpUtil;
import jodd.http.HttpResponse;

public class AccountParams {
    /**
     * account parameters
     **/
    // replace with your credentials
    public static String AID = "64019593";
    public static String SID = "190123564";
    public static String KEY = "ba7b02f800514f2c9ccbe952386fd674";
    public static String TOKEN = "b13c777e82764c8081f479adad9247d7";//下文main方法可生成token

    public static void main(String[] args) {
        //get token
        HttpResponse httpResponse = HttpUtil.getToken(AID, SID, KEY);
        String tokenResponse = GsonUtil.toJson(httpResponse.bodyText());
        System.out.println(tokenResponse);
    }

}
