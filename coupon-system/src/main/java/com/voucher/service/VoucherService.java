package com.voucher.service;

import com.voucher.model.Voucher;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class VoucherService {
    public String voucher(){
        UUID uuid= UUID.randomUUID();
        return uuid.toString(); // any object into string that time we use toString method
    }


    public Voucher generateNewVoucher(){
        Voucher voucher = new Voucher.builder()
                .id(UUID.randomUUID().toString())
                .validFor(5+new Random().nextInt(90))
                .title("Amazon")
                .category("MenWear")
                .discount(10)
                .build();
        return voucher;
    }
}
