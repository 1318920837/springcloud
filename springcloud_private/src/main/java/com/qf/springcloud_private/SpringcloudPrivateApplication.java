package com.qf.springcloud_private;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudPrivateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudPrivateApplication.class, args);
    }

}
