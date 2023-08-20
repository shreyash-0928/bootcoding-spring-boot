package com.couponsystem.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

// All properties should be private
// Getter and Setters By default public rehte h ------> @Data(Annotation).
public class Coupon {
    private String id;
    private String type;
    private int validFor;
}
