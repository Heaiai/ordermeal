package com.heaiai.own.ordermeal.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description 测试控制类
 * @author: Heaiai
 * @create: 2020-07-21 09:31:55
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/test")
    public String testNew(){
        return "test";
    }
}
