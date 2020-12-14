package com.liubiao.designpatterns.template;

/**
 * 红豆豆浆
 *
 * @author mc0710
 */
public class RedBeanSoyMilk extends AbstractSoyMilk{
    @Override
    void addBurden() {
        System.out.println("第二步：加入新鲜的红豆");
    }
}
