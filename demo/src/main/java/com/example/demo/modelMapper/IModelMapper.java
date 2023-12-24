package com.example.demo.modelMapper;

    public interface IModelMapper<E,O> {

        public E mapToDto( O object);
        public O mapFromDto( E object);



}
