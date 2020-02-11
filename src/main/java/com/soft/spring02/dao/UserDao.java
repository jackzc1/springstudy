package com.soft.spring02.dao;

import com.soft.spring02.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2020/2/11.
 */
public interface UserDao {
    public List<User> findAll();
}
