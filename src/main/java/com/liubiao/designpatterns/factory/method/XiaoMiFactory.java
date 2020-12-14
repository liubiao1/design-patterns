package com.liubiao.designpatterns.factory.method;

import com.liubiao.designpatterns.factory.easy.Phone;
import com.liubiao.designpatterns.factory.easy.XiaoMi;

/**
 * 小米手机工厂
 *
 * @author mc0710
 */
public class XiaoMiFactory implements IPhoneFactory {
    @Override
    public Phone make() {
        return new XiaoMi();
    }
}
