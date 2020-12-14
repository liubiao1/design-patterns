package com.liubiao.designpatterns.template;

/**
 * 抽象豆浆类
 *
 * @author mc0710
 */
public abstract class AbstractSoyMilk {

    /**
     * 制作方法
     */
    final void make() {
        select();
        addBurden();
        soak();
        beat();
    }


    /**
     * 选材料
     */
    void select() {
        System.out.println("第一步：选新鲜的黄豆");
    }

    /**
     * 添加配料 （因为配料是不同的，所以做成抽象的，让子类去实现）
     */
    abstract void addBurden();

    /**
     * 浸泡
     */
    void soak() {
        System.out.println("第三步：黄豆和配料一起浸泡一段时间");
    }

    /**
     * 放到豆浆机打碎
     */
    void beat() {
        System.out.println("第四部：放到豆浆机打碎");
    }

    /**
     * 是否添加配料 （钩子方法来实现不加配料，制作纯豆浆）
     *
     * @return 是 true
     */
    boolean whetherToAddIngredients() {
        return true;
    }
}
