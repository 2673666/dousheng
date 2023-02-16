package com.douSheng;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhiyuan
 * @date 2023/2/9 -8:50
 */

// 启动类注释


@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
@MapperScan("com.douSheng.mapper")
public class DouShengApplication {
    public static void main(String[] args) {
        SpringApplication.run(DouShengApplication.class,args);
    }
}
