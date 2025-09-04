package com.trip.distribution.api.impl;

import com.google.gson.JsonObject;
import com.trip.distribution.api.IOrderClient;
import com.trip.distribution.api.TourOpRequest;
import com.trip.distribution.model.order.*;
import com.trip.distribution.util.ApiException;
import com.trip.distribution.util.Constants;

public class OrderClientImpl extends TourOpAgent implements IOrderClient {

    public OrderClientImpl(String AID, String SID, String TOKEN) {
        super(AID, SID, TOKEN);
    }

    /**
     * 4.1可订检查
     */
    @Override
    public JsonObject bookingVerifyJsonObject(BookingVerifyRequestType model, String icode) throws ApiException {
        TourOpRequest<BookingVerifyRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.BOOKINGVERIFY);
        return getAPIResponse(request);
    }

    @Override
    public BookingVerifyResponseType bookingVerify(BookingVerifyRequestType model, String icode) throws ApiException {
        TourOpRequest<BookingVerifyRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.BOOKINGVERIFY);
        return getAPIResponseV2(request, BookingVerifyResponseType.class);
    }

    /**
     * 4.2获取下单填写信息
     */
    @Override
    public JsonObject bookingRequiredInfoJsonObject(BookingRequiredInfoRequestType model, String icode) throws ApiException {
        TourOpRequest<BookingRequiredInfoRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.BOOKINGREQUIRED);
        return getAPIResponse(request);
    }

    @Override
    public BookingRequiredInfoResponseType bookingRequiredInfo(BookingRequiredInfoRequestType model, String icode) throws ApiException {
        TourOpRequest<BookingRequiredInfoRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.BOOKINGREQUIRED);
        return getAPIResponseV2(request, BookingRequiredInfoResponseType.class);
    }

    /**
     * 4.3创建订单
     */
    @Override
    public JsonObject bookJsonObject(BookRequestType model, String icode) throws ApiException {
        TourOpRequest<BookRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.BOOK);
        return getAPIResponse(request);
    }

    @Override
    public BookResponseType book(BookRequestType model, String icode) throws ApiException {
        TourOpRequest<BookRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.BOOK);
        return getAPIResponseV2(request, BookResponseType.class);
    }

    /**
     * 4.4获取订单状态
     */
    @Override
    public JsonObject bookingStatusJsonObject(BookingStatusRequestType model, String icode) throws ApiException {
        TourOpRequest<BookingStatusRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.BOOKINGSTATUS);
        return getAPIResponse(request);
    }

    @Override
    public BookingStatusResponseType bookingStatus(BookingStatusRequestType model, String icode) throws ApiException {
        TourOpRequest<BookingStatusRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.BOOKINGSTATUS);
        return getAPIResponseV2(request, BookingStatusResponseType.class);
    }

    /**
     * 4.5获取订单详情
     */
    @Override
    public JsonObject bookingDetailJsonObject(BookingDetailRequestType model, String icode) throws ApiException {
        TourOpRequest<BookingDetailRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.BOOKINGDETAIL);
        return getAPIResponse(request);
    }

    @Override
    public BookingDetailResponseType bookingDetail(BookingDetailRequestType model, String icode) throws ApiException {
        TourOpRequest<BookingDetailRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.BOOKINGDETAIL);
        return getAPIResponseV2(request, BookingDetailResponseType.class);
    }

    /**
     * 4.6订单退订
     */
    @Override
    public JsonObject cancelJsonObject(CancelRequestType model, String icode) throws ApiException {
        TourOpRequest<CancelRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.CANCEL);
        return getAPIResponse(request);
    }

    @Override
    public CancelResponseType cancel(CancelRequestType model, String icode) throws ApiException {
        TourOpRequest<CancelRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.CANCEL);
        return getAPIResponseV2(request, CancelResponseType.class);
    }

    /**
     * 4.7凭证信息
     */
    @Override
    public JsonObject getVoucherJsonObject(GetVoucherRequestType model, String icode) throws ApiException {
        TourOpRequest<GetVoucherRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.GETVOUCHER);
        return getAPIResponse(request);
    }

    @Override
    public GetVoucherResponseType getVoucher(GetVoucherRequestType model, String icode) throws ApiException {
        TourOpRequest<GetVoucherRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.GETVOUCHER);
        return getAPIResponseV2(request, GetVoucherResponseType.class);
    }

    /**
     * 4.8物流查询
     */
    @Override
    public JsonObject getCurrentLogisticsJsonObject(GetCurrentLogisticsRequestType model, String icode) throws ApiException {
        TourOpRequest<GetCurrentLogisticsRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.GETCURRENTLOGISTICS);
        return getAPIResponse(request);
    }

    @Override
    public GetCurrentLogisticsResponseType getCurrentLogistics(GetCurrentLogisticsRequestType model, String icode) throws ApiException {
        TourOpRequest<GetCurrentLogisticsRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.GETCURRENTLOGISTICS);
        return getAPIResponseV2(request, GetCurrentLogisticsResponseType.class);
    }

    /**
     * 4.9退订明细查询
     */
    @Override
    public JsonObject refundDetailJsonObject(RefundDetailRequestType model, String icode) throws ApiException {
        TourOpRequest<RefundDetailRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.REFUNDDETAIL);
        return getAPIResponse(request);
    }

    @Override
    public RefundDetailResponseType refundDetail(RefundDetailRequestType model, String icode) throws ApiException {
        TourOpRequest<RefundDetailRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.REFUNDDETAIL);
        return getAPIResponseV2(request, RefundDetailResponseType.class);
    }

    /**
     * 4.10可退检查接口
     */
    @Override
    public JsonObject cancelVerifyJsonObject(CancelVerifyRequestType model, String icode) throws ApiException {
        TourOpRequest<CancelVerifyRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.CANCELVERIFY);
        return getAPIResponse(request);
    }

    @Override
    public CancelVerifyResponseType cancelVerify(CancelVerifyRequestType model, String icode) throws ApiException {
        TourOpRequest<CancelVerifyRequestType> request = TourOpRequest.ofModel(model, icode);
        request.setServiceName(Constants.CANCELVERIFY);
        return getAPIResponseV2(request, CancelVerifyResponseType.class);
    }

}
