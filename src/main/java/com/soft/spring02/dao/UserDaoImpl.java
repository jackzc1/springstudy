package com.soft.spring02.dao;

import com.soft.spring02.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
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
    private DataSource dataSource;

    public List<User> findAll() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<User> list = new ArrayList<User>();
        try {
            connection = dataSource.getConnection();
            String sql = "select * from user";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String username = resultSet.getString(2);
                Date birthday = resultSet.getDate(3);
                String sex = resultSet.getString(4);
                String address = resultSet.getString(5);
                User user = new User(id, username, birthday, sex, address);
                list.add(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet!=null) {
                    resultSet.close();
                }
                if (preparedStatement!=null) {
                    preparedStatement.close();
                }
                if (connection!=null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
