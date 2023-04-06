package com.company.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.company.spring")
public class Config {

    @Bean
    public Car car() {
        return new Car();
    }

}
