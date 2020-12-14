package com.liubiao.designpatterns.singleton;

/**
 * 懒汉式（线程不安全），实际开发中不要使用
 *
 * @author mc0710
 */
public class SingletonClient3 {

    public static void main(String[] args) {
        System.out.println("懒汉式1 ， 线程不安全");
        Singleton3 instanceSingleton = Singleton3.getInstance();
        Singleton3 iSingleton = Singleton3.getInstance();
        System.out.println(instanceSingleton == iSingleton);
        System.out.println("instance.hashCode = " + instanceSingleton.hashCode());
        System.out.println("instance2.hashCode = " + iSingleton.hashCode());
    }

}

class Singleton3 {
    private static Singleton3 instanceSingleton;

    private Singleton3() {
    }

    /**
     * 提供一个静态的公有方法，当使用到该方法时，才去创建 instance
     * 即懒汉式
     *
     * @return 单例对象
     */
    public static Singleton3 getInstance() {
        if (instanceSingleton == null) {
            instanceSingleton = new Singleton3();
        }
        return instanceSingleton;
    }
}
