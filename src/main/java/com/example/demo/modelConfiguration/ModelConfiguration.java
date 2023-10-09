package com.example.demo.modelConfiguration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelConfiguration {
    @Bean
    public ModelMapper toGetModel(){
        return new ModelMapper();
    }




}
