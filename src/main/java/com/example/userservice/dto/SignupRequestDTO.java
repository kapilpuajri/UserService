package com.example.userservice.dto;


import lombok.Data;

@Data
public class SignupRequestDTO {
    private String name;
    private String email;
    private String password;
}

