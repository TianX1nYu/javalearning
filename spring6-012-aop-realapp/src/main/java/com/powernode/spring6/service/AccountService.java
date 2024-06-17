package com.powernode.spring6.service;

import org.springframework.stereotype.Service;

/**
 * packageName com.powernode.spring6.service
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className AccountService
 * @date 2024/6/17
 * @description TODO
 */
@Service
public class AccountService {
    //转账的业务方法
    public void transfer(){
        System.out.println("银行账户正在完成转账操作。。。。");
    }
    //取款的业务方法
    public void withdraw(){
        System.out.println("正在取款，请稍后。。。");
    }
}