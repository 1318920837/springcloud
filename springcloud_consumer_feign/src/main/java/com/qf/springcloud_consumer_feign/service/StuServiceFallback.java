package com.qf.springcloud_consumer_feign.service;/*
@author:g
@Date:2019/8/21
    */

import org.springframework.stereotype.Component;

@Component
public class StuServiceFallback  implements  IConsumerService{
    @Override
    public String query(Integer id) {
        return "ok";
    }
}
