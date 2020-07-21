package com.heaiai.own.ordermeal.controller;

import com.heaiai.own.ordermeal.entity.TestDTO;
import com.heaiai.own.ordermeal.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description 测试控制类
 * @author: Heaiai
 * @create: 2020-07-21 09:31:55
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ITestService testService;
    @RequestMapping("/test")
    public String testNew(){
        return "test";
    }

    @RequestMapping("/testList")
    public String testList(){
        List<TestDTO> result = testService.queryPage(new TestDTO());
        return result.toString();
    }
}
