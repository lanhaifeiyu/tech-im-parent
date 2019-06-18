package com.lhfeiyu.tech.im;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Airson Yu
 * @SpringCloudApplication//(exclude = {DataSourceAutoConfiguration.class})
 * @MapperScan(basePackages = "com.zom.keep.domain.dao.mapper")//, sqlSessionFactoryRef = "sqlSessionFactory"
 */
@EnableTransactionManagement
@ComponentScan(basePackages = "com.lhfeiyu.tech")
@MapperScan(basePackages = "com.lhfeiyu.tech.im.mapper")
//@EnableScheduling
//@SpringCloudApplication
//@EnableEurekaClient
@SpringBootApplication
public class TechImApplication {

    public static void main(String[] args) {
        SpringApplication.run(TechImApplication.class, args);
    }

}
