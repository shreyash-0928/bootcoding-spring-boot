package com.couponsystem.utils;

import java.util.Random;

public class CouponDescription {
    public static String GenerateDescription()
    {
        Random random= new Random();
        String description[] ={
                "Save 20% on your next purchase!",
                "Get a free gift with your purchase!",
                "Free shipping on all orders over $50!",
                "10% off all clearance items!",
                "25% off your first purchase!",
                "15% off all online orders!",
                "$10 off your next purchase in-store!",
                "20% off all purchases made on your birthday!",
                "10% off all purchases made by students!",
                "50% off all purchases made on Black Friday!"};
        int index= random.nextInt(description.length);
        return description[index];

    }
}
