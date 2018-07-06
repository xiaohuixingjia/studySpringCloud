package com.study.feign.client.SpringCloudFeignTest.SpringCloudFeignTest.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.study.feign.client.SpringCloudFeignTest.SpringCloudFeignTest.config.SybnHystrixFeignConfiguration;
import com.study.feign.client.SpringCloudFeignTest.SpringCloudFeignTest.hystrix.SchedualServiceHiHystric;

@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class,configuration=SybnHystrixFeignConfiguration.class)
public interface SchedualServiceHi {
	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
