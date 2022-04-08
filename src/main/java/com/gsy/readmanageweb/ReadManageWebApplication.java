package com.gsy.readmanageweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = {"com.gsy.readmanageweb.business.dao.mapper"})
public class ReadManageWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReadManageWebApplication.class, args);
    }

}
