package com.soft.test;

import com.soft.spring02.entity.User;
import com.soft.spring02.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Administrator on 2020/2/11.
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = com.soft.spring02.configer.MyConfiger.class)
public class Demo3 {
    @Autowired
    private UserService userService;
    @Test
    public void test() {
        List<User> list = userService.findAll();
        for (User user : list) {
            System.out.println(user);
        }
    }

}
