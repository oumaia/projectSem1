package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.modelMapper.UserMapper;
import com.example.demo.models.User;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private IUserService userService;

    @PostMapping
    public User create(@RequestBody User user ){

        return userService.create(user);
    }
    @PutMapping
    public User update(@RequestBody User user ){

        return userService.update(user);}

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable Long id ){
        userService.delete(id);
    }

    @GetMapping(path = "/{id}")
    public Optional<User> findOne(@PathVariable Long id ){

        return userService.findOne(id);}

    @GetMapping()
    public List<UserDto> findAll(){

       List<User> userList= userService.findAll() ;
       List<UserDto> userDtoList =new ArrayList<>();
       userList.forEach(user -> {
           userDtoList.add(userMapper.mapToDto(user));
       });
        return userDtoList;}


    @GetMapping(path = "/get-by-role")
    public List<User> findByRole(@RequestParam String role ){

        return userService.findByRole(role);}
}
