package com.liubiao.designpatterns.builder.traditional;

/**
 * 建房子抽象类
 *
 * @author mc0710
 */
public abstract class AbstractHouse {

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
    void build() {
        buildBasic();
        buildWalls();
        roofed();
    }

}
