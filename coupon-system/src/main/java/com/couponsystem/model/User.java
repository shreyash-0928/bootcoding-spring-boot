package com.couponsystem.model;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String emailId;
    private long phone;

}
