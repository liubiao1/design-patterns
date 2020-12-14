package com.liubiao.designpatterns.factory.abs;

import com.liubiao.designpatterns.factory.easy.Phone;
import com.liubiao.designpatterns.factory.easy.XiaoMi;

/**
 * 小米制造工厂，既能制造手机，也能制造PC
 */
public class XiaoMiFactory implements IFactory {
    @Override
    public Phone makePhone() {
        return new XiaoMi();
    }

    @Override
    public IPc makePc() {
        return new XiaoMiPc();
    }
}
