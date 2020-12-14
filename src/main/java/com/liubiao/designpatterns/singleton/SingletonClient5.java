package com.liubiao.designpatterns.singleton;

/**
 * 懒汉式（线程安全，同步代码块）
 *
 * @author mc0710
 */
public class SingletonClient5 {

    public static void main(String[] args) {
        System.out.println("懒汉式（线程安全，同步代码块）");
        Singleton5 instanceSingleton5 = Singleton5.getInstance();
        Singleton5 iSingleton5 = Singleton5.getInstance();
        System.out.println(instanceSingleton5 == iSingleton5);
        System.out.println("instance.hashCode = " + instanceSingleton5.hashCode());
        System.out.println("instance2.hashCode = " + iSingleton5.hashCode());
    }
}

class Singleton5 {
    private static Singleton5 instanceSingleton5;

    private Singleton5() {}

    /**
     * 即懒汉式
     * @return
     */
    public static Singleton5 getInstance() {
        if (instanceSingleton5 == null) {
            synchronized (Singleton5.class) {
                instanceSingleton5 = new Singleton5();
            }
        }
        return instanceSingleton5;
    }
}