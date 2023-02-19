package com.douSheng;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// 启动类
@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
@MapperScan("com.douSheng.mapper")
public class DouShengApplication {
    public static void main(String[] args) {
        SpringApplication.run(DouShengApplication.class,args);
    }
}
