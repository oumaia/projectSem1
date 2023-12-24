package com.example.demo.controller;

import com.example.demo.models.Post;
import com.example.demo.models.User;
import com.example.demo.service.IPostService;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    private IPostService postService;
    @PostMapping
    public Post create(@RequestBody Post post ){

        return postService.create(post);}
}
