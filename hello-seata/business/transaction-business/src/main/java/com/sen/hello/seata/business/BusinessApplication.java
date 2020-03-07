package com.sen.hello.seata.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: Sen
 * @Date: 2020/3/7 13:51
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class BusinessApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusinessApplication.class, args);
    }
}
