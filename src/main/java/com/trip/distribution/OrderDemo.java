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
//        demo.bookingRequiredInfo();
//        demo.bookingVerify();
        demo.book8();


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
        //出行人1填写信息
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
        questionAnswer_P_PASSPORT.setQuestionCode("P_PASSPORT");//护照
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

    //4.3创建订单demo7 附加信息各种类型传参示例
    public void book7() throws ApiException{
        BookRequestType bookRequestType = new BookRequestType();

        //站点、币种
        bookRequestType.setLocale("zh-CN");
        bookRequestType.setCurrency("CNY");
        bookRequestType.setDistributorOrderID("test1-1234119915");//分销商订单id
        //产品、套餐、资源
        BasicOrder basicOrder= new BasicOrder();

        List<OrderResource> orderResourceList = new ArrayList<>();
        OrderResource orderResource = new OrderResource();
        orderResource.setResourceID(76397579L);
        orderResource.setUseDate("2025-09-29");
        orderResource.setQuantity(1);
        orderResource.setPrice(new BigDecimal("5.06"));
        orderResourceList.add(orderResource);

        basicOrder.setOrderResourceList(orderResourceList);
        basicOrder.setProductID(76397577L);
        basicOrder.setPackageID(76397578L);
        basicOrder.setAmount(new BigDecimal("5.06"));
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
        //出行人1填写信息
        List<QuestionAnswer> questionAnswerList = new ArrayList<>();//出行人1填写信息List
        QuestionAnswer questionAnswer_CName = new QuestionAnswer();//姓名
        questionAnswer_CName.setQuestionID(3L);
        questionAnswer_CName.setQuestionCode("P_CNAME");//中文名
        questionAnswer_CName.setAnswerList(Arrays.asList("张三"));
        questionAnswerList.add(questionAnswer_CName);

        QuestionAnswer questionAnswer_P_ID_CARD = new QuestionAnswer();//身份证
        questionAnswer_P_ID_CARD.setQuestionID(13L);
        questionAnswer_P_ID_CARD.setQuestionCode("P_ID_CARD");//身份证
        questionAnswer_P_ID_CARD.setAnswerList(Arrays.asList("3403BvTF413ZJiC937"));
        questionAnswerList.add(questionAnswer_P_ID_CARD);

        //以下是各类附加信息传参示例
        //1.EUMN
        QuestionAnswer questionAnswer_A_MEETING_POINT = new QuestionAnswer();
        questionAnswer_A_MEETING_POINT.setQuestionID(5L);
        questionAnswer_A_MEETING_POINT.setQuestionCode("A_MEETING_POINT");
        questionAnswer_A_MEETING_POINT.setAnswerList(Arrays.asList("170375087"));
        questionAnswerList.add(questionAnswer_A_MEETING_POINT);
        //2.TIME
        QuestionAnswer questionAnswer_A_CUSTOMIZED_TIME = new QuestionAnswer();
        questionAnswer_A_CUSTOMIZED_TIME.setQuestionID(16L);
        questionAnswer_A_CUSTOMIZED_TIME.setQuestionCode("A_CUSTOMIZED");
        questionAnswer_A_CUSTOMIZED_TIME.setAnswerList(Arrays.asList("22:03"));
        questionAnswerList.add(questionAnswer_A_CUSTOMIZED_TIME);
        //3.Number
        QuestionAnswer questionAnswer_A_CUSTOMIZED_Number = new QuestionAnswer();
        questionAnswer_A_CUSTOMIZED_Number.setQuestionID(71L);
        questionAnswer_A_CUSTOMIZED_Number.setQuestionCode("A_CUSTOMIZED");
        questionAnswer_A_CUSTOMIZED_Number.setAnswerList(Arrays.asList("5"));
        questionAnswerList.add(questionAnswer_A_CUSTOMIZED_Number);
        //4.Text
        QuestionAnswer questionAnswer_A_CUSTOMIZED_TEXT = new QuestionAnswer();
        questionAnswer_A_CUSTOMIZED_TEXT.setQuestionID(100L);
        questionAnswer_A_CUSTOMIZED_TEXT.setQuestionCode("A_CUSTOMIZED");
        questionAnswer_A_CUSTOMIZED_TEXT.setAnswerList(Arrays.asList("qr0000"));
        questionAnswerList.add(questionAnswer_A_CUSTOMIZED_TEXT);
        //5.DATETIME
        QuestionAnswer questionAnswer_A_CUSTOMIZED_DATE = new QuestionAnswer();
        questionAnswer_A_CUSTOMIZED_DATE.setQuestionID(131L);
        questionAnswer_A_CUSTOMIZED_DATE.setQuestionCode("A_CUSTOMIZED");
        questionAnswer_A_CUSTOMIZED_DATE.setAnswerList(Arrays.asList("2022-09-08 21:43:32"));
        questionAnswerList.add(questionAnswer_A_CUSTOMIZED_DATE);

        passenger.setPackageID(76397578L);
        passenger.setResourceId(76397579L);
        passenger.setQuestionAnswerList(questionAnswerList);
        passengerList.add(passenger);
        bookRequestType.setPassengerList(passengerList);

        //获取Response,JsonObject格式
//        JsonObject jsonObject = orderClient.bookJsonObject(bookRequestType,"a0fc8c6cf3524a31814f700490071f91");
        //获取Response,API dto格式
        BookResponseType bookResponseType = orderClient.book(bookRequestType, "a0fc8c6cf3524a31814f700490071f91");
//        System.out.println(jsonObject);
        System.out.println(GsonUtil.toJson(bookResponseType));
    }

    //4.3创建订单demo8 出行人模板全部配置传参示例
    public void book8() throws ApiException{
        BookRequestType bookRequestType = new BookRequestType();

        //站点、币种
        bookRequestType.setLocale("zh-CN");
        bookRequestType.setCurrency("CNY");
        bookRequestType.setDistributorOrderID("test1-12399421219772915");//分销商订单id
        //产品、套餐、资源
        BasicOrder basicOrder= new BasicOrder();

        List<OrderResource> orderResourceList = new ArrayList<>();
        OrderResource orderResource = new OrderResource();
        orderResource.setResourceID(76527627L);
        orderResource.setUseDate("2025-09-29");
        orderResource.setQuantity(1);
        orderResource.setPrice(new BigDecimal("60.45"));
        orderResourceList.add(orderResource);

        basicOrder.setOrderResourceList(orderResourceList);
        basicOrder.setProductID(76527623L);
        basicOrder.setPackageID(76527624L);
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
        //出行人1填写信息
        List<QuestionAnswer> questionAnswerList = new ArrayList<>();//出行人1填写信息List
        QuestionAnswer questionAnswer_CName = new QuestionAnswer();//姓名
        questionAnswer_CName.setQuestionID(3L);
        questionAnswer_CName.setQuestionCode("P_CNAME");//中文名
        questionAnswer_CName.setAnswerList(Arrays.asList("张三"));
        questionAnswerList.add(questionAnswer_CName);

        QuestionAnswer questionAnswer_P_COUNTRY_OR_DISTRICT = new QuestionAnswer();//国家或地区
        questionAnswer_P_COUNTRY_OR_DISTRICT.setQuestionID(4L);
        questionAnswer_P_COUNTRY_OR_DISTRICT.setQuestionCode("P_COUNTRY_OR_DISTRICT");//国家或地区
        questionAnswer_P_COUNTRY_OR_DISTRICT.setAnswerList(Arrays.asList("CN"));//中国
        questionAnswerList.add(questionAnswer_P_COUNTRY_OR_DISTRICT);

        QuestionAnswer questionAnswer_P_GENDER = new QuestionAnswer();//性别
        questionAnswer_P_GENDER.setQuestionID(6L);
        questionAnswer_P_GENDER.setQuestionCode("P_GENDER");//身份证
        questionAnswer_P_GENDER.setAnswerList(Arrays.asList("M"));//女F, 男M
        questionAnswerList.add(questionAnswer_P_GENDER);

        QuestionAnswer questionAnswer_P_BIRTHDAY = new QuestionAnswer();//生日
        questionAnswer_P_BIRTHDAY.setQuestionID(8L);
        questionAnswer_P_BIRTHDAY.setQuestionCode("P_BIRTHDAY");//生日
        questionAnswer_P_BIRTHDAY.setAnswerList(Arrays.asList("2019-09-04"));
        questionAnswerList.add(questionAnswer_P_BIRTHDAY);

        QuestionAnswer questionAnswer_P_TELPHONE = new QuestionAnswer();//电话号码
        questionAnswer_P_TELPHONE.setQuestionID(11L);
        questionAnswer_P_TELPHONE.setQuestionCode("P_TELPHONE");//电话号码
        questionAnswer_P_TELPHONE.setAnswerList(Arrays.asList("18226998090"));
        questionAnswerList.add(questionAnswer_P_TELPHONE);

        QuestionAnswer questionAnswer_P_TELPHONE_AREA_CODE = new QuestionAnswer();//电话号码区号
        questionAnswer_P_TELPHONE_AREA_CODE.setQuestionID(11L);
        questionAnswer_P_TELPHONE_AREA_CODE.setQuestionCode("P_TELPHONE_AREA_CODE");//电话号码区号
        questionAnswer_P_TELPHONE_AREA_CODE.setAnswerList(Arrays.asList("86"));
        questionAnswerList.add(questionAnswer_P_TELPHONE_AREA_CODE);

        QuestionAnswer questionAnswer_P_VALIDITY = new QuestionAnswer();//证件有效期
        questionAnswer_P_VALIDITY.setQuestionID(10L);
        questionAnswer_P_VALIDITY.setQuestionCode("P_VALIDITY");//证件有效期
        questionAnswer_P_VALIDITY.setAnswerList(Arrays.asList("2029-09-30"));
        questionAnswerList.add(questionAnswer_P_VALIDITY);

        QuestionAnswer questionAnswer_P_ISSUEDATE = new QuestionAnswer();//证件签发日期
        questionAnswer_P_ISSUEDATE.setQuestionID(500L);
        questionAnswer_P_ISSUEDATE.setQuestionCode("P_ISSUEDATE");//证件签发日期
        questionAnswer_P_ISSUEDATE.setAnswerList(Arrays.asList("2026-09-30"));
        questionAnswerList.add(questionAnswer_P_ISSUEDATE);

        QuestionAnswer questionAnswer_P_TAIWANESE_COMPATRIOTS_TIME = new QuestionAnswer();//签发次数
        questionAnswer_P_TAIWANESE_COMPATRIOTS_TIME.setQuestionID(600L);
        questionAnswer_P_TAIWANESE_COMPATRIOTS_TIME.setQuestionCode("P_TAIWANESE_COMPATRIOTS_TIME");//签发次数
        questionAnswer_P_TAIWANESE_COMPATRIOTS_TIME.setAnswerList(Arrays.asList("2"));
        questionAnswerList.add(questionAnswer_P_TAIWANESE_COMPATRIOTS_TIME);

        QuestionAnswer questionAnswer_P_ID_CARD = new QuestionAnswer();//身份证
        questionAnswer_P_ID_CARD.setQuestionID(13L);
        questionAnswer_P_ID_CARD.setQuestionCode("P_ID_CARD");//身份证
        questionAnswer_P_ID_CARD.setAnswerList(Arrays.asList("3403BvTF413ZJiC937"));
        questionAnswerList.add(questionAnswer_P_ID_CARD);

        QuestionAnswer questionAnswer_P_PASSPORT = new QuestionAnswer();//护照
        questionAnswer_P_PASSPORT.setQuestionID(14L);
        questionAnswer_P_PASSPORT.setQuestionCode("P_PASSPORT");//护照
        questionAnswer_P_PASSPORT.setAnswerList(Arrays.asList("146428737"));
        questionAnswerList.add(questionAnswer_P_PASSPORT);

        QuestionAnswer questionAnswer_P_HONGKONG_MACAO_PASS = new QuestionAnswer();//港澳通行证
        questionAnswer_P_HONGKONG_MACAO_PASS.setQuestionID(20L);
        questionAnswer_P_HONGKONG_MACAO_PASS.setQuestionCode("P_HONGKONG_MACAO_PASS");//港澳通行证
        questionAnswer_P_HONGKONG_MACAO_PASS.setAnswerList(Arrays.asList("C12345678"));
        questionAnswerList.add(questionAnswer_P_HONGKONG_MACAO_PASS);

        QuestionAnswer questionAnswer_P_TAIWAN_PASS = new QuestionAnswer();//台湾通行证
        questionAnswer_P_TAIWAN_PASS.setQuestionID(20L);
        questionAnswer_P_TAIWAN_PASS.setQuestionCode("P_TAIWAN_PASS");//台湾通行证
        questionAnswer_P_TAIWAN_PASS.setAnswerList(Arrays.asList("W12345678"));
        questionAnswerList.add(questionAnswer_P_TAIWAN_PASS);

        QuestionAnswer questionAnswer_P_DRIVING_LICENSE = new QuestionAnswer();//驾驶证
        questionAnswer_P_DRIVING_LICENSE.setQuestionID(17L);
        questionAnswer_P_DRIVING_LICENSE.setQuestionCode("P_DRIVING_LICENSE");//驾驶证
        questionAnswer_P_DRIVING_LICENSE.setAnswerList(Arrays.asList("11010519800101201X"));
        questionAnswerList.add(questionAnswer_P_DRIVING_LICENSE);

        QuestionAnswer questionAnswer_P_TAIWANESE_COMPATRIOTS = new QuestionAnswer();//台胞证
        questionAnswer_P_TAIWANESE_COMPATRIOTS.setQuestionID(19L);
        questionAnswer_P_TAIWANESE_COMPATRIOTS.setQuestionCode("P_TAIWANESE_COMPATRIOTS");//台胞证
        questionAnswer_P_TAIWANESE_COMPATRIOTS.setAnswerList(Arrays.asList("12345678"));
        questionAnswerList.add(questionAnswer_P_TAIWANESE_COMPATRIOTS);

        QuestionAnswer questionAnswer_P_HOME_VISITING_CERTIFICATE = new QuestionAnswer();//回乡证
        questionAnswer_P_HOME_VISITING_CERTIFICATE.setQuestionID(18L);
        questionAnswer_P_HOME_VISITING_CERTIFICATE.setQuestionCode("P_HOME_VISITING_CERTIFICATE");//回乡证
        questionAnswer_P_HOME_VISITING_CERTIFICATE.setAnswerList(Arrays.asList("H12345678"));
        questionAnswerList.add(questionAnswer_P_HOME_VISITING_CERTIFICATE);

        QuestionAnswer questionAnswer_P_MILITARY_ID = new QuestionAnswer();//军官证
        questionAnswer_P_MILITARY_ID.setQuestionID(16L);
        questionAnswer_P_MILITARY_ID.setQuestionCode("P_MILITARY_ID");//军官证
        questionAnswer_P_MILITARY_ID.setAnswerList(Arrays.asList(""));
        questionAnswerList.add(questionAnswer_P_MILITARY_ID);

        QuestionAnswer questionAnswer_P_STUDENT_CARD = new QuestionAnswer();//学生证
        questionAnswer_P_STUDENT_CARD.setQuestionID(15L);
        questionAnswer_P_STUDENT_CARD.setQuestionCode("P_STUDENT_CARD");//学生证
        questionAnswer_P_STUDENT_CARD.setAnswerList(Arrays.asList("202305120315"));
        questionAnswerList.add(questionAnswer_P_STUDENT_CARD);

        QuestionAnswer questionAnswer_P_HONGKONG_MACAU_TAIWAN_RESIDENT_IDENTITY_CARD = new QuestionAnswer();//港澳台居民居住证
        questionAnswer_P_HONGKONG_MACAU_TAIWAN_RESIDENT_IDENTITY_CARD.setQuestionID(37L);
        questionAnswer_P_HONGKONG_MACAU_TAIWAN_RESIDENT_IDENTITY_CARD.setQuestionCode("P_HONGKONG_MACAU_TAIWAN_RESIDENT_IDENTITY_CARD");//港澳台居民居住证
        questionAnswer_P_HONGKONG_MACAU_TAIWAN_RESIDENT_IDENTITY_CARD.setAnswerList(Arrays.asList("810000199508126017"));
        questionAnswerList.add(questionAnswer_P_HONGKONG_MACAU_TAIWAN_RESIDENT_IDENTITY_CARD);

        QuestionAnswer questionAnswer_P_THAILAND_WORK_PERMIT = new QuestionAnswer();//泰国工作许可证
        questionAnswer_P_THAILAND_WORK_PERMIT.setQuestionID(38L);
        questionAnswer_P_THAILAND_WORK_PERMIT.setQuestionCode("P_THAILAND_WORK_PERMIT");//泰国工作许可证
        questionAnswer_P_THAILAND_WORK_PERMIT.setAnswerList(Arrays.asList("WP-2567-0012345"));
        questionAnswerList.add(questionAnswer_P_THAILAND_WORK_PERMIT);

        QuestionAnswer questionAnswer_P_INDONESIA_RESIDENCE_VISA = new QuestionAnswer();//印尼居留签证
        questionAnswer_P_INDONESIA_RESIDENCE_VISA.setQuestionID(39L);
        questionAnswer_P_INDONESIA_RESIDENCE_VISA.setQuestionCode("P_INDONESIA_RESIDENCE_VISA");//印尼居留签证
        questionAnswer_P_INDONESIA_RESIDENCE_VISA.setAnswerList(Arrays.asList("KITAS.24.0123456.DXN"));
        questionAnswerList.add(questionAnswer_P_INDONESIA_RESIDENCE_VISA);

        QuestionAnswer questionAnswer_P_INTERNATIONAL_STUDENT_ID_CARD = new QuestionAnswer();//国际学生证
        questionAnswer_P_INTERNATIONAL_STUDENT_ID_CARD.setQuestionID(40L);
        questionAnswer_P_INTERNATIONAL_STUDENT_ID_CARD.setQuestionCode("P_INTERNATIONAL_STUDENT_ID_CARD");//国际学生证
        questionAnswer_P_INTERNATIONAL_STUDENT_ID_CARD.setAnswerList(Arrays.asList("9991234567895"));
        questionAnswerList.add(questionAnswer_P_INTERNATIONAL_STUDENT_ID_CARD);

        QuestionAnswer questionAnswer_P_PERMANENT_RESIDENCE_CARD_FOREIGNERS = new QuestionAnswer();//外国人永久居留身份证
        questionAnswer_P_PERMANENT_RESIDENCE_CARD_FOREIGNERS.setQuestionID(41L);
        questionAnswer_P_PERMANENT_RESIDENCE_CARD_FOREIGNERS.setQuestionCode("P_PERMANENT_RESIDENCE_CARD_FOREIGNERS");//外国人永久居留身份证
        questionAnswer_P_PERMANENT_RESIDENCE_CARD_FOREIGNERS.setAnswerList(Arrays.asList("USA0PY198401011234"));
        questionAnswerList.add(questionAnswer_P_PERMANENT_RESIDENCE_CARD_FOREIGNERS);

        QuestionAnswer questionAnswer_P_TAIWAN_NATIONAL_ID_CARD = new QuestionAnswer();//国民身份证 （台湾）
        questionAnswer_P_TAIWAN_NATIONAL_ID_CARD.setQuestionID(42L);
        questionAnswer_P_TAIWAN_NATIONAL_ID_CARD.setQuestionCode("P_TAIWAN_NATIONAL_ID_CARD");//国民身份证 （台湾）
        questionAnswer_P_TAIWAN_NATIONAL_ID_CARD.setAnswerList(Arrays.asList("A123456789"));
        questionAnswerList.add(questionAnswer_P_TAIWAN_NATIONAL_ID_CARD);

        QuestionAnswer questionAnswer_P_HONGKONG_PERMANENT_IDENTITY_CARD = new QuestionAnswer();//香港永久居民身份证
        questionAnswer_P_HONGKONG_PERMANENT_IDENTITY_CARD.setQuestionID(43L);
        questionAnswer_P_HONGKONG_PERMANENT_IDENTITY_CARD.setQuestionCode("P_HONGKONG_PERMANENT_IDENTITY_CARD");//香港永久居民身份证
        questionAnswer_P_HONGKONG_PERMANENT_IDENTITY_CARD.setAnswerList(Arrays.asList("Y123456(1)"));
        questionAnswerList.add(questionAnswer_P_HONGKONG_PERMANENT_IDENTITY_CARD);

        QuestionAnswer questionAnswer_P_HONGKONG_IDENTITY_CARD = new QuestionAnswer();//香港居民身份证
        questionAnswer_P_HONGKONG_IDENTITY_CARD.setQuestionID(44L);
        questionAnswer_P_HONGKONG_IDENTITY_CARD.setQuestionCode("P_HONGKONG_IDENTITY_CARD");//香港居民身份证
        questionAnswer_P_HONGKONG_IDENTITY_CARD.setAnswerList(Arrays.asList("AB987654(3)"));
        questionAnswerList.add(questionAnswer_P_HONGKONG_IDENTITY_CARD);

        QuestionAnswer questionAnswer_P_MACAU_ERMANENT_RESIDENT_IDENTITY_CARD = new QuestionAnswer();//澳门永久居民身份证
        questionAnswer_P_MACAU_ERMANENT_RESIDENT_IDENTITY_CARD.setQuestionID(45L);
        questionAnswer_P_MACAU_ERMANENT_RESIDENT_IDENTITY_CARD.setQuestionCode("P_MACAU_ERMANENT_RESIDENT_IDENTITY_CARD");//澳门永久居民身份证
        questionAnswer_P_MACAU_ERMANENT_RESIDENT_IDENTITY_CARD.setAnswerList(Arrays.asList("7654321(6)"));
        questionAnswerList.add(questionAnswer_P_MACAU_ERMANENT_RESIDENT_IDENTITY_CARD);

        QuestionAnswer questionAnswer_P_MACAU_RESIDENT_IDENTITY_CARD = new QuestionAnswer();//澳门居民身份证
        questionAnswer_P_MACAU_RESIDENT_IDENTITY_CARD.setQuestionID(46L);
        questionAnswer_P_MACAU_RESIDENT_IDENTITY_CARD.setQuestionCode("P_MACAU_RESIDENT_IDENTITY_CARD");//澳门居民身份证
        questionAnswer_P_MACAU_RESIDENT_IDENTITY_CARD.setAnswerList(Arrays.asList("5123456(8)"));
        questionAnswerList.add(questionAnswer_P_MACAU_RESIDENT_IDENTITY_CARD);

        QuestionAnswer questionAnswer_P_TH_ID_CARD = new QuestionAnswer();//泰国身份证
        questionAnswer_P_TH_ID_CARD.setQuestionID(47L);
        questionAnswer_P_TH_ID_CARD.setQuestionCode("P_TH_ID_CARD");//泰国身份证
        questionAnswer_P_TH_ID_CARD.setAnswerList(Arrays.asList("3103700012851"));
        questionAnswerList.add(questionAnswer_P_TH_ID_CARD);

        QuestionAnswer questionAnswer_P_MY_ID_CARD = new QuestionAnswer();//马来西亚身份证（大马卡）
        questionAnswer_P_MY_ID_CARD.setQuestionID(48L);
        questionAnswer_P_MY_ID_CARD.setQuestionCode("P_TH_ID_CARD");//马来西亚身份证（大马卡）
        questionAnswer_P_MY_ID_CARD.setAnswerList(Arrays.asList("900115100001"));
        questionAnswerList.add(questionAnswer_P_MY_ID_CARD);

        QuestionAnswer questionAnswer_P_ID_ID_CARD = new QuestionAnswer();//印尼身份证
        questionAnswer_P_ID_ID_CARD.setQuestionID(49L);
        questionAnswer_P_ID_ID_CARD.setQuestionCode("P_TH_ID_CARD");//印尼身份证
        questionAnswer_P_ID_ID_CARD.setAnswerList(Arrays.asList("3175035407890001"));
        questionAnswerList.add(questionAnswer_P_ID_ID_CARD);

        passenger.setPackageID(76527624L);
        passenger.setResourceId(76527627L);
        passenger.setQuestionAnswerList(questionAnswerList);
        passengerList.add(passenger);
        bookRequestType.setPassengerList(passengerList);

        //获取Response,JsonObject格式
//        JsonObject jsonObject = orderClient.bookJsonObject(bookRequestType,"a0fc8c6cf3524a31814f700490071f91");
        //获取Response,API dto格式
        BookResponseType bookResponseType = orderClient.book(bookRequestType, "a0fc8c6cf3524a31814f700490071f91");
//        System.out.println(jsonObject);
        System.out.println(GsonUtil.toJson(bookResponseType));
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
