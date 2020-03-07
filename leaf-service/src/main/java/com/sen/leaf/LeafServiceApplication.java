package com.sen.leaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: Sen
 * @Date: 2020/3/7 18:23
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class LeafServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeafServiceApplication.class, args);
    }
}
