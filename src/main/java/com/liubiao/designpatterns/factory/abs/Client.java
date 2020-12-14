package com.liubiao.designpatterns.factory.abs;

/**
 * 抽象工厂模式解决“手机制造，PC制造等不通产品的问题”
 * <p>
 * 与方法工厂模式不同的是，每个工厂可以制造多个产品，不单单是手机
 *
 * @author mc0710
 */
public class Client {

    public static void main(String[] args) {
        IFactory xiaoMi = new XiaoMiFactory();
        xiaoMi.makePc();
        xiaoMi.makePhone();
        IFactory huawei = new HuaweiFactory();
        huawei.makePhone();
        huawei.makePc();
    }

}
