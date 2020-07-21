package com.heaiai.own.ordermeal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description 项目启动类
 * @author: Heaiai
 * @create: 2020-07-21 09:25:10
 */
@SpringBootApplication
@MapperScan("com.heaiai.own.ordermeal")
public class Application {
    public static void main(String[] args) throws Exception{
        SpringApplication.run(Application.class);
    }
}
