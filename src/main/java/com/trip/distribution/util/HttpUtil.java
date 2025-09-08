package com.trip.distribution.util;

import jodd.http.HttpRequest;
import jodd.http.HttpResponse;
import org.apache.commons.lang.StringUtils;

import java.util.Map;

/**
 * http request tools
 */
public class HttpUtil{

    public static HttpResponse doPost(String url, Map<String, Object> params, String jsonBody) {
        HttpRequest request = HttpRequest.post(url);
        if (params != null && !params.isEmpty()) {
            request.form(params);
        }
        if (StringUtils.isNotEmpty(jsonBody)) {
            request.bodyText(jsonBody);
        }
        HttpResponse response = request
                .contentType("application/json; charset=utf-8")
                .charset(Constants.CHARSET_UTF8)
                .accept("application/json")
                .send();
        response.charset(Constants.CHARSET_UTF8);
        return response;
    }

    public static HttpResponse getToken(String AID,String SID, String KEY) {
        //拼接请求url
        String token_url_test = "http://openservice.open.uat.ctripqa.com/openserviceauth/authorize.ashx";
        String url = token_url_test +
                "?aid=" + AID +
                "&sid=" + SID +
                "&key=" + KEY;
        HttpRequest request = HttpRequest.get(url);
        HttpResponse response = request
                .contentType("application/json; charset=utf-8")
                .charset(Constants.CHARSET_UTF8)
                .accept("application/json")
                .send();
        return response.charset(Constants.CHARSET_UTF8);
    }
    public static HttpResponse getRefreshToken(String AID,String SID, String refresh_Token) {
        //拼接请求url
        String token_url_test = "https://openservice.open.uat.ctripqa.com/openserviceauth/refresh.ashx?";
        String url = token_url_test +
                "?aid=" + AID +
                "&sid=" + SID +
                "&refresh_token=" + refresh_Token;
        HttpRequest request = HttpRequest.get(url);
        HttpResponse response = request
                .contentType("application/json; charset=utf-8")
                .charset(Constants.CHARSET_UTF8)
                .accept("application/json")
                .send();
        return response.charset(Constants.CHARSET_UTF8);
    }

}
