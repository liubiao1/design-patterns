package com.liubiao.designpatterns.builder.improve;

/**
 * 抽象建造房子
 *
 * @author mc0710
 */
public abstract class AbstractHouseBuilder {

    /**
     * 打地基
     */
    abstract void buildBasic();

    /**
     * 砌墙
     */
    abstract void buildWalls();

    /**
     * 盖屋顶
     */
    abstract void roofed();

    /**
     * 建造,具体实现交给了子类
     */
    House build() {
        return new House();
    }
}
