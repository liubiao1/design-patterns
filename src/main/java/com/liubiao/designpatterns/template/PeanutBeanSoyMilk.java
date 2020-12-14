package com.liubiao.designpatterns.template;

/**
 * 花生豆浆
 *
 * @author mc0710
 */
public class PeanutBeanSoyMilk extends AbstractSoyMilk {
    @Override
    void addBurden() {
        System.out.println("第二步：加入上号的花生");
    }
}
