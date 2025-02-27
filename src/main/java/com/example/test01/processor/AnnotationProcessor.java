package com.example.test01.processor;

import com.alibaba.fastjson.JSONObject;
import com.example.test01.annotation.Description;
import com.example.test01.vo.dtpolicy.RegisterEmployee;
import org.mockito.internal.matchers.Null;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * [模块名] AnnotationProcessor  [功能描述] 注解处理器
 * +----------------------------------------------------------------------
 * | Copyright (c) 可东网络 2025~2025 All rights reserved.
 * +----------------------------------------------------------------------
 * | Licensed 可东网络并不是自由软件，未经许可禁止使用版权
 * +----------------------------------------------------------------------
 *
 * @author ：lily.Yin
 * @since ：2025/2/14 9:48
 */
public class AnnotationProcessor {

    /**
     * 获取注解中的值
     * @param clazz 实体类
     * @return 属性注释
     * @param <T> 泛型（也可以用通配符"？"）
     */
    public static <T> List<String> getDescription(Class<T> clazz) {
        Field[] declaredFields = clazz.getDeclaredFields();
        List<String> list = new ArrayList<>();
        for (Field field : declaredFields) {
            Description description = field.getAnnotation(Description.class);
            String value = "";
            if (description != null) {
                value = description.value();
            }
            list.add(field.getName() + "[" + value + "]");

        }

        return list;
    }

    /**
     * 获取属性信息
     * @param clazz 实体类
     * @return json
     * @param <T> 实体类的泛型
     */
    public static <T> JSONObject getClassJson(Class<T> clazz) {
        Field[] declaredFields = clazz.getDeclaredFields();
        JSONObject jsonObject = new JSONObject();
        for (Field field : declaredFields) {
            Description description = field.getAnnotation(Description.class);
            String value = "";
            if (description != null) {
                value = description.value();
            }
            jsonObject.put(field.getName(), value);
        }
        System.out.println(jsonObject.toString());
        return jsonObject;
    }

    public static void main(String[] args) {
        getClassJson(RegisterEmployee.class);
    }

}
