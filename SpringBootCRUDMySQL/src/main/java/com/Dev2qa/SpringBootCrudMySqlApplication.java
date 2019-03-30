package com.Dev2qa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@ComponentScan(basePackages = { "com.Dev2qa" })
@EnableAutoConfiguration
@SpringBootApplication
public class SpringBootCrudMySqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudMySqlApplication.class, args);
	}

}
