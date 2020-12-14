package com.liubiao.designpatterns.factory.method;

/**
 * 方法工厂模式解决“手机制造问题”
 * <p>
 * 不同于简单工厂模式的是，不同的手机来自不同的工厂
 *
 * @author mc0710
 */
public class Client {

    public static void main(String[] args) {
        IPhoneFactory xiaoMiFactory = new XiaoMiFactory();
        xiaoMiFactory.make();

        IPhoneFactory huaweiFactory = new HuaweiFactory();
        huaweiFactory.make();
    }

}
