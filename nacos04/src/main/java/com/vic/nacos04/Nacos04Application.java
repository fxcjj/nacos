package com.vic.nacos04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Nacos04Application {

    public static void main(String[] args) {
        SpringApplication.run(Nacos04Application.class, args);
    }

}
