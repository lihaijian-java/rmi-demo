package org.example.rmi.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * User
 *
 * @author haijian.li
 * @version 1.0
 * 2021/1/30 2:12
 **/
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -8250584033215788340L;
    private String username;
    private String password;
}
