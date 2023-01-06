package com.chendanny.springbootmail.dao;

import com.chendanny.springbootmail.dto.UserRegisterRequest;
import com.chendanny.springbootmail.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
