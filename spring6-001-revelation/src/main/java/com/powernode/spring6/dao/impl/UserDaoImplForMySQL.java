package com.powernode.spring6.dao.impl;

import com.powernode.spring6.dao.UserDao;

/**
 * packageName com.powernode.spring6.dao.impl
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className UserDaoImplForMySQL
 * @date 2024/6/4
 * @description TODO
 */
public class UserDaoImplForMySQL implements UserDao {
    @Override
    public void deleteById() {
        System.out.println("mysql数据库删除用户信息中。。。");
    }
}