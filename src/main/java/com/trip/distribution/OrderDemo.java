package com.trip.distribution;

import com.google.gson.JsonObject;
import com.trip.distribution.api.impl.OrderClientImpl;
import com.trip.distribution.model.order.*;
import com.trip.distribution.util.ApiException;
import com.trip.distribution.util.GsonUtil;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Part F Reservation-related API
 */
public class OrderDemo {

    static final String AID = AccountParams.AID;
    static final String SID = AccountParams.SID;
    static final String TOKEN = AccountParams.TOKEN;

    OrderClientImpl orderClient;

    public OrderDemo() {
        orderClient = new OrderClientImpl(AID, SID, TOKEN);
    }

    public static void main(String[] args) throws ApiException {
        OrderDemo demo = new OrderDemo();
//        demo.bookingRequired();
//        demo.bookingVerify();
        demo.bookingRequiredInfo();


    }

    //4.2获取下单信息demo
    public void bookingRequiredInfo() throws ApiException{
        BookingRequiredInfoRequestType bookingRequiredInfoRequestType = new BookingRequiredInfoRequestType();
        bookingRequiredInfoRequestType.setLocale("zh-CN");
        bookingRequiredInfoRequestType.setCurrency("CNY");
        bookingRequiredInfoRequestType.setProductID(76458827L);
        bookingRequiredInfoRequestType.setPackageID(76458829L);
        //获取Response,JsonObject
        JsonObject jsonObject = orderClient.bookingRequiredInfoJsonObject(bookingRequiredInfoRequestType,"b2cce56b68874e88aaa0a1ef82c635fe");
        //获取Response,API dto格式
        BookingRequiredInfoResponseType bookingRequiredInfoResponseType = orderClient.bookingRequiredInfo(bookingRequiredInfoRequestType, "b2cce56b68874e88aaa0a1ef82c635fe");
        System.out.println(jsonObject);
        System.out.println(GsonUtil.toJson(bookingRequiredInfoResponseType));

    }


    //4.1下单校验demo
    public void bookingVerify() throws ApiException {
        //构造请求参数
        BookingVerifyRequestType bookingVerifyRequest = new BookingVerifyRequestType();
        //站点、币种
        bookingVerifyRequest.setLocale("zh-CN");
        bookingVerifyRequest.setCurrency("CNY");
        //产品、套餐、资源
        BasicOrder basicOrder= new BasicOrder();

        List<OrderResource> orderResourceList = new ArrayList<>();
        OrderResource orderResource = new OrderResource();
        orderResource.setResourceID(74919995L);
        orderResource.setUseDate("2025-08-30");
        orderResource.setQuantity(1);
        orderResource.setPrice(new BigDecimal("12.15"));
        orderResourceList.add(orderResource);

        basicOrder.setOrderResourceList(orderResourceList);
        basicOrder.setProductID(67893182L);
        basicOrder.setPackageID(74919994L);
        basicOrder.setAmount(new BigDecimal("12.15"));
        bookingVerifyRequest.setBasicOrder(basicOrder);
        //联系人
        Contact contact = new Contact();
        contact.setName("藏三");
        Mobile mobile = new Mobile();
        mobile.setInternationalTelephoneCode("86");
        mobile.setMobileNumber("18226998070");
        contact.setMobile(mobile);
        bookingVerifyRequest.setContact(contact);
        //出行人
        List<Passenger> passengerList = new ArrayList<>();
        Passenger passenger = new Passenger();
        List<QuestionAnswer> questionAnswerList = new ArrayList<>();
        QuestionAnswer questionAnswer = new QuestionAnswer();
        questionAnswer.setQuestionID(3L);
        questionAnswer.setQuestionCode("P_CNAME");
        questionAnswer.setAnswerList(Arrays.asList("张三"));
        questionAnswerList.add(questionAnswer);

        passenger.setPackageID(74919994L);
        passenger.setResourceId(74919995L);
        passenger.setQuestionAnswerList(questionAnswerList);
        passengerList.add(passenger);
        bookingVerifyRequest.setPassengerList(passengerList);

        //获取Response,JsonObject
        JsonObject jsonObject = orderClient.bookingVerifyJsonObject(bookingVerifyRequest, "f840b9956a1a42388557e25e9c3094a0");
        //获取Response,API dto格式
        BookingVerifyResponseType bookingVerifyResponseType = orderClient.bookingVerify(bookingVerifyRequest, "f840b9956a1a42388557e25e9c3094a0");
        System.out.println(jsonObject);
        System.out.println(GsonUtil.toJson(bookingVerifyResponseType));

    }

    //4.3创建订单demo1 一单一人传参示例(购买2张传1个出行人)
    public void book1() throws ApiException{
        BookRequestType bookRequestType = new BookRequestType();

        //站点、币种
        bookRequestType.setLocale("zh-CN");
        bookRequestType.setCurrency("CNY");
        bookRequestType.setDistributorOrderID("test-1234");//分销商订单id
        //产品、套餐、资源
        BasicOrder basicOrder= new BasicOrder();

        List<OrderResource> orderResourceList = new ArrayList<>();
        OrderResource orderResource = new OrderResource();
        orderResource.setResourceID(74919995L);
        orderResource.setUseDate("2025-08-29");
        orderResource.setQuantity(2);
        orderResource.setPrice(new BigDecimal("12.15"));
        orderResourceList.add(orderResource);

        basicOrder.setOrderResourceList(orderResourceList);
        basicOrder.setProductID(67893182L);
        basicOrder.setPackageID(74919994L);
        basicOrder.setAmount(new BigDecimal("24.3"));
        bookRequestType.setBasicOrder(basicOrder);
        //联系人
        Contact contact = new Contact();
        contact.setName("藏三");
        Mobile mobile = new Mobile();
        mobile.setInternationalTelephoneCode("86");
        mobile.setMobileNumber("18226998070");
        contact.setMobile(mobile);
        bookRequestType.setContact(contact);
        //出行人
        List<Passenger> passengerList = new ArrayList<>();
        Passenger passenger = new Passenger();
        List<QuestionAnswer> questionAnswerList = new ArrayList<>();
        QuestionAnswer questionAnswer = new QuestionAnswer();
        questionAnswer.setQuestionID(3L);
        questionAnswer.setQuestionCode("P_CNAME");//中文名，传P_CNAME，具体见接口文档6.8对姓名传参的描述
        questionAnswer.setAnswerList(Arrays.asList("张三"));//List<String>
        questionAnswerList.add(questionAnswer);

        passenger.setPackageID(74919994L);
        passenger.setResourceId(74919995L);
        passenger.setQuestionAnswerList(questionAnswerList);
        passengerList.add(passenger);
        bookRequestType.setPassengerList(passengerList);


        //获取Response,JsonObject格式
        JsonObject jsonObject = orderClient.bookJsonObject(bookRequestType,"a0fc8c6cf3524a31814f700490071f91");
        //获取Response,API dto格式
        BookResponseType bookResponseType = orderClient.book(bookRequestType, "a0fc8c6cf3524a31814f700490071f91");
        System.out.println(jsonObject);
        System.out.println(bookResponseType);
    }

    //4.3创建订单demo2 一张一人传参示例(购买2张传2个出行人)
    public void book2() throws ApiException{
        BookRequestType bookRequestType = new BookRequestType();

        //站点、币种
        bookRequestType.setLocale("zh-CN");
        bookRequestType.setCurrency("CNY");
        bookRequestType.setDistributorOrderID("test-12345");//分销商订单id
        //产品、套餐、资源
        BasicOrder basicOrder= new BasicOrder();

        List<OrderResource> orderResourceList = new ArrayList<>();
        OrderResource orderResource = new OrderResource();
        orderResource.setResourceID(72961133L);
        orderResource.setUseDate("2025-09-10");
        orderResource.setQuantity(2);
        orderResource.setPrice(new BigDecimal("60.45"));
        orderResourceList.add(orderResource);

        basicOrder.setOrderResourceList(orderResourceList);
        basicOrder.setProductID(72961131L);
        basicOrder.setPackageID(72961132L);
        basicOrder.setAmount(new BigDecimal("120.9"));
        bookRequestType.setBasicOrder(basicOrder);
        //联系人
        Contact contact = new Contact();
        contact.setName("藏三");
        Mobile mobile = new Mobile();
        mobile.setInternationalTelephoneCode("86");
        mobile.setMobileNumber("18226998070");
        contact.setMobile(mobile);
        contact.setEmail("zy@qq.com");//邮箱
        bookRequestType.setContact(contact);
        //出行人List
        List<Passenger> passengerList = new ArrayList<>();
        //出行人1
        Passenger passenger1 = new Passenger();
        List<QuestionAnswer> questionAnswerList1 = new ArrayList<>();//出行人1填写信息List
        QuestionAnswer questionAnswer_NAME_1 = new QuestionAnswer();//姓名
        questionAnswer_NAME_1.setQuestionID(3L);
        questionAnswer_NAME_1.setQuestionCode("P_CNAME");//中文名，传P_CNAME
        questionAnswer_NAME_1.setAnswerList(Arrays.asList("张三"));
        questionAnswerList1.add(questionAnswer_NAME_1);

        QuestionAnswer questionAnswer_CARD_1 = new QuestionAnswer();//证件
        questionAnswer_CARD_1.setQuestionID(13L);
        questionAnswer_CARD_1.setQuestionCode("P_ID_CARD");//身份证
        questionAnswer_CARD_1.setAnswerList(Arrays.asList("340302200511171252"));//List<String>
        questionAnswerList1.add(questionAnswer_CARD_1);

        passenger1.setPackageID(72961132L);
        passenger1.setResourceId(72961133L);
        passenger1.setQuestionAnswerList(questionAnswerList1);
        passengerList.add(passenger1);

        //出行人2
        Passenger passenger2 = new Passenger();
        List<QuestionAnswer> questionAnswerList2 = new ArrayList<>();//出行人2填写信息List
        QuestionAnswer questionAnswer_NAME_2 = new QuestionAnswer();//姓名
        questionAnswer_NAME_2.setQuestionID(3L);
        questionAnswer_NAME_2.setQuestionCode("P_CNAME");//中文名，传P_CNAME
        questionAnswer_NAME_2.setAnswerList(Arrays.asList("张三"));
        questionAnswerList2.add(questionAnswer_NAME_2);

        QuestionAnswer questionAnswer_CARD_2 = new QuestionAnswer();//证件
        questionAnswer_CARD_2.setQuestionID(13L);
        questionAnswer_CARD_2.setQuestionCode("P_ID_CARD");//身份证
        questionAnswer_CARD_2.setAnswerList(Arrays.asList("340302200511025976"));//List<String>
        questionAnswerList2.add(questionAnswer_CARD_2);

        passenger2.setPackageID(72961132L);
        passenger2.setResourceId(72961133L);
        passenger2.setQuestionAnswerList(questionAnswerList2);
        passengerList.add(passenger2);

        bookRequestType.setPassengerList(passengerList);


        //获取Response,JsonObject格式
        JsonObject jsonObject = orderClient.bookJsonObject(bookRequestType,"a0fc8c6cf3524a31814f700490071f91");
        //获取Response,API dto格式
        BookResponseType bookResponseType = orderClient.book(bookRequestType, "a0fc8c6cf3524a31814f700490071f91");
        System.out.println(jsonObject);
        System.out.println(bookResponseType);
    }

    //4.3创建订单demo3 无需出行人传参示例(购买2张不传出行人)
    public void book3() throws ApiException{
        BookRequestType bookRequestType = new BookRequestType();

        //站点、币种
        bookRequestType.setLocale("zh-CN");
        bookRequestType.setCurrency("CNY");
        bookRequestType.setDistributorOrderID("test-1234522");//分销商订单id
        //产品、套餐、资源
        BasicOrder basicOrder= new BasicOrder();

        List<OrderResource> orderResourceList = new ArrayList<>();
        OrderResource orderResource = new OrderResource();
        orderResource.setResourceID(39119266L);
        orderResource.setUseDate("2025-09-10");
        orderResource.setQuantity(2);
        orderResource.setPrice(new BigDecimal("80.23"));
        orderResourceList.add(orderResource);

        basicOrder.setOrderResourceList(orderResourceList);
        basicOrder.setProductID(39119154L);
        basicOrder.setPackageID(39119265L);
        basicOrder.setAmount(new BigDecimal("160.46"));
        bookRequestType.setBasicOrder(basicOrder);
        //联系人
        Contact contact = new Contact();
        contact.setName("藏三");
        Mobile mobile = new Mobile();
        mobile.setInternationalTelephoneCode("86");
        mobile.setMobileNumber("18226998070");
        contact.setMobile(mobile);
        contact.setEmail("zy@qq.com");//邮箱
        bookRequestType.setContact(contact);
        //出行人List不用传参
//        List<Passenger> passengerList = new ArrayList<>();

        //获取Response,JsonObject格式
        JsonObject jsonObject = orderClient.bookJsonObject(bookRequestType,"a0fc8c6cf3524a31814f700490071f91");
        //获取Response,API dto格式
        BookResponseType bookResponseType = orderClient.book(bookRequestType, "a0fc8c6cf3524a31814f700490071f91");
        System.out.println(jsonObject);
        System.out.println(bookResponseType);
    }

    //4.3创建订单demo4 下单附加信息传参示例(购买2张,传2出行人)
    public void book4() throws ApiException{
        BookRequestType bookRequestType = new BookRequestType();

        //站点、币种
        bookRequestType.setLocale("zh-CN");
        bookRequestType.setCurrency("CNY");
        bookRequestType.setDistributorOrderID("test-12345dd");//分销商订单id
        //产品、套餐、资源
        BasicOrder basicOrder= new BasicOrder();

        List<OrderResource> orderResourceList = new ArrayList<>();
        OrderResource orderResource = new OrderResource();
        orderResource.setResourceID(75891133L);
        orderResource.setUseDate("2025-09-12");
        orderResource.setQuantity(2);
        orderResource.setPrice(new BigDecimal("60.45"));
        orderResourceList.add(orderResource);

        basicOrder.setOrderResourceList(orderResourceList);
        basicOrder.setProductID(75891040L);
        basicOrder.setPackageID(75891129L);
        basicOrder.setAmount(new BigDecimal("120.9"));
        bookRequestType.setBasicOrder(basicOrder);
        //联系人
        Contact contact = new Contact();
        contact.setName("藏三");
        Mobile mobile = new Mobile();
        mobile.setInternationalTelephoneCode("86");
        mobile.setMobileNumber("18226998070");
        contact.setMobile(mobile);
//        contact.setEmail("zy@qq.com");//邮箱
        bookRequestType.setContact(contact);
        //出行人List
        List<Passenger> passengerList = new ArrayList<>();
        //出行人1
        Passenger passenger1 = new Passenger();
        List<QuestionAnswer> questionAnswerList1 = new ArrayList<>();//出行人1填写信息List
        QuestionAnswer questionAnswer_NAME_1 = new QuestionAnswer();//姓名
        questionAnswer_NAME_1.setQuestionID(3L);
        questionAnswer_NAME_1.setQuestionCode("P_CNAME");//中文名，传P_CNAME
        questionAnswer_NAME_1.setAnswerList(Arrays.asList("张三"));
        questionAnswerList1.add(questionAnswer_NAME_1);

        QuestionAnswer questionAnswer_CARD_1 = new QuestionAnswer();//证件
        questionAnswer_CARD_1.setQuestionID(13L);
        questionAnswer_CARD_1.setQuestionCode("P_ID_CARD");//身份证
        questionAnswer_CARD_1.setAnswerList(Arrays.asList("340302200511171252"));
        questionAnswerList1.add(questionAnswer_CARD_1);

        QuestionAnswer questionAnswer_A_CUSTOMIZED_1 = new QuestionAnswer();//附加信息-收件人姓名
        questionAnswer_A_CUSTOMIZED_1.setQuestionID(678L);
        questionAnswer_A_CUSTOMIZED_1.setQuestionCode("A_CUSTOMIZED");//身份证
        questionAnswer_A_CUSTOMIZED_1.setAnswerList(Arrays.asList("测试"));//List<String>
        questionAnswerList1.add(questionAnswer_A_CUSTOMIZED_1);

        QuestionAnswer questionAnswer_A_GET_ON_LOCATION_1 = new QuestionAnswer();//附加信息-上车点
        questionAnswer_A_GET_ON_LOCATION_1.setQuestionID(3L);
        questionAnswer_A_GET_ON_LOCATION_1.setQuestionCode("A_GET_ON_LOCATION");//上车点
        questionAnswer_A_GET_ON_LOCATION_1.setAnswerList(Arrays.asList("170293684"));//emun类型的附加信息，传下单信息接口下发的itemid
        questionAnswerList1.add(questionAnswer_A_GET_ON_LOCATION_1);

        passenger1.setPackageID(75891129L);
        passenger1.setResourceId(75891133L);
        passenger1.setQuestionAnswerList(questionAnswerList1);
        passengerList.add(passenger1);

        //出行人2
        Passenger passenger2 = new Passenger();
        List<QuestionAnswer> questionAnswerList2 = new ArrayList<>();//出行人2填写信息List
        QuestionAnswer questionAnswer_NAME_2 = new QuestionAnswer();//姓名
        questionAnswer_NAME_2.setQuestionID(3L);
        questionAnswer_NAME_2.setQuestionCode("P_CNAME");//中文名，传P_CNAME
        questionAnswer_NAME_2.setAnswerList(Arrays.asList("张三"));
        questionAnswerList2.add(questionAnswer_NAME_2);

        QuestionAnswer questionAnswer_CARD_2 = new QuestionAnswer();//证件
        questionAnswer_CARD_2.setQuestionID(13L);
        questionAnswer_CARD_2.setQuestionCode("P_ID_CARD");//身份证
        questionAnswer_CARD_2.setAnswerList(Arrays.asList("340302200511025976"));//List<String>
        questionAnswerList2.add(questionAnswer_CARD_2);
//这里注意，无论是一单一人还是一张一人的票，附加信息只需要传在出行人1即可，其余的出行人不需要传

        passenger2.setPackageID(75891129L);
        passenger2.setResourceId(75891133L);
        passenger2.setQuestionAnswerList(questionAnswerList2);
        passengerList.add(passenger2);

        bookRequestType.setPassengerList(passengerList);


        //获取Response,JsonObject格式
        JsonObject jsonObject = orderClient.bookJsonObject(bookRequestType,"a0fc8c6cf3524a31814f700490071f91");
        //获取Response,API dto格式
        BookResponseType bookResponseType = orderClient.book(bookRequestType, "a0fc8c6cf3524a31814f700490071f91");
        System.out.println(jsonObject);
        System.out.println(bookResponseType);
    }

    //4.3创建订单demo5 打包产品下单传参示例(三个资源的打包产品)
    public void book5() throws ApiException{
        BookRequestType bookRequestType = new BookRequestType();

        //站点、币种
        bookRequestType.setLocale("zh-CN");
        bookRequestType.setCurrency("CNY");
        bookRequestType.setDistributorOrderID("test-12345dd222");//分销商订单id
        //产品、套餐、资源
        BasicOrder basicOrder= new BasicOrder();

        List<OrderResource> orderResourceList = new ArrayList<>();
        OrderResource orderResource = new OrderResource();
        orderResource.setResourceID(46583128L);
        orderResource.setUseDate("2025-09-12");
        orderResource.setQuantity(1);
        orderResource.setPrice(new BigDecimal("61.83"));
        orderResourceList.add(orderResource);

        basicOrder.setOrderResourceList(orderResourceList);
        basicOrder.setProductID(46583124L);
        basicOrder.setPackageID(46583127L);
        basicOrder.setAmount(new BigDecimal("61.83"));
        bookRequestType.setBasicOrder(basicOrder);
        //联系人
        Contact contact = new Contact();
        contact.setName("藏三");
        Mobile mobile = new Mobile();
        mobile.setInternationalTelephoneCode("86");
        mobile.setMobileNumber("18226998070");
        contact.setMobile(mobile);
//        contact.setEmail("zy@qq.com");//邮箱
        bookRequestType.setContact(contact);
        //出行人List
        List<Passenger> passengerList = new ArrayList<>();
        //出行人1
        Passenger passenger1 = new Passenger();
        List<QuestionAnswer> questionAnswerList1 = new ArrayList<>();//出行人1填写信息List
        QuestionAnswer questionAnswer_NAME_1 = new QuestionAnswer();//姓名
        questionAnswer_NAME_1.setQuestionID(3L);
        questionAnswer_NAME_1.setQuestionCode("P_CNAME");//中文名，传P_CNAME
        questionAnswer_NAME_1.setAnswerList(Arrays.asList("张三"));
        questionAnswerList1.add(questionAnswer_NAME_1);

        QuestionAnswer questionAnswer_CARD_1 = new QuestionAnswer();//证件
        questionAnswer_CARD_1.setQuestionID(13L);
        questionAnswer_CARD_1.setQuestionCode("P_ID_CARD");//身份证
        questionAnswer_CARD_1.setAnswerList(Arrays.asList("340302200511171252"));
        questionAnswerList1.add(questionAnswer_CARD_1);

        passenger1.setPackageID(46583127L);
        passenger1.setResourceId(46583128L);
        passenger1.setQuestionAnswerList(questionAnswerList1);
        passengerList.add(passenger1);

        //出行人2
        Passenger passenger2 = new Passenger();
        List<QuestionAnswer> questionAnswerList2 = new ArrayList<>();//出行人2填写信息List
        QuestionAnswer questionAnswer_NAME_2 = new QuestionAnswer();//姓名
        questionAnswer_NAME_2.setQuestionID(3L);
        questionAnswer_NAME_2.setQuestionCode("P_CNAME");//中文名，传P_CNAME
        questionAnswer_NAME_2.setAnswerList(Arrays.asList("张三"));
        questionAnswerList2.add(questionAnswer_NAME_2);

        QuestionAnswer questionAnswer_CARD_2 = new QuestionAnswer();//证件
        questionAnswer_CARD_2.setQuestionID(13L);
        questionAnswer_CARD_2.setQuestionCode("P_ID_CARD");//身份证
        questionAnswer_CARD_2.setAnswerList(Arrays.asList("340302200511025976"));//List<String>
        questionAnswerList2.add(questionAnswer_CARD_2);

        passenger2.setPackageID(46583127L);
        passenger2.setResourceId(46583128L);
        passenger2.setQuestionAnswerList(questionAnswerList2);
        passengerList.add(passenger2);

        //出行人3
        Passenger passenger3= new Passenger();
        List<QuestionAnswer> questionAnswerList3 = new ArrayList<>();//出行人2填写信息List
        QuestionAnswer questionAnswer_NAME_3 = new QuestionAnswer();//姓名
        questionAnswer_NAME_3.setQuestionID(3L);
        questionAnswer_NAME_3.setQuestionCode("P_CNAME");//中文名，传P_CNAME
        questionAnswer_NAME_3.setAnswerList(Arrays.asList("张三"));
        questionAnswerList3.add(questionAnswer_NAME_3);

        QuestionAnswer questionAnswer_CARD_3 = new QuestionAnswer();//证件
        questionAnswer_CARD_3.setQuestionID(13L);
        questionAnswer_CARD_3.setQuestionCode("P_ID_CARD");//身份证
        questionAnswer_CARD_3.setAnswerList(Arrays.asList("340100201803148813"));//List<String>
        questionAnswerList3.add(questionAnswer_CARD_3);

        passenger3.setPackageID(46583127L);
        passenger3.setResourceId(46583128L);
        passenger3.setQuestionAnswerList(questionAnswerList3);
        passengerList.add(passenger3);

        bookRequestType.setPassengerList(passengerList);


        //获取Response,JsonObject格式
        JsonObject jsonObject = orderClient.bookJsonObject(bookRequestType,"a0fc8c6cf3524a31814f700490071f91");
        //获取Response,API dto格式
        BookResponseType bookResponseType = orderClient.book(bookRequestType, "a0fc8c6cf3524a31814f700490071f91");
        System.out.println(jsonObject);
        System.out.println(bookResponseType);
    }

    //4.3创建订单demo6 护照、英文名传参示例
    public void book6() throws ApiException{
        BookRequestType bookRequestType = new BookRequestType();

        //站点、币种
        bookRequestType.setLocale("zh-CN");
        bookRequestType.setCurrency("CNY");
        bookRequestType.setDistributorOrderID("test1-1234");//分销商订单id
        //产品、套餐、资源
        BasicOrder basicOrder= new BasicOrder();

        List<OrderResource> orderResourceList = new ArrayList<>();
        OrderResource orderResource = new OrderResource();
        orderResource.setResourceID(72490096L);
        orderResource.setUseDate("2025-08-29");
        orderResource.setQuantity(1);
        orderResource.setPrice(new BigDecimal("60.45"));
        orderResourceList.add(orderResource);

        basicOrder.setOrderResourceList(orderResourceList);
        basicOrder.setProductID(72490094L);
        basicOrder.setPackageID(72490095L);
        basicOrder.setAmount(new BigDecimal("60.45"));
        bookRequestType.setBasicOrder(basicOrder);
        //联系人
        Contact contact = new Contact();
        contact.setName("藏三");
        Mobile mobile = new Mobile();
        mobile.setInternationalTelephoneCode("86");
        mobile.setMobileNumber("18226998070");
        contact.setMobile(mobile);
        bookRequestType.setContact(contact);
        //出行人List
        List<Passenger> passengerList = new ArrayList<>();
        //出行人1
        Passenger passenger = new Passenger();
        //出行人
        List<QuestionAnswer> questionAnswerList = new ArrayList<>();//出行人1填写信息List
        QuestionAnswer questionAnswer_FirstName = new QuestionAnswer();//姓名
        questionAnswer_FirstName.setQuestionID(3L);
        questionAnswer_FirstName.setQuestionCode("P_FIRSTNAME");//英文名
        questionAnswer_FirstName.setAnswerList(Arrays.asList("aaa"));
        questionAnswerList.add(questionAnswer_FirstName);

        QuestionAnswer questionAnswer_LastName = new QuestionAnswer();//姓名
        questionAnswer_LastName.setQuestionID(3L);
        questionAnswer_LastName.setQuestionCode("P_LASTNAME");//英文姓
        questionAnswer_LastName.setAnswerList(Arrays.asList("bbb"));
        questionAnswerList.add(questionAnswer_LastName);

        QuestionAnswer questionAnswer_P_PASSPORT = new QuestionAnswer();//护照
        questionAnswer_P_PASSPORT.setQuestionID(14L);
        questionAnswer_P_PASSPORT.setQuestionCode("P_PASSPORT");//身份证
        questionAnswer_P_PASSPORT.setAnswerList(Arrays.asList("146428737"));
        questionAnswerList.add(questionAnswer_P_PASSPORT);

        passenger.setPackageID(72490095L);
        passenger.setResourceId(72490096L);
        passenger.setQuestionAnswerList(questionAnswerList);
        passengerList.add(passenger);
        bookRequestType.setPassengerList(passengerList);

        //获取Response,JsonObject格式
        JsonObject jsonObject = orderClient.bookJsonObject(bookRequestType,"a0fc8c6cf3524a31814f700490071f91");
        //获取Response,API dto格式
        BookResponseType bookResponseType = orderClient.book(bookRequestType, "a0fc8c6cf3524a31814f700490071f91");
        System.out.println(jsonObject);
        System.out.println(bookResponseType);
    }

    //4.4获取订单状态demo
    public void bookingStatus() throws ApiException{
        BookingStatusRequestType bookingStatusRequestType = new BookingStatusRequestType();

        //Pass in the orderID
        bookingStatusRequestType.setOrderIDList(Arrays.asList(1129270123876386L,234L));
        // Pass in the DistributorOrderID
        // bookingStatusRequestType.setDistributorOrderIDList(Arrays.asList("123","234"));

        //获取Response,JsonObject格式
        JsonObject jsonObject = orderClient.bookingStatusJsonObject(bookingStatusRequestType,"1f8b6e710fbf4e9aa6a3fa5953050ce9");
        //获取Response,API dto格式
        BookingStatusResponseType bookingStatusResponseType = orderClient.bookingStatus(bookingStatusRequestType, "1f8b6e710fbf4e9aa6a3fa5953050ce9");
        System.out.println(jsonObject);
        System.out.println(GsonUtil.toJson(bookingStatusResponseType));
    }

    //4.5获取订单详情demo
    public void bookingDetail() throws ApiException{
        BookingDetailRequestType bookingDetailRequestType = new BookingDetailRequestType();
        //Pass in the orderID
        bookingDetailRequestType.setOrderID(1129270123876386L);
        //Pass in the DistributorOrderID
        //bookingDetailRequestType.setDistributorOrderID("23333");

        //获取Response,JsonObject格式
        JsonObject jsonObject = orderClient.bookingDetailJsonObject(bookingDetailRequestType,"24c5daf9151a43b681632e6e3f173299");
        //获取Response,API dto格式
        BookingDetailResponseType bookingDetailResponseType = orderClient.bookingDetail(bookingDetailRequestType, "24c5daf9151a43b681632e6e3f173299");
        System.out.println(jsonObject);
        System.out.println(GsonUtil.toJson(bookingDetailResponseType));
    }

    //4.6订单退订demo 整单退
    public void cancel1() throws ApiException{
        CancelRequestType cancelRequestType = new CancelRequestType();
        //整单退，只需要传入订单id
        cancelRequestType.setOrderId(1129270123876386L);
        cancelRequestType.setReason("计划有变");

        //获取Response,JsonObject格式
        JsonObject jsonObject = orderClient.cancelJsonObject(cancelRequestType,"4da5ce5a79304ab382ba8dfdd6b706a0");
        //获取Response,API dto格式
        CancelResponseType cancelResponseType = orderClient.cancel(cancelRequestType, "4da5ce5a79304ab382ba8dfdd6b706a0");
        System.out.println(jsonObject);
        System.out.println(GsonUtil.toJson(cancelResponseType));
    }

    //4.6订单退订demo 部分退，一单一人票部分退传参示例
    public void cancel2() throws ApiException{
        CancelRequestType cancelRequestType = new CancelRequestType();
        cancelRequestType.setOrderId(1129270123876386L);

        //部分退场景需要传入cancelOrderItems字段
        List<CancelOrderItemType> cancelOrderItems = new ArrayList<>();

        CancelOrderItemType cancelOrderItemType = new CancelOrderItemType();
        cancelOrderItemType.setOrderItemId(123L);
        cancelOrderItemType.setQuantity(1);
        cancelOrderItems.add(cancelOrderItemType);

        cancelRequestType.setCancelOrderItems(cancelOrderItems);

        //获取Response,JsonObject格式
        JsonObject jsonObject = orderClient.cancelJsonObject(cancelRequestType,"4da5ce5a79304ab382ba8dfdd6b706a0");
        //获取Response,API dto格式
        CancelResponseType cancelResponseType = orderClient.cancel(cancelRequestType, "4da5ce5a79304ab382ba8dfdd6b706a0");
        System.out.println(jsonObject);
        System.out.println(GsonUtil.toJson(cancelResponseType));
    }

    //4.6订单退订demo 部分退，一张一人票部分退传参示例
    public void cancel3() throws ApiException{
        CancelRequestType cancelRequestType = new CancelRequestType();
        cancelRequestType.setOrderId(1129270123876386L);

        //部分退场景需要传入cancelOrderItems字段
        List<CancelOrderItemType> cancelOrderItems = new ArrayList<>();

        CancelOrderItemType cancelOrderItemType = new CancelOrderItemType();
        cancelOrderItemType.setOrderItemId(123L);
        cancelOrderItemType.setQuantity(1);
        //一张一人票需要传入对应出行人id:clientid
        cancelOrderItemType.setClientIdList(Arrays.asList(1234L));
        cancelOrderItems.add(cancelOrderItemType);

        cancelRequestType.setCancelOrderItems(cancelOrderItems);

        //获取Response,JsonObject格式
        JsonObject jsonObject = orderClient.cancelJsonObject(cancelRequestType,"4da5ce5a79304ab382ba8dfdd6b706a0");
        //获取Response,API dto格式
        CancelResponseType cancelResponseType = orderClient.cancel(cancelRequestType, "4da5ce5a79304ab382ba8dfdd6b706a0");
        System.out.println(jsonObject);
        System.out.println(GsonUtil.toJson(cancelResponseType));
    }

    //4.7凭证信息demo
    public void getVoucher() throws ApiException{
        GetVoucherRequestType getVoucherRequestType = new GetVoucherRequestType();

        getVoucherRequestType.setOrderID(1129270123876386L);
        //获取Response,JsonObject格式
        JsonObject jsonObject = orderClient.getVoucherJsonObject(getVoucherRequestType,"b307b723ce774eafa950556186016ee0");
        //获取Response,API dto格式
        GetVoucherResponseType getVoucherResponseType = orderClient.getVoucher(getVoucherRequestType, "b307b723ce774eafa950556186016ee0");
        System.out.println(jsonObject);
        System.out.println(GsonUtil.toJson(getVoucherResponseType));
    }

    //4.8物流查询demo
    public void getCurrentLogistics() throws ApiException{
        GetCurrentLogisticsRequestType getCurrentLogisticsRequestType = new GetCurrentLogisticsRequestType();

        getCurrentLogisticsRequestType.setOrderID(1129270123876386L);
        getCurrentLogisticsRequestType.setCompanyCode("dd");
        getCurrentLogisticsRequestType.setExpressNumber("1234");

        //获取Response,JsonObject格式
        JsonObject jsonObject = orderClient.getCurrentLogisticsJsonObject(getCurrentLogisticsRequestType,"0fb75b1f5cb64678acc970b2ba1c7f94");
        //获取Response,API dto格式
        GetCurrentLogisticsResponseType getCurrentLogisticsResponseType = orderClient.getCurrentLogistics(getCurrentLogisticsRequestType, "0fb75b1f5cb64678acc970b2ba1c7f94");
        System.out.println(jsonObject);
        System.out.println(GsonUtil.toJson(getCurrentLogisticsResponseType));
    }

    //4.9退订明细查询demo
    public void refundDetail() throws ApiException{
        RefundDetailRequestType refundDetailRequestType = new RefundDetailRequestType();

        refundDetailRequestType.setOrderID(1129270123876386L);

        //获取Response,JsonObject格式
        JsonObject jsonObject = orderClient.refundDetailJsonObject(refundDetailRequestType,"8cb299e1d4ac4ff8ac3b6a7cb2b74fdb");
        //获取Response,API dto格式
        RefundDetailResponseType refundDetailResponseType = orderClient.refundDetail(refundDetailRequestType, "8cb299e1d4ac4ff8ac3b6a7cb2b74fdb");
        System.out.println(jsonObject);
        System.out.println(GsonUtil.toJson(refundDetailResponseType));
    }

    //4.10可退检查接口demo
    public void cancelVerify() throws ApiException{
        CancelVerifyRequestType cancelVerifyRequestType = new CancelVerifyRequestType();

        cancelVerifyRequestType.setLocale("zh-CN");
        cancelVerifyRequestType.setOrderId(1129270123876386L);
        //获取Response,JsonObject格式
        JsonObject jsonObject = orderClient.cancelVerifyJsonObject(cancelVerifyRequestType,"228bcc051868424a99ea925091dcbdf4");
        //获取Response,API dto格式
        CancelVerifyResponseType cancelVerifyResponseType = orderClient.cancelVerify(cancelVerifyRequestType, "228bcc051868424a99ea925091dcbdf4");
        System.out.println(jsonObject);
        System.out.println(GsonUtil.toJson(cancelVerifyResponseType));
    }


}
