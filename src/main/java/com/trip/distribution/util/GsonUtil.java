package com.trip.distribution.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.util.Calendar;
import java.util.List;
import java.util.Map;

public class GsonUtil {

    /**
     * 基于Gson封装工具
     */
    private static Gson gson;

    static {
        gson = new GsonBuilder()
                .serializeNulls() // 对value为null的属性也进行序列化
                .setDateFormat(Constants.DATE_TIME_FORMAT)
                .disableHtmlEscaping()
                //处理时间戳格式的序列化 包括("/Date(-2209017600000+0800)/";"/Date(1756396800000+0800)/")两种类型
                .registerTypeAdapter(Calendar.class, new CustomDateDeserializer())
                .create();
    }

    /**
     * 获取GsonBuilder实例
     *
     * @return
     */
    public static GsonBuilder builder() {
        return new GsonBuilder();
    }

    /**
     * 将对象转为json字符串
     *
     * @param object
     * @return
     */
    public static String toJson(Object object) {
        String json = null;
        if (gson != null) {
            json = gson.toJson(object);
        }
        return json;
    }

    /**
     * 将json字符串转为指定类型的实例
     *
     * @param json
     * @param cls
     * @param <T>
     * @return
     */
    public static <T> T parse(String json, Class<T> cls) {
        T t = null;
        if (gson != null) {
            t = gson.fromJson(json, cls);
        }
        return t;
    }

    /**
     * 将json转为Map
     *
     * @param json
     * @param <T>
     * @return
     */
    public static <T> Map<String, T> toMap(String json) {
        Map<String, T> map = null;
        if (gson != null) {
            map = gson.fromJson(json, new TypeToken<Map<String, T>>() {
            }.getType());
        }
        return map;
    }

    /**
     * 将json转为指定类型的List
     *
     * @param json
     * @param <T>
     * @return
     */
    public static <T> List<T> toList(String json, List<T> list) {
        if (gson != null) {
            // 根据泛型返回解析指定的类型,TypeToken<List<T>>{}.getType()获取返回类型
            list = gson.fromJson(json, new TypeToken<List<T>>() {
            }.getType());
        }
        return list;
    }

    /**
     * 将json转为Map List
     *
     * @param json
     * @param <T>
     * @return
     */
    public static <T> List<Map<String, T>> toMapList(String json) {
        List<Map<String, T>> list = null;
        if (gson != null) {
            list = gson.fromJson(json,
                    new TypeToken<List<Map<String, T>>>() {
                    }.getType());
        }
        return list;
    }

}
