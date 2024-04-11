package com.disaster.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@SpringBootApplication
public class DisasterApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisasterApiApplication.class, args);
	}

}
