package com.powernode.spring6.test;

import com.powernode.spring6.service.OrderService;
import com.powernode.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * packageName com.powernode.spring6.test
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className SpringAOPTest
 * @date 2024/6/14
 * @description TODO
 */
public class SpringAOPTest {
    @Test
    public void testBefore(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        //UserService userService = applicationContext.getBean("userService", UserService.class);
        //userService.login();
        //userService.logout();
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.generate();
    }
}