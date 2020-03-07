package com.sen.hello.seata.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: Sen
 * @Date: 2020/3/7 03:07
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SeataApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeataApplication.class, args);
    }
}
