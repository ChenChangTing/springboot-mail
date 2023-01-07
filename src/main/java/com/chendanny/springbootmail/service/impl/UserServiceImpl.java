package com.chendanny.springbootmail.service.impl;

import com.chendanny.springbootmail.dao.UserDao;
import com.chendanny.springbootmail.dto.UserLoginRequest;
import com.chendanny.springbootmail.dto.UserRegisterRequest;
import com.chendanny.springbootmail.model.User;
import com.chendanny.springbootmail.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;
import org.springframework.web.server.ResponseStatusException;


@Component
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        //檢查註冊的email
        User user =userDao.getUserByEmail(userRegisterRequest.getEmail());

        if(user!=null){
            log.warn("該email{}已經被註冊",userRegisterRequest.getEmail());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        //使用md5升成密碼雜湊值
        String hashedPassword = DigestUtils.md5DigestAsHex(userRegisterRequest.getPassword().getBytes());
        userRegisterRequest.setPassword(hashedPassword);

        //創建帳號
        return userDao.createUser(userRegisterRequest);


    }

    @Override
    public User login(UserLoginRequest userLoginRequest) {
        User user=userDao.getUserByEmail(userLoginRequest.getEmail());

        //檢查user是否存在
        if(user==null){
            log.warn("該email{}尚未註冊",userLoginRequest.getEmail());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        //使用md5生成密碼雜湊值
        String hashedPassword=DigestUtils.md5DigestAsHex(userLoginRequest.getPassword().getBytes());


        //比較密碼是否正確
        if(user.getPassword().equals(hashedPassword)){
            return user;
        }else {
            log.warn("email{}的密碼不正確",userLoginRequest.getEmail());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
    }
}
