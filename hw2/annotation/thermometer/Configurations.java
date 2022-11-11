package com.ecommint.spring.annotation.thermometer;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configurations {

    @Bean
    @Qualifier("defaultDegree")
    public double getDegree(){
        return 180;
    }
}
