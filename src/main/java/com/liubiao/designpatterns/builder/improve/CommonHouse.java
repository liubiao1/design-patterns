package com.liubiao.designpatterns.builder.improve;

/**
 * 普通房子
 *
 * @author mc0710
 */
public class CommonHouse extends AbstractHouseBuilder{
    @Override
    void buildBasic() {
        System.out.println("普通房子打地基2米");
    }

    @Override
    void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    void roofed() {
        System.out.println("普通房子该屋顶");
    }

}
