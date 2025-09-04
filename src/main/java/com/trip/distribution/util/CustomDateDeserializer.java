package com.trip.distribution.util;

import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.Calendar;
import java.util.TimeZone;

public class CustomDateDeserializer implements JsonDeserializer<Calendar> {
    @Override
    public Calendar deserialize(JsonElement json, Type typeOfT, com.google.gson.JsonDeserializationContext context)
            throws JsonParseException {
        String dateStr = json.getAsString();
        // 提取时间戳部分
        String timestampStr = dateStr.replaceAll("/Date\\(([-+]?\\d+)([+-]\\d{4})?\\)/", "$1");
        String timezoneStr = dateStr.replaceAll("/Date\\(\\d+([+-]\\d{4})\\)/", "$1");

        try {
            long timestamp = Long.parseLong(timestampStr);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(timestamp);

            // 设置时区
            TimeZone timeZone = TimeZone.getTimeZone("GMT" + timezoneStr);
            calendar.setTimeZone(timeZone);

            return calendar;
        } catch (NumberFormatException e) {
            throw new JsonParseException("Invalid date format", e);
        }
    }
}
