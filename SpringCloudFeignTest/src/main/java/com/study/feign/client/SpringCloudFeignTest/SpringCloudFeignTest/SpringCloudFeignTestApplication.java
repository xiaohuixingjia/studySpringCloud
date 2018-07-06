package com.study.feign.client.SpringCloudFeignTest.SpringCloudFeignTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class SpringCloudFeignTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFeignTestApplication.class, args);
	}
}
