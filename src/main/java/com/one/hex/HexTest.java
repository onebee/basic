package com.one.hex;
import java.util.zip.CRC32;

public class HexTest {
    public static void main(String[] args) {

        CRC32 crc32 = new CRC32();
        crc32.update("这是一个crc32校验的Sample".getBytes());
        long value = crc32.getValue();
        System.out.println(value);
        // 将计算得到的值 转换成 hex 格式
        String hex = ByteUtil.decimal2fitHex(value);
        System.out.println("hex : " + hex);

    }


}
