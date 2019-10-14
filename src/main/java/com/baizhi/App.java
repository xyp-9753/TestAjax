package com.baizhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 */
@SpringBootApplication
@MapperScan(basePackages = "com.baizhi.dao")
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");


    }
}