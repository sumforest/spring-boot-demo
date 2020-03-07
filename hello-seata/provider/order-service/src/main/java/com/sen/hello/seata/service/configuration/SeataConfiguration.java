package com.sen.hello.seata.service.configuration;

import com.zaxxer.hikari.HikariDataSource;
import io.seata.rm.datasource.DataSourceProxy;
import io.seata.spring.annotation.GlobalTransactionScanner;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * @Auther: Sen
 * @Date: 2020/3/7 02:44
 * @Description: 为Seata配置代理数源
 */
@Configuration
public class SeataConfiguration {

    /**
     * 注入数据源给Hikari连接池
     *
     * @return
     */
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource druidDataSource() {
        return new HikariDataSource();
    }

    /**
     * 创建代理数据源
     * @param hikariDataSource
     * @return
     */
    @Primary
    @Bean
    public DataSourceProxy dataSourceProxy(DataSource hikariDataSource) {
        return new DataSourceProxy(hikariDataSource);
    }

    /**
     * 创建SqlSessionFactory
     * @param dataSourceProxy
     * @return
     * @throws Exception
     */
    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSourceProxy dataSourceProxy) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSourceProxy);
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources("classpath*:/mapper/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }

    /**
     * 创建全局事务拦截器
     * @return
     */
    @Bean
    public GlobalTransactionScanner globalTransactionScanner(){
        return new GlobalTransactionScanner("order-service", "tx_group");
    }
}
