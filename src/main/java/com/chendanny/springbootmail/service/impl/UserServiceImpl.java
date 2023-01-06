package com.chendanny.springbootmail.service.impl;

import com.chendanny.springbootmail.dao.UserDao;
import com.chendanny.springbootmail.dto.UserRegisterRequest;
import com.chendanny.springbootmail.model.User;
import com.chendanny.springbootmail.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
