package com.powernode.simple.factory;

/**
 * packageName com.powernode.simple.factory
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className Tank
 * @date 2024/6/11
 * @description TODO
 */
public class Tank extends Weapon{
    @Override
    public void attack() {
        System.out.println(" 坦克开炮！");
    }
}