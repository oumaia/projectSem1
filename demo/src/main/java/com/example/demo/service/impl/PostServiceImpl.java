package com.example.demo.service.impl;

import com.example.demo.dao.IPostRepository;
import com.example.demo.models.Post;
import com.example.demo.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PostServiceImpl implements IPostService {
    @Autowired
    private IPostRepository postRepository;
    @Override
    public Post create(Post entity) {
        return postRepository.save(entity);
    }

    @Override
    public Post update(Post entity) {
        return postRepository.save(entity);
    }

    @Override
    public void delete(Long id) {
        postRepository.deleteById(id);

    }

    @Override
    public Optional<Post> findOne(Long id) {
        return postRepository.findById(id);
    }

    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }
}
