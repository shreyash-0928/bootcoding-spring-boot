package com.couponsystem.utils;

import java.util.Random;

public class CouponCategory {
    public static String category()
    {
        Random random= new Random();
        String categories[]={
                "Brand",
                "Product",
                "Category",
                "Outlet",
                "Online",
                "In-store",
                "New customer",
                "Returning customer",
                "VIP",
                "Other"};
        int index= random.nextInt( categories.length);
        return  categories[index];
    }
}
//        Brand: This category of coupon can be used for a specific brand or store. For example, a coupon for 20% off of all purchases at Nike would be considered a brand coupon.
//        Product: This category of coupon can be used for a specific product or service. For example, a coupon for 10% off of all Apple products would be considered a product coupon.
//        Category: This category of coupon can be used for a specific category of products or services. For example, a coupon for 25% off of all clothing would be considered a category coupon.
//        Outlet: This category of coupon can be used for an outlet store. For example, a coupon for 50% off of all clearance items at an outlet store would be considered an outlet coupon.
//        Online: This category of coupon can be used for online purchases. For example, a coupon for 15% off of all purchases made through a merchant's website would be considered an online coupon.
//        In-store: This category of coupon can be used for in-store purchases. For example, a coupon for $10 off of any purchase made in a merchant's store would be considered an in-store coupon.
//        New customer: This category of coupon can be used by new customers only. For example, a coupon for 20% off of your first purchase would be considered a new customer coupon.
//        Returning customer: This category of coupon can be used by returning customers only. For example, a coupon for 10% off of your next purchase would be considered a returning customer coupon.
//        VIP: This category of coupon can be used by VIP customers only. For example, a coupon for 25% off of all purchases would be considered a VIP coupon.
//        Other: This category of coupon can be used for any other type of coupon that does not fit into one of the other categories. For example, a coupon for a free gift with purchase would be considered an "other" coupon.