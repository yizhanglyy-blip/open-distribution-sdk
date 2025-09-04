package com.trip.distribution.util;

/**
 * Constants
 */
public interface Constants {
    /**
     * http parameters
     **/
    String SERVICE_NAME = "serviceName";
    String REQUEST_TIME = "requestTime";
    String VERSION = "version";

    String CHARSET_UTF8 = "UTF-8";
    String METHOD_POST = "POST";
    String METHOD_GET = "GET";

    String HEADER = "header";
    String BODY = "body";
    String RSP_CODE = "resultCode";
    String RSP_MSG = "resultMessage";
    String RSP_REQUEST_ID = "requestId";

    String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    String SDK_VERSION = "trip-tourop-sdk-java-beta";
    String ACCEPT_ENCODING = "Accept-Encoding";
    String CONTENT_ENCODING_GZIP = "gzip";

    /**
     * log level
     **/
    String LOG_LEVEL_DEBUG = "DEBUG";
    String LOG_LEVEL_INFO = "INFO";
    String LOG_LEVEL_ERROR = "ERROR";

    /**
     * Service Name
     **/
    String BOOKINGREQUIRED = "bookingRequired";
    String BOOKINGVERIFY = "bookingVerify";
    String BOOK = "book";
    String BOOKINGSTATUS = "bookingStatus";
    String BOOKINGDETAIL = "bookingDetail";
    String CANCEL = "cancel";
    String GETVOUCHER = "getVoucher";
    String GETCURRENTLOGISTICS = "getCurrentLogistics";
    String REFUNDDETAIL = "refundDetail";
    String CANCELVERIFY = "cancelVerify";

    String SEARCHPRODUCT = "searchProduct";
    String PRODUCTDETAIL = "productDetail";
    String PRICECALENDAR = "priceCalendar";
    String POIDETAIL = "poiDetail";
    String GETALLPRODUCT = "getAllProduct";
    String GETALLPOI = "getAllPoi";

    String CATEGORIES = "categories";
    String LOCATIONS = "locations";
    String GETCURRENCIES = "getCurrencies";
    String GETLOCALES = "getLocales";

}
