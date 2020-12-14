package com.liubiao.designpatterns.template;

/**
 * 制作纯豆浆，就是不加配料
 *
 * @author mc0710
 */
public class BeanSoyMilk extends AbstractSoyMilk {

    @Override
    void addBurden() {
        // 纯豆浆，啥都不加
    }

    /**
     * 重写钩子方法，实现不加任何配料
     *
     * @return false 不加配料
     */
    @Override
    boolean whetherToAddIngredients() {
        return false;
    }
}
