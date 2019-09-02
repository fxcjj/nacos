package com.vic.nacos01;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@NacosPropertySource(dataId = "nacos01.properties", autoRefreshed = true)
public class Nacos01Application {

    public static void main(String[] args) {
        SpringApplication.run(Nacos01Application.class, args);
    }

}
