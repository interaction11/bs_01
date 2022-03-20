package com.bs;

import org.apache.ibatis.javassist.ClassPath;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@MapperScan(basePackages = "com.bs.dao")
@SpringBootApplication
public class Bs01Application {

    public static void main(String[] args) {
        SpringApplication.run(Bs01Application.class, args);
    }

}
