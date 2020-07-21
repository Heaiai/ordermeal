package com.heaiai.own.ordermeal.service;

import com.heaiai.own.ordermeal.entity.TestDTO;

import java.util.List;

/**
 * @description
 * @author: Heaiai
 * @create: 2020-07-21 10:43:13
 */
public interface ITestService {
    List<TestDTO> queryPage(TestDTO params);
}
