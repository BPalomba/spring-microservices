package com.microservice.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class MicroserviceErekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceErekaApplication.class, args);
	}

}
