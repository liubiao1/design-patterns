package com.liubiao.designpatterns.facade;

/**
 * @author mc0710
 */
public class Screen {

    /**
     * 饿汉式
     */
    private static Screen instanceScreen = new Screen();

    public static Screen getInstance() {
        return instanceScreen;
    }

    public void up() {
        System.out.println(" Screen up ");
    }

    public void down() {
        System.out.println(" Screen down ");
    }

}
