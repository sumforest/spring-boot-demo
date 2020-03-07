package com.sen.hello.shardingSphere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Auther: Sen
 * @Date: 2020/3/7 15:56
 * @Description:
 */
@SpringBootApplication
@MapperScan(basePackages = "com.sen.hello.shardingSphere.mapper")
public class ShardingSphereApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingSphereApplication.class, args);
    }
}
