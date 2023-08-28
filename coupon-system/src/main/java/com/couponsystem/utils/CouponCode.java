package com.couponsystem.utils;

import java.util.Random;

public class CouponCode {
    private static final String CHARS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String generateCoupon() {
        Random random = new Random();
        char[] chars = new char[10];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = CHARS.charAt(random.nextInt(CHARS.length()));
        }
        return new String(chars);
    }

//    public static void main(String[] args) {
//        CouponGenerator generator = new CouponGenerator();
//        String couponCode = generator.generateCoupon();
//        System.out.println(couponCode); // This will print a random coupon code
//
//    }
}