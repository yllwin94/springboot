package com.example.demo.utils;

import java.lang.reflect.Field;

public class CommonMethod {

    /**
     * 判断元素是否为空
     *
     * @param obj
     * @return
     */
    public static boolean elementIsNull(Object obj) {
        String str = new String();
        if (obj == null) {
            return true;
        } else {
            str = ((String) obj).replaceAll(" ", "");
            if (str == "") {
                return true;
            }
        }
        return false;
    }

    /**
     * 多参数循环判断是否为空值或空字符串
     * @param objects
     * @return
     */
    public static boolean elementsIsNull(Object... objects){
        for (Object obj : objects) {
            if (elementIsNull(obj)) return true;
        }
        return false;
    }

    /**
     * 在控制台打印该实体类所有属性对应的数据
     * Java反射（Reflection）
     * 1.获取所有属性getDeclaredFields
     * 2.获取所有的方法getDeclaredMethods
     */
    public static void printObjectProperties(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field: fields) {
            field.setAccessible(true);
            Object value = field.get(obj);
            System.out.println(field.getName() + "=" + value);
        }
    }

}
