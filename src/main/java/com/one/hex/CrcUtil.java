package com.one.hex;

public class CrcUtil {


    int mc_have_table = 0;
    int mc_table[] = new int[256];

//    public int mc_bit_rev(int poly) {
//        int i;
//        int var = 0;
//        for (i = 0; i < 32; i++) {
//            if (poly & 0x01) {
//                var |= (1 << (31 - i));
//            }
//            poly = poly >> 1;
//        }
//        return var;
//    }
//
//    void mc_make_table( int poly) {
//        int i, j, crc;
//        mc_have_table = 1;
//        poly = mc_bit_rev(poly);
//        for (i = 0; i < 256; i++) {
//            for (j = 0, mc_table[i] = i; j < 8; j++) {
//                mc_table[i] = (mc_table[i] >> 1) ^ ((mc_table[i] & 1) ? poly : 0);
//            }
//        }
//    }


//    int mc_crc32(char[] buff, int buflen) {
//        int i = 0;
//        int crc = 0xFFFFFFFF;
//        if (mc_have_table < 1) {
//            mc_make_table(0x04C11DB7);
//        }
//
//        for (i = 0; i < buflen; i++) {
//            crc = (crc >> 8) ^ mc_table[(crc ^ buff[i]) & 0xff];
//        }
//        return ~crc;
//    }


}
