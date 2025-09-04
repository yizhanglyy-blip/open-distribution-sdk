package com.trip.distribution;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * 回调信息推送demo
 */

public class PushInformationDemo {

    static final String AID = AccountParams.AID;
    static final String SID = AccountParams.SID;
    static final String KEY = AccountParams.KEY;


    public static void main(String[] args) throws Exception {
        PushInformationDemo pushInformationDemo = new PushInformationDemo();
        String signature = pushInformationDemo.HmacSHA1Encrypt("" + AID + SID +
                        "{\"orderid\":\"70072873948\",\"distributororderid\":\"163875233720000000\",\"type\":\"1\",\"orderchangetype\":\"1\"}",
                KEY);
        System.out.println(signature);

    }

    /**
     * 回调加密算法
     * @param encryptText
     * @param encryptKey
     * @return
     * @throws Exception
     */

    public String HmacSHA1Encrypt(String encryptText, String encryptKey) throws Exception {
        byte[] data = encryptKey.getBytes("UTF-8");
        // Construct a key based on the given byte array, and the second parameter specifies the name of a key algorithm.
        SecretKey secretKey = new SecretKeySpec(data, "HmacSHA1");
        // Generate a MAC object for a specified MAC algorithm.
        Mac mac = Mac.getInstance("HmacSHA1");
        // Initialize the Mac object with the given key.
        mac.init(secretKey);

        byte[] text = encryptText.getBytes("UTF-8");
        // Complete Mac operations
        String result = new String(Base64.encodeBase64(mac.doFinal(text)), "UTF-8");
        return result;
    }
}
