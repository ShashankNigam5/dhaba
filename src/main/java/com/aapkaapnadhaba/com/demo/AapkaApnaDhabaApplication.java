package com.aapkaapnadhaba.com.demo;

import com.aapkaapnadhaba.com.demo.Controller.FoodController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories("Repository")
public class AapkaApnaDhabaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AapkaApnaDhabaApplication.class, args);
	}

}
