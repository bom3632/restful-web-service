package com.example.restfulwebservice.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

//    @Bean(name="mysqlDataSource")
//    @Primary
//    @ConfigurationProperties("spring.datasource")
//    public DataSourceProperties dataSourceProperties() {
//        return new DataSourceProperties();
//    }
//
//    @Bean(name="mysqlSessionTemplate")
//    @ConfigurationProperties("spring.datasource.hikari")
//    public HikariDataSource dataSource(DataSourceProperties properties) {
//        return properties.initializeDataSourceBuilder().type(HikariDataSource.class).build();
//    }
}
