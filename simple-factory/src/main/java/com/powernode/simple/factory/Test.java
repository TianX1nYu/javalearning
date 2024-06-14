package com.powernode.simple.factory;

/**
 * packageName com.powernode.simple.factory
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className Test
 * @date 2024/6/11
 * @description TODO
 */
public class Test {
    public static void main(String[] args) {
        //客户端程序不需要关⼼对象的创建细节，需要哪个对象时，只需要向⼯⼚索要即可，初步实现了责
        //任的分离。客户端只负责"消费"，⼯⼚负责"⽣产"。⽣产和消费分离。
        Weapon weapon1 = WeaponFactory.get("TANK");
        weapon1.attack();
        Weapon weapon2 = WeaponFactory.get("FIGHTER");
        weapon2.attack();
        Weapon weapon3 = WeaponFactory.get("DAGGER");
        weapon3.attack();
    }
}