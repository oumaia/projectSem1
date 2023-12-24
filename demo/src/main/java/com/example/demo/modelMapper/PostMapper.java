package com.example.demo.modelMapper;

import com.example.demo.dto.PostDto;
import com.example.demo.dto.UserDto;
import com.example.demo.models.Post;
import com.example.demo.models.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PostMapper implements IModelMapper<PostDto, Post>{
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public PostDto mapToDto(Post post) {
        PostDto postDto=new PostDto();
        postDto =modelMapper.map(post,PostDto.class);
        return postDto;
    }


    @Override
    public Post mapFromDto(PostDto post) {
        return null;
    }
}

