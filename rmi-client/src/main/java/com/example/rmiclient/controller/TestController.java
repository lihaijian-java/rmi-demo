package com.example.rmiclient.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.rmi.bean.User;
import org.example.rmi.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * TestController
 *
 * @author haijian.li
 * @version 1.0
 * 2021/1/30 2:25
 **/
@RestController
@Slf4j
@RequestMapping(value = "/v1")
public class TestController {

    @Resource
    IUserService userService;

    @RequestMapping("/getUser")
    public User getUser(){
        return userService.getUserByName("admin");
    }
}
