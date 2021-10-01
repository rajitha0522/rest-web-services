package com.test.rest.restwebservices;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.test.rest.restwebservices.todo.Todo;

@Configuration
public class ConfigurationManager {
	
	 @Bean
     public Todo todo() {
        return new Todo("Rajitha", 1, "test", false);
    } 
}
