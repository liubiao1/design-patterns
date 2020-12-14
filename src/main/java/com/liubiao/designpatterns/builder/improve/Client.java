package com.liubiao.designpatterns.builder.improve;

/**
 * 建造者模式解决盖房子问题
 *
 * @author mc0710
 */
public class Client {

    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        // 建房子
        House house = houseDirector.constructHouse();

    }

}
