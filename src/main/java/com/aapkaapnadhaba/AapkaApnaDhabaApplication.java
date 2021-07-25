package com.aapkaapnadhaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("Repository")
public class AapkaApnaDhabaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AapkaApnaDhabaApplication.class, args);
	}

}
