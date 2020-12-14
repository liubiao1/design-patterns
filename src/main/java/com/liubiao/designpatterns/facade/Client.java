package com.liubiao.designpatterns.facade;

/**
 * 用外观模式解决“家庭影院”问题
 *
 * @author mc0710
 */
public class Client {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();
    }

}
