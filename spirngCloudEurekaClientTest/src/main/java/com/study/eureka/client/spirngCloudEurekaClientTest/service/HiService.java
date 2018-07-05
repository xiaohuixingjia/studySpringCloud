package com.study.eureka.client.spirngCloudEurekaClientTest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HiService {
	@Autowired
	RestTemplate restTemplate;
	@Value("${server.port}")
    String port;
	@HystrixCommand(fallbackMethod="hiError")
	public String hiService(String name){
	return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name, String.class);
	}
	
	public String hiError(String name){
		return "hi,"+name+"i am "+port+",sorry,error!";
	}
	
}
