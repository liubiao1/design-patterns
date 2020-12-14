package com.liubiao.designpatterns.singleton;

/**
 * 双重检查，方法和代码快都用synchronized修饰
 * <p>
 * 实际开发中推荐用这种方式
 * 线程安全；延迟加载；效率较高
 *
 * @author mc0710
 */
public class SingletonClient6 {
    public static void main(String[] args) {
        System.out.println("双重检查");
        Singleton6 instanceSingleton6 = Singleton6.getInstance();
        Singleton6 iSingleton6 = Singleton6.getInstance();
        System.out.println(instanceSingleton6 == iSingleton6);
        System.out.println("instance.hashCode = " + instanceSingleton6.hashCode());
        System.out.println("instance2.hashCode = " + iSingleton6.hashCode());
    }
}

class Singleton6 {
    private static volatile Singleton6 instanceSingleton6;

    private Singleton6() {
    }

    /**
     * 提供一个静态的公有方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题,同时保证效率
     *
     * @return 单例对象
     */
    public static synchronized Singleton6 getInstance() {
        if (instanceSingleton6 == null) {
            synchronized (Singleton6.class) {
                if (instanceSingleton6 == null) {
                    instanceSingleton6 = new Singleton6();
                }
            }
        }
        return instanceSingleton6;
    }
}