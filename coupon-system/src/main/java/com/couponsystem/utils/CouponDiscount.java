package com.couponsystem.utils;

import java.util.Random;

public class CouponDiscount {
    public static double discount()
    {
        Random random= new Random();
        double max=85.40;
        double min=15;
        return random.nextDouble(max-min);
    }
}
