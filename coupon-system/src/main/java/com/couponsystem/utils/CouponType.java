package com.couponsystem.utils;

import java.util.Random;

public class CouponType {
    public static  String type()
    {
        Random random= new Random();
        String couponType[]= {
                "FirstPurchase",
                "SeasonalPromo",
                "EndOfSeason",
                "Percentage off",
                "Flat discount",
                "Buy one, get one free",
                "Free shipping",
                "Gift card",
                "Referral program",
                "Limited-time offer"
        };
        int index= random.nextInt(couponType.length);
        return couponType[index];
    }
}
//        Percentage off: This type of coupon gives the customer a percentage discount on their purchase. For example, a 20% off coupon would give the customer a 20% discount on their purchase.
//        Flat discount: This type of coupon gives the customer a flat discount on their purchase. For example, a $10 off coupon would give the customer a $10 discount on their purchase.
//        Buy one, get one free: This type of coupon gives the customer one item free for every item they purchase. For example, a buy one, get one free coupon for coffee would give the customer two cups of coffee for the price of one.
//        Free shipping: This type of coupon gives the customer free shipping on their purchase. For example, a free shipping coupon would allow the customer to have their purchase shipped to them for free.
//        Rebate: This type of coupon gives the customer a rebate on their purchase. For example, a $10 rebate coupon would give the customer $10 back after they make their purchase.
//        Gift card: This type of coupon gives the customer a gift card that they can use to purchase goods or services from the merchant. For example, a $10 gift card coupon would give the customer a $10 gift card that they can use to purchase goods or services from the merchant.
//        Loyalty program: This type of coupon is given to customers who are members of a loyalty program. Loyalty programs typically reward customers for making purchases with the merchant. For example, a loyalty program might give customers points for every dollar they spend, and those points can be redeemed for coupons or other rewards.
//        Referral program: This type of coupon is given to customers who refer new customers to the merchant. Referral programs typically reward customers for referring new customers who make a purchase. For example, a referral program might give customers a $10 coupon for every new customer they refer who makes a purchase.
//        Limited-time offer: This type of coupon is only available for a limited time. Limited-time offers are often used to promote new products or services, or to clear out inventory.
//        Personalized coupon: This type of coupon is tailored to the specific interests or needs of the customer. Personalized coupons are often used to target customers who have previously made purchases from the merchant.
