package com.example.tododemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.example.tododemo.repository")
@SpringBootApplication
public class TodoDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodoDemoApplication.class, args);
    }

}
