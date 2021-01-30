package com.example.rmiserver.service;

import org.example.rmi.bean.User;
import org.example.rmi.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * UserServiceImpl
 *
 * @author haijian.li
 * @version 1.0
 * 2021/1/30 2:22
 **/
@Service("UserServiceImpl")
public class UserServiceImpl implements IUserService {
    @Override
    public User getUserByName(String username) {
        User user = null;
        if (username != null && !username.equals("")) {
            user = new User();
            if (username.equals("admin")) {
                user.setUsername("admin");
                user.setPassword("123456");
            }else{
                user.setUsername("user");
                user.setPassword("111111");
            }

        }
        return user;
    }
}
