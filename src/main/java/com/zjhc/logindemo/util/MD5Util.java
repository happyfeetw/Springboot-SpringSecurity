package com.zjhc.logindemo.util;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5加密工具
 *
 */
public class MD5Util {

    private static final String SALT = "tamboo";

    public static String encode(String password) {
        StringBuilder sb = new StringBuilder();
        MessageDigest SHA;
        try {
            SHA = MessageDigest.getInstance("SHA-1");
            SHA.update(password.getBytes());
            for (byte b : SHA.digest()) {
                sb.append(String.format("%02X", b)); // 10进制转16进制，X 表示以十六进制形式输出，02 表示不足两位前面补0输出
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
}