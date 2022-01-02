package com.example.restfulwebservice.config;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@MapperScan(
        basePackages="com.example.restfulwebservices"
)
public class MySQLConfig {
    //프로젝트의 어디에서나 쓸 수 있도록 bean에 등록
    @Bean(name="mysqlDataSource")
    @Primary
    @ConfigurationProperties(prefix = "spring.db1.datasource")
    public DataSource dbDataSource()
    {
        return DataSourceBuilder.create().build();
    }

    @Bean(name="mysqlSessionFactory")
    @Primary
    public SqlSessionFactory sqlSessionFactory(@Qualifier("mysqlDataSource")DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();

        sessionFactory.setDataSource(dataSource);

        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sessionFactory.setMapperLocations(resolver.getResources("classpath:mappers/*.xml"));

        Resource myBatisConfig = new PathMatchingResourcePatternResolver().getResource("classpath:mybatis-config.xml");
        sessionFactory.setConfigLocation(myBatisConfig);

        return sessionFactory.getObject();
    }

    @Bean(name="mysqlSessionTemplate")
    @ConfigurationProperties("spring.datasource.hikari")
    public HikariDataSource dataSource(DataSourceProperties properties) {
        return properties.initializeDataSourceBuilder().type(HikariDataSource.class).build();
    }
}

