package com.example.demo.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class UserDto {
    private Long id;
    private  String username;
    private String role;


}
