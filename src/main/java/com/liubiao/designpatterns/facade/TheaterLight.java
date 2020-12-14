package com.liubiao.designpatterns.facade;

/**
 *
 * @author mc0710
 */
public class TheaterLight {

    /**
     * 饿汉式
     * */
    private static TheaterLight instanceLight = new TheaterLight();

    public static TheaterLight geTheaterLight() {
        return instanceLight;
    }


    public void on() {
        System.out.println(" TheaterLight on ");
    }

    public void off() {
        System.out.println(" TheaterLight off ");
    }

    public void dim() {
        System.out.println(" TheaterLight dim ");
    }

    public void bright() {
        System.out.println(" TheaterLight bright ");
    }

}
