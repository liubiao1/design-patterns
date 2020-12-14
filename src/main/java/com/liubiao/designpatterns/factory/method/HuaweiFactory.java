package com.liubiao.designpatterns.factory.method;

import com.liubiao.designpatterns.factory.easy.Huawei;
import com.liubiao.designpatterns.factory.easy.Phone;

/**
 * 华为手机工厂
 *
 * @author mc0710
 */
public class HuaweiFactory implements IPhoneFactory {
    @Override
    public Phone make() {
        return new Huawei();
    }
}
