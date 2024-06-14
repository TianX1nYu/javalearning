/**
 * packageName PACKAGE_NAME
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className GunFactory
 * @date 2024/6/11
 * @description TODO
 */
public class GunFactory extends WeaponFactory{
    @Override
    public Weapon get() {
        return new Gun();
    }
}