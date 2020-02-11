package com.soft.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.soft.spring03.entity.User;
import com.soft.spring03.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2020/2/11.
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext2.xml")
public class Demo4 {
    @Autowired
    private UserService userService;
    @Autowired
    private DruidDataSource dataSource;
    @Test
    public void test() {
        User user = new User(null, "哈哈", new Date(), "男", "江西");
        userService.insert(user);
    }

}
