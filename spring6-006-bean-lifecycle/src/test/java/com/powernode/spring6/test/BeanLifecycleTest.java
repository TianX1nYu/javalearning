package com.powernode.spring6.test;

import com.powernode.spring6.bean.Student;
import com.powernode.spring6.bean.User;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * packageName com.powernode.spring6.test
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className BeanLifecycleTest
 * @date 2024/6/11
 * @description TODO
 */
public class BeanLifecycleTest {
    /*
    * spring只对singleton的Bean进行完整的声明周期管理
    * 如果是prototype作用域的Bean，Spring只负责到创建init。(使用bean之后就跟踪不到了--十步里的前8步)*/
    @Test
    public void testBeanLifecycleFive(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println("第四步：使用Bean:"+user);
        //注意：必须手动关闭Spring容器，这样spring容器才会销毁bean
        //applicationContext无close方法，ClassPathXmlApplicationContext中存在close方法，转型一下
        ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) applicationContext;
        context.close();
    }

    @Test
    public void testRegisterBean(){
        //自己new对象
        Student student = new Student();
        System.out.println(student);
        //将以上new对象纳入spring容器管理，半路上交给spring来管理
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        factory.registerSingleton("studentBean",student);

        //从spring容器中获取
        Object studentBean = factory.getBean("studentBean");
        System.out.println(studentBean);
    }
}