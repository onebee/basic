package com.one.hex;

import java.util.UUID;

public class Test {

    public static void main(String[] args) {


       String hex = "88770D53E80FBA05323200313232350F";
        System.out.println(hex.length());

        String format = String.format("feiersmart-app://opennative?from=%s&openPage=%s&uid=%s&deviceId=%s&deviceName=%s&ssid=%s&pwd=%s&key=%s",

                "KohlerSmartMC", "type", "uid", "deviceId", null, null, null, UUID.randomUUID());

        System.out.println(format);
    }
}
