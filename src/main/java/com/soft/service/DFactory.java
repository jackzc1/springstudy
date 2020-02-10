package com.soft.service;

/**
 * Created by Administrator on 2020/2/10.
 */
public class DFactory {
    public UserService getUserService() {
        return new UserServiceImpl();
    }
}
