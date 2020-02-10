package com.soft.test;

import com.soft.dao.UserDao;
import com.soft.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2020/2/10.
 */
public class Demo2 {
    @Test
    public void test1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService1 = (UserService) applicationContext.getBean("userService3");
        userService1.hello();
    }

    //构造方法注入测试
    @Test
    public void test2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService1 = (UserService) applicationContext.getBean("userService4");
        userService1.hello();
    }

    //多配置文件测试在主配置文件中引入另一个配置文件
    @Test
    public void test3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao2 = (UserDao) applicationContext.getBean("userDao2");
        userDao2.findById(1);
    }

    //多配置文件测试在代码中直接加载2个配置文件
    @Test
    public void test4() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml","applicationContext1.xml");
        UserDao userDao2 = (UserDao) applicationContext.getBean("userDao2");
        userDao2.findById(1);
    }
}
