package com.one.hex;

public class HexTest {
    public static void main(String[] args) {

//        CRC32 crc32 = new CRC32();
//        crc32.update("����һ��crc32У���Sample".getBytes());
//        long value = crc32.getValue();
//        System.out.println(value);
//        // ������õ���ֵ ת���� hex ��ʽ
//        String hex = ByteUtil.decimal2fitHex(value);
//        System.out.println("hex : " + hex);

        String hex = "8855004c01e80f7b226b31223a226331222c226b32223a2277696669636f6e666967222c2273736964223a225869616f6d695f37423131222c2270736b223a224b6f686c657231323334227d0fd5d040";

        String string = parseHex2String(hex);
        System.out.println(string);


    }

    private static String parseHex2String(String hex) {

        byte[] bytes = ByteUtil.hexStr2bytes(hex);

        int length = bytes[2]<<8;
        length += bytes[3];

        //ȡ�����ݶε�����
        int dataLength = length -7;

        byte[] date = new byte[dataLength];
        System.arraycopy(bytes, 7, date, 0, dataLength);

        // �õ�����
        return new String(date);

    }


}
