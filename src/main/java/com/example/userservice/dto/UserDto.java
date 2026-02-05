package com.example.userservice.dto;

import jakarta.persistence.Column;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDto {

    private String name;

    private String email;

    private String role;
}
