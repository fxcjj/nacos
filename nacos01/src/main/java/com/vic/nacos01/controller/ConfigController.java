package com.vic.nacos01.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 配置集
 * @author 罗利华
 * date: 2019/8/31 16:56
 */
@Controller
@RequestMapping("config")
public class ConfigController {

    @NacosValue(value = "${fuck:false}", autoRefreshed = true)
    private boolean fuck;

    @GetMapping("get")
    @ResponseBody
    public boolean get() {
        return fuck;
    }

}
