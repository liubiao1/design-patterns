package com.liubiao.designpatterns.singleton;

/**
 * 静态内部类
 * <p>
 * 推荐使用：
 * 采用了类装载的机制来保证初始化实例时只有一个线程；
 * 类的静态属性只会在第一次加载类的时候初始化；
 * 避免了线程不安全，利用静态内部类特点实现延迟加载，效率高
 *
 * @author mc0710
 */
public class SingletonClient7 {

    public static void main(String[] args) {
        System.out.println("静态内部类");
        Singleton7 instanceSingleton7 = Singleton7.getInstance();
        Singleton7 iSingleton7 = Singleton7.getInstance();
        System.out.println(instanceSingleton7 == iSingleton7);
        System.out.println("instance.hashCode = " + instanceSingleton7.hashCode());
        System.out.println("instance2.hashCode = " + iSingleton7.hashCode());
    }
}

class Singleton7 {

    /**
     * 构造器私有化
     */
    private Singleton7() {
    }

    /**
     * 写一个静态内部类，该类中有一个静态属性 Singleton7
     */
    private static class Singleton7Instance {
        private static final Singleton7 INSTANCE = new Singleton7();
    }

    /**
     * 提供一个静态的公有方法，直接返回Singleton7Instance.INSTANCE
     *
     * @return 单例对象
     */
    public static synchronized Singleton7 getInstance() {
        return Singleton7Instance.INSTANCE;
    }
}