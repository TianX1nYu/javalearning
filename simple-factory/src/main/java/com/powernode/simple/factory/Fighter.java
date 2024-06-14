package com.powernode.simple.factory;

/**
 * packageName com.powernode.simple.factory
 *战斗机
 * @author 田鑫宇
 * @version JDK 17
 * @className Fighter
 * @date 2024/6/11
 * @description TODO
 */
public class Fighter extends Tank{
    @Override
    public void attack() {
        System.out.println(" 战⽃机投下原⼦弹！");
    }
}