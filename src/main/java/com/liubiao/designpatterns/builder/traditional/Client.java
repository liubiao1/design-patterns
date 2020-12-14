package com.liubiao.designpatterns.builder.traditional;

/**
 * 盖房子需求传统设计方案客户端
 *
 * @author mc0710
 */
public class Client {

    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();
        HighBuilding highBuilding = new HighBuilding();
        highBuilding.build();
    }
}
