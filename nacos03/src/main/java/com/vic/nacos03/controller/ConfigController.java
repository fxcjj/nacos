package com.vic.nacos03.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 罗利华
 * date: 2019/8/31 16:56
 */
@RestController
@RequestMapping("config")
@RefreshScope
public class ConfigController {

    @Value("${go:false}")
    private boolean go;

    /**
     * http://localhost:8103/config/get
     * @return
     */
    @GetMapping("get")
    public boolean get() {
        return go;
    }

}
