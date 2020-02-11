package com.soft.spring02.configer;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by Administrator on 2020/2/10.
 */
@Configuration
@ComponentScan(value = "com.soft.spring02")
public class MyConfiger {

    @Bean
    public DataSource getDataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql:///javaweb?useUnicode=true&characterEncoding=UTF-8");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("123456");
        return druidDataSource;
    }

}
