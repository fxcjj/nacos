package com.vic.nacos04.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author 罗利华
 * date: 2019/9/2 11:20
 */
@RestController
public class EchoController {

    @GetMapping("echo/{string}")
    public String echo(@PathVariable String string) {
        return "Hello Nacos Discovery " + string;
    }
}
