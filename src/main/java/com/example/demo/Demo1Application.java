package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

//@EnableAutoConfiguration
//@SpringBootApplication
//public class Demo1Application extends SpringBootServletInitializer {
//	
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(Demo1Application.class);
//	}
//
//	public static void main(String[] args) {
//		SpringApplication.run(Demo1Application.class, args);
//	}
//}

@EnableAutoConfiguration
@SpringBootApplication
public class Demo1Application  {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}
}