package com.sen.hello.seata.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Auther: Sen
 * @Date: 2020/3/7 02:24
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableTransactionManagement
@MapperScan(basePackages = "com.sen.hello.seata.service.mapper")
public class OrderItemApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderItemApplication.class, args);
    }
}
