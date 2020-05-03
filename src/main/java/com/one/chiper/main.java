/**
 * @author DEZHI.YU@HAND-CHINA.COM 2020/03/12 19:07
 */

package com.one.chiper;

public class main {

    public static void main(String[] args) {
        String encrypt = EncryptionUtils.RSA.encrypt("Admin@123","MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAJL0JkqsUoK6kt3JyogsgqNp9VDGDp+t3ZAGMbVoMPdHNT2nfiIVh9ZMNHF7g2XiAa8O8AQWyh2PjMR0NiUSVQMCAwEAAQ==");
        System.out.println(encrypt);
    }

}
