package com.one.hex;

public class HexTest {
    public static void main(String[] args) {

//        CRC32 crc32 = new CRC32();
//        crc32.update("这是一个crc32校验的Sample".getBytes());
//        long value = crc32.getValue();
//        System.out.println(value);
//        // 将计算得到的值 转换成 hex 格式
//        String hex = ByteUtil.decimal2fitHex(value);
//        System.out.println("hex : " + hex);

//        String hex = "8855004c01e80f7b226b31223a226331222c226b32223a2277696669636f6e666967222c2273736964223a225869616f6d695f37423131222c2270736b223a224b6f686c657231323334227d0fd5d040";
//
//        String string = parseHex2String(hex);
//        System.out.println(string);

        String data = "0601e80f2a09";
        int xor = getXOR(ByteUtil.hexStr2bytes(data));
        System.out.println(xor);


    }

    private static String parseHex2String(String hex) {

        byte[] bytes = ByteUtil.hexStr2bytes(hex);

        int length = bytes[2] << 8;
        length += bytes[3];

        //取出数据段的数据
        int dataLength = length -7;

        byte[] date = new byte[dataLength];
        System.arraycopy(bytes, 7, date, 0, dataLength);

        // 拿到数据
        return new String(date);

    }


    private static int getXOR(byte[] datas) {

        // 姝ゅ棣栦綅鍙?1鏄洜涓烘湰鍗忚涓涓?涓暟鎹笉鍙傛暟寮傛垨鏍￠獙锛岃浆涓篿nt闃叉缁撴灉鍑虹幇婧㈠嚭鍙樻垚璐熸暟
        int temp = datas[1];

        for (int i = 2; i < datas.length; i++) {
            int preTemp = temp;
            int iData;
            if (datas[i] < 0) {
                // 鍙樹负姝ｆ暟璁＄畻
                iData = datas[i] & 0xff;
            } else {
                iData = datas[i];
            }

            // 鍙樹负姝ｆ暟
            if (temp < 0) {
                temp = temp & 0xff;
            }
            temp ^= iData;

            System.out.println(preTemp + "寮傛垨" + iData + "=" + temp);
        }

        return temp;
    }


}
