package com.example.demo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class kaleetnaApplication {

	public static void main(String[] args) {
		SpringApplication.run(kaleetnaApplication.class, args);
	}

	//the main method
//	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

}
