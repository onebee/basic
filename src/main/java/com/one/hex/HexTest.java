package com.one.hex;

import com.google.gson.Gson;

import java.util.List;

public class HexTest {
    public static void main(String[] args) {

//        CRC32 crc32 = new CRC32();
//        crc32.update("这是一个crc32校验的Sample".getBytes());
//        long value = crc32.getValue();
//        System.out.println(value);
//        // 将计算得到的值 转换成 hex 格式
//        String hex = ByteUtil.decimal2fitHex(value);
//        System.out.println("hex : " + hex);

//        String hex1 = "8855004c01e80f7b226b31223a226331222c226b32223a2277696669636f6e666967222c2273736964223a225869616f6d695f37423131222c2270736b223a224b6f686c657231323334227d0fd5d040";
//        String hex = "8855001284E80F7B226B31223A227332227D5D31E59C";
//
//        System.out.println(hex1.getBytes().length);
//
//

        String data = "0601e80f2a01";
//          String data = "0601E80F2A0A";
        int xor = getXOR(ByteUtil.hexStr2bytes(data));
        System.out.println(ByteUtil.decimal2fitHex(xor));

//        String hex =  "88 55 00 46 18 E8 0F 7B226B31223A227332222C226B32223A2257616B6575 70496E";
//        String wifiConfig =  "8855 0011 01 E8 0F 7B226B3122 3A2231227D 29 D9 7F 3F";
//        String readDeviceID ="8855 0038 B4 E8 0F 7B226B3122 3A22733222 2C226B3222 3A22646576 69 63 65 69 64";
////        String readDeviceID3 ="8855004625E80F7B226B31223A227332222C226B32223A2257616B657570496E666F222C22776F7264223A226E693368616F336B65316C6534222C227573726964223A22227D15DCEF2C";
//        String readDeviceID4 ="8855008C35E80F7B226B31223A226332222C226B32223A225265636F6E67697A65496E666F222C2276616C7565223A227B5C224170705C223A5C2243616D6572615C222C5C22416374696F6E5C223A5C2241646A757374466F6375735C222C5C22636F6D6D616E6456616C75655C223A5B7B5C2256616C75655C223A5C225A4F4F4D5F494E5C227D5D7D227D982B6D86";
////        String readDeviceID4 ="88550046F3E80F7B226B31223A227332222C226B32223A2257616B657570496E666F222C22776F7264223A226E693368616F336B65316C6534222C227573726964223A22227DB293FDB3";
//
//        System.out.println(readDeviceID4.length());
//        String string = parseHex2String(readDeviceID4.trim());
//        System.out.println(string);
//        Gson gson = new Gson();
//        Voice voice = gson.fromJson(string, Voice.class);
//
//        String value = voice.value;
//
//        ValueBean valueBean = gson.fromJson(value, ValueBean.class);
//        String action = valueBean.Action;
//        String app = valueBean.App;
//
//        System.out.println(action);
//        System.out.println(app);
//        List<ValueBean.CommandValueBean> commandValue = valueBean.commandValue;
//
//        for (int i = 0; i < commandValue.size(); i++) {
//            ValueBean.CommandValueBean commandValueBean = commandValue.get(i);
//            System.out.println(commandValueBean.toString());
//        }
    }

    private static String parseHex2String(String hex) {

        byte[] bytes = ByteUtil.hexStr2bytes(hex);

//        int length = bytes[2] << 8;
//        length += bytes[3];
        String substring = hex.substring(4, 8);
        int length = Integer.parseInt(substring,16);

        //取出数据段的数据
        int dataLength = length - 7;

        byte[] date = new byte[dataLength];
        System.arraycopy(bytes, 7, date, 0, dataLength);


        // 拿到数据
        return new String(date);

    }


    private static int getXOR(byte[] datas) {

        // 此处首位取1是因为本协议中第一个数据不参数异或校验，转为int防止结果出现溢出变成负数
        int temp = datas[1];

        for (int i = 2; i < datas.length; i++) {
            int preTemp = temp;
            int iData;
            if (datas[i] < 0) {
                // 变为正数计算
                iData = datas[i] & 0xff;
            } else {
                iData = datas[i];
            }

            // 变为正数
            if (temp < 0) {
                temp = temp & 0xff;
            }
            temp ^= iData;

            System.out.println(preTemp + "异或" + iData + "=" + temp);
        }

        return temp;
    }


}
