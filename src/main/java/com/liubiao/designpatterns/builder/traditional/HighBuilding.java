package com.liubiao.designpatterns.builder.traditional;

/**
 * 高楼
 * 
 * @author mc0710
 */
public class HighBuilding extends AbstractHouse{

    @Override
    void buildBasic() {
        System.out.println("高楼打地基");
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
