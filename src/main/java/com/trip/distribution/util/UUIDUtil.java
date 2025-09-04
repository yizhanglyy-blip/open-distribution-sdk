package com.trip.distribution.util;

import java.util.UUID;

public class UUIDUtil {

    /**
     * 生成一个随机 UUID
     * @return 随机生成的 UUID 字符串
     */
    public static String generateUUID() {
        return UUID.randomUUID().toString();
    }

    /**
     * 生成一个不带连字符的随机 UUID
     * @return 随机生成的不带连字符的 UUID 字符串
     */
    public static String generateUUIDWithoutHyphens() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static void main(String[] args) {
        // 示例使用
        System.out.println("UUID with hyphens: " + generateUUID());
        System.out.println("UUID without hyphens: " + generateUUIDWithoutHyphens());
    }
}
