package com.voucher.Controller;

import com.voucher.service.VoucherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getvoucher")
public class VoucherController {
    @Autowired
    VoucherService service;
    @GetMapping
}
