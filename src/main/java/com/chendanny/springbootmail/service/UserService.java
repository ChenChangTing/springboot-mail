package com.chendanny.springbootmail.service;

import com.chendanny.springbootmail.dto.UserRegisterRequest;
import com.chendanny.springbootmail.model.User;

public interface UserService {

    User getUserById(Integer userId);
    Integer register(UserRegisterRequest userRegisterRequest);
}
