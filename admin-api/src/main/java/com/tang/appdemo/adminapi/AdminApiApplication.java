package com.tang.appdemo.adminapi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @description
 *
 * @author tanghx
 * @date 2023/12/4 10:14
 */
@Slf4j
@SpringBootApplication
@ComponentScan("com.tang.appdemo")
public class AdminApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminApiApplication.class, args);
    }
}