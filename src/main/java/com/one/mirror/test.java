package com.one.mirror;


import java.nio.charset.StandardCharsets;

public class test {

    public static void main(String[] args) {

        String s = "FF";

        String s1 = str2HexString(s);
        System.out.println(s1);
        System.out.println(Short.valueOf(s1));

        System.out.println("----------------------");


        short decimal = (short) hexStr2decimal(s);

        System.out.println("decimal " + decimal);



    }

    public static String str2HexString(String str) {
        char[] chars = "0123456789ABCDEF".toCharArray();
        StringBuilder sb = new StringBuilder();
        byte[] bs = null;
        try {

            bs = str.getBytes(StandardCharsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int bit;
        for (int i = 0; i < bs.length; i++) {
            bit = (bs[i] & 0x0f0) >> 4;
            sb.append(chars[bit]);
            bit = bs[i] & 0x0f;
            sb.append(chars[bit]);
        }
        return sb.toString();
    }

    public static long hexStr2decimal(String hex) {
        return Long.parseLong(hex, 16);

    }
}