package com.liubiao.designpatterns.singleton;

/**
 * 饿汉式（静态常量）
 *
 * @author mc0710
 */
public class SingletonClient1 {
    public static void main(String[] args) {
        Singleton1 instance = Singleton1.getInstance();
        Singleton1 instance1 = Singleton1.getInstance();
        System.out.println(instance == instance1);
    }
}

class Singleton1 {
    /**
     * 1.构造器私有，只能让本类使用
     */
    private Singleton1() {

    }

    /**
     * 2. 本类内部创建对象实例
     */
    private final static Singleton1 instance = new Singleton1();

    /**
     * 3. 提供一个公有的静态方法，返回实例对象
     *
     * @return 单例对象
     */
    public static Singleton1 getInstance() {
        return instance;
    }
}
