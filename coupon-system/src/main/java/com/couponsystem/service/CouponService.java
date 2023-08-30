package com.couponsystem.service;

import com.couponsystem.model.Coupon;
import com.couponsystem.model.User;
import com.couponsystem.repository.CouponRepository;
import com.couponsystem.utils.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CouponService {

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


    @Autowired
    private CouponRepository couponRepository;
    public List<Coupon> generateNewCoupon(int value) {
        List<Coupon>list= new ArrayList<>();
        for (int i = 0; i < value; i++) {
            Coupon coupon = Coupon.builder().title(CouponTitle.generateTitle())
                    .description(CouponDescription.GenerateDescription())
                    .couponCode(CouponCode.generateCoupon())
                    .validDate(ValidityDate.generateDate())
                    .type(CouponType.type())
                    .discount(CouponDiscount.discount())
                    .category(CouponCategory.category())
                    .createBy(CreatedBy.createdBy())
                    .status(CouponStatus.generateStatus())
                    .build();
            list.add(coupon);
        }
        return couponRepository.saveAll(list);
    }
}