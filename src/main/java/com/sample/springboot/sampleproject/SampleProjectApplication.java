package com.sample.springboot.sampleproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

//@ComponentScan(basePackages = "com.sample.springboot")
//@PropertySource("classpath:${propertyFiles.app}")
//@PropertySource("classpath:${propertyFiles.env}")
//@EnableJpaRepositories("com.sample.springboot.sampleproject")
//@EntityScan("com.sample.springboot.sampleproject.ItemsRepository")
public class SampleProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleProjectApplication.class, args);
	}

}
