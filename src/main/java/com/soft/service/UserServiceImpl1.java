package com.soft.service;

import com.soft.dao.UserDao;

/**
 * Created by Administrator on 2020/2/10.
 */
public class UserServiceImpl1 implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void hello() {
        System.out.println("hello spring");
        userDao.findById(1);
    }
}
