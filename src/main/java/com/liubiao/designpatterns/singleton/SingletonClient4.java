package com.liubiao.designpatterns.singleton;

/**
 * 懒汉式（线程安全，同步方法），对外提供的方法多了关键字synchronized修饰
 *
 * @author mc0710
 */
public class SingletonClient4 {
    public static void main(String[] args) {
        System.out.println("懒汉式（线程安全，同步方法）");
        Singleton4 instanceSingleton = Singleton4.getInstance();
        Singleton4 iSingleton = Singleton4.getInstance();
        System.out.println(instanceSingleton == iSingleton);
        System.out.println("instance.hashCode = " + instanceSingleton.hashCode());
        System.out.println("instance2.hashCode = " + iSingleton.hashCode());
    }
}

class Singleton4 {
    private static Singleton4 instanceSingleton;

    private Singleton4() {
    }

    /**
     * 提供一个静态的公有方法，加入同步处理的代码，解决线程安全问题
     * 即懒汉式
     *
     * @return 单例对象
     */
    public static synchronized Singleton4 getInstance() {
        if (instanceSingleton == null) {
            instanceSingleton = new Singleton4();
        }
        return instanceSingleton;
    }
}