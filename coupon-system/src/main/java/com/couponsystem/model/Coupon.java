package com.couponsystem.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Table(name = "Coupon_app")
@Entity

// All properties should be private
// Getter and Setters By default public rehte h ------> @Data(Annotation).
public class Coupon {
    @Id
    @GeneratedValue
    private String id;
    @Column(name = "Title")
    private String title;
    @Column(name = "Type")
    private String type;
    @Column(name = "Validity")
    private int validFor;
    @Column(name = "Description")
    private String description;
    @Column(name = "Coupon_Code")
    private String couponCode;
    @Column(name = "Category")
    private String category;
    @Column(name = "Created_date")
    private String createdDate;
    @Column(name = "Active_date")
    private String inActive;

}
