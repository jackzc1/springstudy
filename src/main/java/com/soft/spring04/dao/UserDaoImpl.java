package com.soft.spring04.dao;

import com.soft.spring04.dao.*;
import com.soft.spring04.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2020/2/11.
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert(User user) {
        jdbcTemplate.update("INSERT into user values(null, ?,?,?,?)",user.getUsername(),user.getBirthday(),user.getSex(),user.getAddress());
    }
}
