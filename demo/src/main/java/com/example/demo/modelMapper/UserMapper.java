package com.example.demo.modelMapper;

import com.example.demo.dto.UserDto;
import com.example.demo.models.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserMapper implements IModelMapper<UserDto, User>{

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public UserDto mapToDto(User user) {
        UserDto userDto=new UserDto();
        userDto =modelMapper.map(user,UserDto.class);
        return userDto;
    }

    @Override
    public User mapFromDto(UserDto object) {
        return null;
    }
}

