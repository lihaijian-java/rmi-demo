package org.example.rmi.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * Permission
 *
 * @author haijian.li
 * @version 1.0
 * 2021/1/30 2:06
 **/
@Data
public class Permission implements Serializable {

    private static final long serialVersionUID = 2803051603860048943L;
    private String pName;
    private String urlPattern;
}
