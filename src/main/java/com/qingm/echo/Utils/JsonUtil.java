package com.qingm.echo.Utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.JSONLibDataFormatSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;

import java.util.List;
import java.util.Map;

public class JsonUtil {

    private static final SerializeConfig config;

    static {
        config = new SerializeConfig();
        config.put(java.util.Date.class, new JSONLibDataFormatSerializer()); // 使用和json-lib兼容的日期输出格式
        config.put(java.sql.Date.class, new JSONLibDataFormatSerializer()); // 使用和json-lib兼容的日期输出格式
    }

    public static String toJson(Object object) {
        return JSON.toJSONString(object, config);
    }

    /**
     * 将map转化为string
     * @param m
     * @return
     */
    public static String toJson(Map m) {
        return JSONObject.toJSONString(m);
    }

    public static Object toObject(String text) {
        return JSON.parse(text);
    }

    public static <T> T toObject(String text, Class<T> clazz) {
        return JSON.parseObject(text, clazz);
    }

    // 转换为数组
    public static <T> Object[] toArray(String text) {
        return toArray(text, null);
    }

    // 转换为数组
    public static <T> Object[] toArray(String text, Class<T> clazz) {
        return JSON.parseArray(text, clazz).toArray();
    }

    // 转换为List
    public static <T> List<T> toList(String text, Class<T> clazz) {
        return JSON.parseArray(text, clazz);
    }


    /**
     * json字符串转化为map
     * @param s
     * @return
     */
    public static Map toMap(String s) {
        return JSONObject.parseObject(s);
    }

}
