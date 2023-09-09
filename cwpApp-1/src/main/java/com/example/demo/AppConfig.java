package com.example.demo;

import org.springframework.context.annotation.Bean;

public class AppConfig {
	 @Bean
	 public Welcome welcome(){
	        return new Welcome();
	 }
}
