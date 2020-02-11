package com.soft.spring03.service;

import com.soft.spring03.dao.UserDao;
import com.soft.spring03.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2020/2/11.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public List<User> findAll() {
        return userDao.findAll();
    }

    public void insert(User user) {
        userDao.insert(user);
        userDao.insert(user);
    }
}
