package com.example.rmiserver.service;

import org.example.rmi.bean.Permission;
import org.example.rmi.service.IPermissionService;
import org.springframework.stereotype.Service;

/**
 * PermissionServiceImpl
 *
 * @author haijian.li
 * @version 1.0
 * 2021/1/30 2:20
 **/
@Service
public class PermissionServiceImpl implements IPermissionService {
    @Override
    public Permission getPermissionByName(String pName) {
        Permission permission = null;
        if (pName != null && pName.equals("")) {
            permission = new Permission();
            if (pName.equals("ROLE_ADMIN")) {
                permission.setPName("ROLE_ADMIN");
                permission.setUrlPattern("/**");
            }else{
                permission.setPName("ROLE_ABEL");
                permission.setUrlPattern("/abel**");
            }
        }
        return permission;
    }
}
