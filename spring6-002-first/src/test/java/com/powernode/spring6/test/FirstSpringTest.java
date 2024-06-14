package com.powernode.spring6.test;

import com.powernode.spring6.bean.User;
import com.powernode.spring6.dao.UserDaoImplForMySQL;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * packageName com.powernode.spring6.test
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className FirstSpringTest
 * @date 2024/6/4
 * @description TODO
 */
public class FirstSpringTest {
    @Test
    public void testXmlPath(){
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("H:/java code/spring.xml");
        User user=applicationContext.getBean("userBean", User.class);
        System.out.println(user);
        //自己记录日志框架
        Logger logger = LoggerFactory.getLogger(FirstSpringTest.class);
    }
    @Test
    public void testFirstSpringCode(){
        //第一步获取spring容器对象
        //ApplicationContext 应用上下文，spring容器
        //ApplicationContext是一个接口
        //ApplicationContext接口下有很多实现类
        //ClassPathXmlApplicationContext 专门从类路径中加载spring配置文件的一个Spring上下文对象
        //该代码执行相当于启动Spring容器，解析spring.xml文件，并实例化所有的bean对象(本质是Object类型的),放到spring容器中
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml","beans.xml","xml/beans.xml");

        //第二步根据bean的id从Spring容器中获取这个对象
        Object userBean=applicationContext.getBean("userBean");
        System.out.println(userBean);
        Object userDaoBean=applicationContext.getBean("userDaoBean");
        System.out.println(userDaoBean);

        Object vipBean = applicationContext.getBean("vipBean");
        System.out.println(vipBean);

        Object userBean2 = applicationContext.getBean("userBean2");
        System.out.println(userBean2);


        UserDaoImplForMySQL userBean21 = applicationContext.getBean("userDaoBean", UserDaoImplForMySQL.class);
        userBean21.insert();

        Object dateBean = applicationContext.getBean("dateBean");
        System.out.println(dateBean);

        //日期格式化--强制转化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strNowTime = sdf.format(dateBean);
        System.out.println(strNowTime);

        //不使用强转，通过第二个参数来指定返回的bean类型
        Date dateBean1 = applicationContext.getBean("dateBean",Date.class);
        System.out.println(dateBean1.getClass());
        System.out.println(Date.class);

    }
}