package com.soft.spring04.service;

import com.soft.spring04.dao.UserDao;
import com.soft.spring04.entity.User;
import com.soft.spring04.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2020/2/11.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public void insert(User user) {
        userDao.insert(user);
        int i = 1/0;
        userDao.insert(user);
    }
}
