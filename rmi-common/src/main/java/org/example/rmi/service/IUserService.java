package org.example.rmi.service;

import org.example.rmi.bean.User;

/**
 * IUserService
 *
 * @author haijian.li
 * @version 1.0
 * 2021/1/30 2:13
 **/
public interface IUserService {
    /**
     * 根据用户名查找用户
     * @param username
     * @return
     */
    User getUserByName(String username);
}
