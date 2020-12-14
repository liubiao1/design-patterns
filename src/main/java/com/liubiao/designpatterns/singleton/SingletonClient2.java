package com.liubiao.designpatterns.singleton;

/**
 * 饿汉式（静态代码块）
 *
 * @author mc0710
 */
public class SingletonClient2 {
    public static void main(String[] args) {
        // 测试
        Singleton2 instanceSingleton2 = Singleton2.getSingleton2();
        Singleton2 instance2 = Singleton2.getSingleton2();
        System.out.println(instanceSingleton2 == instance2);
        System.out.println("instance.hashCode = " + instanceSingleton2.hashCode());
        System.out.println("instance2.hashCode = " + instance2.hashCode());
    }

}

class Singleton2 {
    /**
     * 1. 构造器私有化，外部不能new
     */
    private Singleton2() {
    }

    /**
     * 2. 本类内部创建对象实例
     */
    private static Singleton2 instance;

    static {
        // 在静态代码块中，创建单例对象
        instance = new Singleton2();
    }

    /**
     * 3. 提供一个公有的静态方法，返回实例对象
     *
     * @return
     */
    public static Singleton2 getSingleton2() {
        return instance;
    }


}
