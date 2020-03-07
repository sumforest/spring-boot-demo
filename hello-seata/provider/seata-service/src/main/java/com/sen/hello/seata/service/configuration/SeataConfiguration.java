package com.sen.hello.seata.service.configuration;

import io.seata.spring.annotation.GlobalTransactionScanner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: Sen
 * @Date: 2020/3/7 13:31
 * @Description:
 */
@Configuration
public class SeataConfiguration {

    @Bean
    public GlobalTransactionScanner globalTransactionScanner(){
        return new GlobalTransactionScanner("seata-service", "tx_group");
    }
}
