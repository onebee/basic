package com.one.annotation;

import java.lang.reflect.Method;

public class AnnotationTest {

    @GET(value = "http://ip.12365412.1020012")
    public String getIpMsg() {
        return "";
    }


    @GET(value = "adfsuibjasdbnv djfsnjksad")
    public String getIp() {
        return "";
    }


    void test() {

    }

    public static void main(String[] args) {


        Method[] methods = AnnotationTest.class.getDeclaredMethods();
        for (Method method : methods) {
            GET get = method.getAnnotation(GET.class);
            System.out.println(get.value());
        }
    }

}
