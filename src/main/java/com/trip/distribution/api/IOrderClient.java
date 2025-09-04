package com.trip.distribution.api;

import com.google.gson.JsonObject;
import com.trip.distribution.model.order.*;
import com.trip.distribution.util.ApiException;


public interface IOrderClient {
    /**
     * 4.2下单信息
     */
    JsonObject bookingRequiredInfoJsonObject(BookingRequiredInfoRequestType model, String icode) throws ApiException;

    BookingRequiredInfoResponseType bookingRequiredInfo(BookingRequiredInfoRequestType model, String icode) throws ApiException;

    /**
     * 4.1下单校验
     */
    JsonObject bookingVerifyJsonObject(BookingVerifyRequestType model, String icode) throws ApiException;

    BookingVerifyResponseType bookingVerify(BookingVerifyRequestType model, String icode) throws ApiException;

    /**
     * 4.3创建订单
     */
    JsonObject bookJsonObject(BookRequestType model, String icode) throws ApiException;

    BookResponseType book(BookRequestType model, String icode) throws ApiException;

    /**
     * 4.4获取订单状态
     */
    JsonObject bookingStatusJsonObject(BookingStatusRequestType model, String icode) throws ApiException;

    BookingStatusResponseType bookingStatus(BookingStatusRequestType model, String icode) throws ApiException;

    /**
     * 4.5获取订单详情
     */
    JsonObject bookingDetailJsonObject(BookingDetailRequestType model, String icode) throws ApiException;

    BookingDetailResponseType bookingDetail(BookingDetailRequestType model, String icode) throws ApiException;

    /**
     * 4.6订单退订
     */
    JsonObject cancelJsonObject(CancelRequestType model, String icode) throws ApiException;

    CancelResponseType cancel(CancelRequestType model, String icode) throws ApiException;

    /**
     * 4.7凭证信息
     */
    JsonObject getVoucherJsonObject(GetVoucherRequestType model, String icode) throws ApiException;

    GetVoucherResponseType getVoucher(GetVoucherRequestType model, String icode) throws ApiException;

    /**
     * 4.8物流查询
     */
    JsonObject getCurrentLogisticsJsonObject(GetCurrentLogisticsRequestType model, String icode) throws ApiException;

    GetCurrentLogisticsResponseType getCurrentLogistics(GetCurrentLogisticsRequestType model, String icode) throws ApiException;

    /**
     * 4.9退订明细查询
     */
    JsonObject refundDetailJsonObject(RefundDetailRequestType model, String icode) throws ApiException;

    RefundDetailResponseType refundDetail(RefundDetailRequestType model, String icode) throws ApiException;

    /**
     * 4.10可退检查接口
     */
    JsonObject cancelVerifyJsonObject(CancelVerifyRequestType model, String icode) throws ApiException;

    CancelVerifyResponseType cancelVerify(CancelVerifyRequestType model, String icode) throws ApiException;
}
