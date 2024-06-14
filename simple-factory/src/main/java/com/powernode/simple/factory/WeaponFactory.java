package com.powernode.simple.factory;

/**
 * packageName com.powernode.simple.factory
 *工厂类角色
 * @author 田鑫宇
 * @version JDK 17
 * @className WeaponFactory
 * @date 2024/6/11
 * @description TODO
 */
public class WeaponFactory {
//    根据不同的武器类型生产武器
//    * @param weaponType 武器类
//    * @return 武器对象
    public static Weapon get(String weaponType){
        if (weaponType == null || weaponType.trim().length()==0){
            return null;
        }
        Weapon weapon = null;
        if ("TANK".equals(weaponType)) {
            weapon = new Tank();
        } else if ("FIGHTER".equals(weaponType)) {
            weapon = new Fighter();
        } else if ("DAGGER".equals(weaponType)) {
            weapon = new Dagger();
        } else {
            throw new RuntimeException(" 不⽀持该武器！ ");
        }
        return weapon;
    }
}