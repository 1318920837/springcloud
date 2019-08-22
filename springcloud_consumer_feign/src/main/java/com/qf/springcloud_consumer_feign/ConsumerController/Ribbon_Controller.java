package com.qf.springcloud_consumer_feign.ConsumerController;/*
@author:g
@Date:2019/8/21
    */

import com.qf.springcloud_consumer_feign.service.IConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/fegin")
public class Ribbon_Controller {


    @Autowired
    private IConsumerService iConsumerService;
    @RequestMapping("/hello")
    public String hello(){
        String result = iConsumerService.query(200);


        return "调用的结果为"+result;


    }
}
