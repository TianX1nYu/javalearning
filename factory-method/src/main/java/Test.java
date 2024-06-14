/**
 * packageName PACKAGE_NAME
 *客户端程序
 * @author 田鑫宇
 * @version JDK 17
 * @className Test
 * @date 2024/6/11
 * @description TODO
 */
public class Test {
    public static void main(String[] args) {
        WeaponFactory weaponFactory = new DaggerFactory();
        Weapon dagger = weaponFactory.get();
        dagger.attack();
        WeaponFactory weaponFactory1= new GunFactory();
        Weapon gun = weaponFactory1.get();
        gun.attack();
    }
}