package com.example.demo.configuration;

import com.example.demo.components.Head;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfiguration {
    @Bean
    public Head head() {
        return new Head();
    }
}
