package com.liubiao.designpatterns.template;

/**
 * 模板方法模式解决制作豆浆问题
 *
 * @author mc0710
 */
public class Client {

    public static void main(String[] args) {
        // 制作花生豆浆
        PeanutBeanSoyMilk peanutBeanSoyMilk = new PeanutBeanSoyMilk();
        peanutBeanSoyMilk.make();

        // 制作红豆豆浆
        RedBeanSoyMilk redBeanSoyMilk = new RedBeanSoyMilk();
        redBeanSoyMilk.make();

        System.out.println("利用钩子方法，制作纯豆浆");
        BeanSoyMilk beanSoyMilk = new BeanSoyMilk();
        beanSoyMilk.make();
    }

}
