package com.soft.service;

/**
 * Created by Administrator on 2020/2/10.
 */
public class SFactory {

    public static UserService getUserService() {
        return new UserServiceImpl();
    }
}
