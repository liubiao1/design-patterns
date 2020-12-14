package com.liubiao.designpatterns.facade;

/**
 * @author mc0710
 */
public class Projector {

    /**
     * 饿汉式
     */
    private static Projector instanceProjector = new Projector();

    public static Projector getInstance() {
        return instanceProjector;
    }

    public void on() {
        System.out.println(" Projector on ");
    }

    public void off() {
        System.out.println(" Projector ff ");
    }

    public void focus() {
        System.out.println(" Projector is focus ");
    }
}
