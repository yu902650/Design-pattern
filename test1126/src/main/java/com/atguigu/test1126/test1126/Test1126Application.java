package com.atguigu.test1126.test1126;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.test1126.test1126.mapper")
public class Test1126Application {

    public static void main(String[] args) {
        SpringApplication.run(Test1126Application.class, args);
    }

}
