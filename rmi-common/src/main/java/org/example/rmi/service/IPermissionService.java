package org.example.rmi.service;

import org.example.rmi.bean.Permission;

/**
 * IPermissionService
 *
 * @author haijian.li
 * @version 1.0
 * 2021/1/30 2:14
 **/
public interface IPermissionService {

    /**
     * 根据权限名称获取权限
     * @param pName
     * @return
     */
    Permission getPermissionByName(String pName);
}
