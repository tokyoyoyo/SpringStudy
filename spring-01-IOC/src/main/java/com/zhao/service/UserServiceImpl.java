package com.zhao.service;

import com.zhao.dao.UserDao;

public class UserServiceImpl {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser(){
        userDao.getUser();
    }
}