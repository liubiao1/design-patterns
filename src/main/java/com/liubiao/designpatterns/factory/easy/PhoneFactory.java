package com.liubiao.designpatterns.factory.easy;

/**
 * 工厂类（Factory）,简单工厂模式的工厂类负责生产 所有产品
 *
 * @author mc0710
 */
public class PhoneFactory {

    public Phone makePhone(String phoneType) {
        if ("xiaomi".equalsIgnoreCase(phoneType)) {
            return new XiaoMi();
        }
        return new Huawei();
    }

}
