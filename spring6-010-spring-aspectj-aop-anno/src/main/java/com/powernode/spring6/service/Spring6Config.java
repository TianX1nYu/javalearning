package com.powernode.spring6.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * packageName com.powernode.spring6.service
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className Spring6Config
 * @date 2024/6/17
 * @description TODO
 */
@Configuration//代替spring.xml
@ComponentScan("com.powernode.spring6.service")//组件扫描
@EnableAspectJAutoProxy(proxyTargetClass = true)//启用aspectj的自动代理机制
public class Spring6Config {
}