package com.powernode.spring6.test;

import com.powernode.spring6.jdbc.MyDataSource;
import com.powernode.spring6.service.CustomerService;
import com.powernode.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * packageName com.powernode.spring6.test
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className SpringDITest
 * @date 2024/6/5
 * @description TODO
 */
public class SpringDITest {
    @Test
    public void testSetDI(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userServiceBean", UserService.class);
        userService.saveUser();

    }
    @Test
    public void testConstructorDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        CustomerService customerService = applicationContext.getBean("csBean",CustomerService.class);
        customerService.save();
    //  配置文件中使用name定位类名，构造注入
        CustomerService customerService1 = applicationContext.getBean("csBean2",CustomerService.class);
        customerService1.save();
    //    配置文件中不指定参数下标和参数名，spring自己做类型匹配
        CustomerService customerService2 = applicationContext.getBean("csBean3",CustomerService.class);
        customerService2.save();
        System.out.println(customerService.getClass());
        System.out.println("=======================");
        Object object1 = applicationContext.getBean("csBean");
        System.out.println(object1.getClass());
        //object1.save();//这个不行，虽然getClass拿到的与customerService相同类别，但是没有具体方法，还是个Object
    }
    @Test
    public void testAutoWire(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-autowire.xml");
        UserService userServiceBean = applicationContext.getBean("userServiceBean", UserService.class);
        userServiceBean.saveUser();
    }
    @Test
    public void testProperties(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-properties.xml");
        MyDataSource dataSource = applicationContext.getBean("dataSource", MyDataSource.class);
        System.out.println(dataSource);
    }
}