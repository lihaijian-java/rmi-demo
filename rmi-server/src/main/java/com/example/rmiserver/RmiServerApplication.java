package com.example.rmiserver;

import org.example.rmi.service.IPermissionService;
import org.example.rmi.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.rmi.RmiServiceExporter;

import javax.annotation.Resource;
import java.rmi.RemoteException;

/**
 * @author luomo
 */
@SpringBootApplication
public class RmiServerApplication {
    @Resource
    IUserService userService;
    @Resource
    IPermissionService permissionService;

    @Bean
    RmiServiceExporter serviceExporter(){
        RmiServiceExporter serviceExporter = new RmiServiceExporter();
        serviceExporter.setServiceName("userService");
        serviceExporter.setService(userService);
        serviceExporter.setServiceInterface(IUserService.class);
        serviceExporter.setRegistryPort(2002);

        try {
            serviceExporter.afterPropertiesSet();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return serviceExporter;
    }

    public static void main(String[] args) {
        SpringApplication.run(RmiServerApplication.class, args);
    }

}
