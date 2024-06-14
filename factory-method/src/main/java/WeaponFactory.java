/**
 * packageName PACKAGE_NAME
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className WeaponFactory
 * @date 2024/6/11
 * @description TODO
 */
abstract public class WeaponFactory
{
    //这个方法不是静态方法，是实例方法。
    public abstract Weapon get();
}