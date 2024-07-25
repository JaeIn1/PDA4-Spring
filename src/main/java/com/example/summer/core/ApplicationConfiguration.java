package com.example.summer.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public House house(){
        return new House();
    }

    @Bean
    @Autowired
    public Person person(){
        return new Person(house());
    }
}
