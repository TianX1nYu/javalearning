package com.powernode.spring6.web;

import com.powernode.spring6.service.UserService;
import com.powernode.spring6.service.impl.UserServiceImpl;

/**
 * packageName com.powernode.spring6.web
 *表示层
 * @author 田鑫宇
 * @version JDK 17
 * @className UserAction
 * @date 2024/6/4
 * @description TODO
 */
public class UserAction {
    private UserService userService = new UserServiceImpl();//不符合依赖倒置原则--面向具体方法了

    private UserService userService1;
    //删除用户信息的请求
    public void deleteRequest(){

        userService1.deleteUser();
    }
}