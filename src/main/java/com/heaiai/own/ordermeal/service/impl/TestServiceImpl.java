package com.heaiai.own.ordermeal.service.impl;

import com.heaiai.own.ordermeal.dao.TestMapper;
import com.heaiai.own.ordermeal.entity.TestDTO;
import com.heaiai.own.ordermeal.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description
 * @author: Heaiai
 * @create: 2020-07-21 10:43:30
 */
@Service("testService")
public class TestServiceImpl implements ITestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<TestDTO> queryPage(TestDTO params) {
        return testMapper.getList(params);
    }
}
