package com.couponsystem.service;

import com.couponsystem.model.Coupon;
import com.couponsystem.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
public class CouponService {

    // To Write Business Logic
    @Autowired
    private CouponHelper couponHelper;

    public CouponService(CouponHelper couponHelper){
        this.couponHelper = couponHelper;
    }

    public String newCoupon(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
    public List<String> getNewCoupon(int quantity){
        List<String> coupons = new ArrayList<>();
        for(int i = 0; i < quantity; i++){
            String newCoupon = newCoupon();
            coupons.add(newCoupon);
        }
        return coupons;

    }

    public Coupon generateNewCoupon() {
        Coupon coupon = Coupon.builder()
                .id(UUID.randomUUID().toString())
                .validFor(5 + new Random().nextInt(90))
                .type("COUPON")
                .build();
        return coupon;
    }

    public boolean save(User user) {
        users.add(user);
        return true;
    }

    public boolean save(List<User> users) {
        for(User u: users){
            save(u);
        }
        return true;
    }

    private List<User> users = new ArrayList<>();

    public User getUser(int id) {
        for(User u: users){
            if(id == u.getId()){
                return u;
            }
        }
        return null;
    }

    public List<User> getUsers() {
        return users;
    }
    // Search an element in array
}