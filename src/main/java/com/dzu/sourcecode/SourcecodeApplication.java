package com.dzu.sourcecode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dzu.sourcecode.mapper")
public class SourcecodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SourcecodeApplication.class, args);
    }
}
