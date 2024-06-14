package com.powernode.spring6.test;

import com.powernode.spring6.bean.Gun;
import com.powernode.spring6.bean.Person;
import com.powernode.spring6.bean.Star;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * packageName com.powernode.spring6.test
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className BeanInstantiationTest
 * @date 2024/6/11
 * @description TODO
 */
public class BeanInstantiationTest {
    @Test
    public void testInstantiation(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Star star = applicationContext.getBean("starBean", Star.class);
        System.out.println(star);
    }

    @Test
    public void testInstantiation2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Gun gun = applicationContext.getBean("gun", Gun.class);
        System.out.println(gun);
    }
    @Test
    public void testInstantiation3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person);
    }
}