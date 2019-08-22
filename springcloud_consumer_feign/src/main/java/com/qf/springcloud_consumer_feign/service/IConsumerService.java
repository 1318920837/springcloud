package com.qf.springcloud_consumer_feign.service;/*
@author:g
@Date:2019/8/21
    */

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "SERVER-PRIVATE",fallback = StuServiceFallback.class)

public interface IConsumerService {

    @RequestMapping("/stu/query/{id}")
    public String query(@PathVariable Integer id);
}
