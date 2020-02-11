package com.soft.spring02.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2020/2/11.
 */
@Component
@Aspect
public class MyAspact {

    @Before(value = "execution(public * com.soft.spring02.service.UserServiceImpl.findAll(..))")
    public void log() {
        System.out.println("增强");
    }

}
