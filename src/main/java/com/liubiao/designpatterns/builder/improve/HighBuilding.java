package com.liubiao.designpatterns.builder.improve;

/**
 * 高楼
 * 
 * @author mc0710
 */
public class HighBuilding extends AbstractHouseBuilder {

    @Override
    void buildBasic() {
        System.out.println("高楼打地基30米");
    }

    @Override
    void buildWalls() {
        System.out.println("高楼砌墙");
    }

    @Override
    void roofed() {
        System.out.println("高楼该屋顶");
    }
    
}
