package com.qf.springcould_consumer_ribbon.ConsumerController;/*
@author:g
@Date:2019/8/21
    */

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.security.SecureRandom;
import java.time.temporal.Temporal;

@RestController
@RequestMapping("ribbon")
public class Ribbon_Controller {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hello")
    @HystrixCommand(fallbackMethod = "fallback")
    public String query(){

        String result = restTemplate.getForObject("http://SERVER-PRIVATE/stu/query/18", String.class);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "调用的结果为"+result;
    }
    public String fallback(){
        return "服务器异常";
    }
}
