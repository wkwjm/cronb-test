package com.ustcinfo.cronb.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CronbApplication {
    public static void main(String[] args) {
        SpringApplication.run(CronbApplication.class,args);
    }
}
