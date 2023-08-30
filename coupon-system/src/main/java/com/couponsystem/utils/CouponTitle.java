package com.couponsystem.utils;

import java.util.Random;

public class CouponTitle {
    public static String generateTitle() {
        {
            String generateTitle[] = {"Coupon Code: SAVE15",
                    "Get 20% Off Your Next Purchase",
                    "Free Shipping on Orders Over $50",
                    "10% Off Your Entire Order",
                    "Buy One, Get One Free",
                    "50% Off Sale Items",
                    "25% Off Select Products",
                    "10% Off Your First Order",
                    "Free Gift with Purchase",
                    "10% Off Your Next Order with Email Signup"};
            Random random = new Random();
            int index = random.nextInt(generateTitle.length);
            return generateTitle[index];
        }
    }

    public static void main(String[] args) {
        System.out.println(generateTitle());
    }
}
