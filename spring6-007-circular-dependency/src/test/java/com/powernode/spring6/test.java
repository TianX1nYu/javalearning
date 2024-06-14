package com.powernode.spring6;

import com.powernode.spring6.bean.HusBand;
import com.powernode.spring6.bean.Wife;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * packageName com.powernode.spring6
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className test
 * @date 2024/6/11
 * @description TODO
 */
public class test {
    @Test
    public void testCD(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        HusBand husbandBean = applicationContext.getBean("husbandBean", HusBand.class);
        System.out.println(husbandBean);
        Wife wifeBean = applicationContext.getBean("wifeBean", Wife.class);
        System.out.println(wifeBean);
    }
}