package com.one.day27.reflect;

import java.lang.reflect.Field;

public class Tool {

    /***
     * 此方法可将obj 对象中名为propertyName 的属性的值设置为value
     * @param obj
     * @param propertyName
     * @param value
     */
    public static void setProperty(Object obj, String propertyName, Object value) throws NoSuchFieldException, IllegalAccessException {

        Class clazz = obj.getClass();
        // 暴力反射 获取字段
        Field field = clazz.getDeclaredField(propertyName);
        field.setAccessible(true);

        field.set(obj,value);

    }
}
