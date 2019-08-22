package com.qf.springcloud_private.controller;/*
@author:g
@Date:2019/8/20
    */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stu")
public class StuController {
    @Value("${server.port}")
    private Integer port;

    @RequestMapping("/query/{id}")
    public String query(@PathVariable("id") Integer id) {
        return "id=" + id + "端口为：" + port;
    }
}
