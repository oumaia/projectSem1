package com.example.demo.service;


import com.example.demo.models.User;

import java.util.List;

public interface IUserService extends IGenericService<User>{
    public List<User> findByRole(String role);

}
