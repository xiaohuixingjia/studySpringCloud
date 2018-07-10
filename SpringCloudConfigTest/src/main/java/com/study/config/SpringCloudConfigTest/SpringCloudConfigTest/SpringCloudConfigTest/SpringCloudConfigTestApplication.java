package com.study.config.SpringCloudConfigTest.SpringCloudConfigTest.SpringCloudConfigTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigTestApplication.class, args);
	}
}
