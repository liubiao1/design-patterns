package com.liubiao.designpatterns.singleton;

/**
 * 枚举
 *
 * @author mc0710
 */
public class SingletonClient8 {

    public static void main(String[] args) {
        System.out.println("枚举");
        Singleton instanceSingleton = Singleton.INSTANCE;
        Singleton iSingleton = Singleton.INSTANCE;
        System.out.println(instanceSingleton == iSingleton);
        System.out.println("instance.hashCode = " + instanceSingleton.hashCode());
        System.out.println("instance2.hashCode = " + iSingleton.hashCode());
        instanceSingleton.sayOk();
    }
}


enum Singleton {
    /**
     * 单例属性
     */
    INSTANCE;

    public void sayOk() {
        System.out.println("ok~");
    }
}