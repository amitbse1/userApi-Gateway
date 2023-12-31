package com.sapient.userApiGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserApiGatewayApplication.class, args);
	}

}
