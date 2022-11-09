package com.map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages=("com.map"))
public class DirectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DirectionApplication.class, args);
	}

}
