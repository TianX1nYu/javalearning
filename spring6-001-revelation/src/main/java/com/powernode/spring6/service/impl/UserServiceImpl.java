package com.powernode.spring6.service.impl;

import com.powernode.spring6.dao.UserDao;
import com.powernode.spring6.dao.impl.UserDaoImplForMySQL;
import com.powernode.spring6.service.UserService;

/**
 * packageName com.powernode.spring6.service.impl
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className UserServiceImpl
 * @date 2024/6/4
 * @description TODO
 */
public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoImplForMySQL();//不符合依赖倒置原则--面向具体方法了
    private UserDao userDao1;//符合依赖倒置原则

    @Override
    public void deleteUser() {
        //处理删除用户信息的逻辑，调用dao持久层
//        UserDao userDao = new UserDaoImplForMySQL();

//        userDao.deleteById();
        userDao1.deleteById();
        //处理业务的代码
    }
    public void saveUser(){
//        UserDao userDao = new UserDaoImplForMySQL();//该方法仍需要连接数据库，所以可以定义在外面成为成员变量
    }
}