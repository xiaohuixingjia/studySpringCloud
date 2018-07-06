package com.study.feign.client.SpringCloudFeignTest.SpringCloudFeignTest.hystrix;

import org.springframework.stereotype.Component;

import com.study.feign.client.SpringCloudFeignTest.SpringCloudFeignTest.service.SchedualServiceHi;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}