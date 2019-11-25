package com.syh.utils;

import java.math.BigInteger;
import java.security.MessageDigest;

public class MD5 {
    public static final String KEY_MD5 = "MD5";   

    public static  String  encode(String inputStr) {
        BigInteger bigInteger=null;
        try {
         MessageDigest md = MessageDigest.getInstance(KEY_MD5);   
         byte[] inputData = inputStr.getBytes(); 
         md.update(inputData);   
         bigInteger = new BigInteger(md.digest());   
        } catch (Exception e) {e.printStackTrace();}
        return bigInteger.toString(16);
    }

    public static void main(String args[]){
        try {
             String inputStr = "zhangsan";   
             encode(inputStr);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

