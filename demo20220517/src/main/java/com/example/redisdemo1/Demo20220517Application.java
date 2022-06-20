package com.example.redisdemo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
@MapperScan("com.example.redisdemo1.dao")
public class Demo20220517Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo20220517Application.class, args);
    }

}
