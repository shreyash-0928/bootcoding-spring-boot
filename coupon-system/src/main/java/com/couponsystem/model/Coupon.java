package com.couponsystem.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Coupon {
    private String id;
    private String type;
    private int validFor;
}
