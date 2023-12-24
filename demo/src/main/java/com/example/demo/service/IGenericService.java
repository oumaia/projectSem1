package com.example.demo.service;

import java.util.List;
import java.util.Optional;

public interface IGenericService<E> {

    public E create(E entity);
    public E update(E entity);
    public void delete(Long id);
    public Optional<E> findOne(Long id);
    public List<E> findAll();

}