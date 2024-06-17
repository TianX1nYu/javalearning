package com.powernode.spring6.service;

import org.springframework.stereotype.Service;

/**
 * packageName com.powernode.spring6.service
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className UserService
 * @date 2024/6/14
 * @description TODO
 */
@Service
public class UserService {
    public void login(){
        System.out.println("系统正在进行身份验证");
    }
    public void logout(){
        System.out.println("系统正在登出");
    }
}