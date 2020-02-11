package com.soft.spring03.dao;

import com.soft.spring03.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2020/2/11.
 */
public interface UserDao {
    public List<User> findAll();
    public void insert(User user);
}
