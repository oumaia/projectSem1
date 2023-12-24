package com.example.demo.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class PostDto {
    private String title;
    private  String content;
    private String image_url;


}
