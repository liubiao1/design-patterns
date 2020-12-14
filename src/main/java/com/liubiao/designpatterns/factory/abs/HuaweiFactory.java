package com.liubiao.designpatterns.factory.abs;

import com.liubiao.designpatterns.factory.easy.Huawei;
import com.liubiao.designpatterns.factory.easy.Phone;

/**
 * 华为制造工厂，既能制造手机，也能制造PC
 */
public class HuaweiFactory implements IFactory {
    @Override
    public Phone makePhone() {
        return new Huawei();
    }

    @Override
    public IPc makePc() {
        return new HuaweiPc();
    }
}
