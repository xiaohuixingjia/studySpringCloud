package com.study.eureka.server.spirngCloudEurekaServeTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class SpirngCloudEurekaServeTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpirngCloudEurekaServeTestApplication.class, args);
	}
}
