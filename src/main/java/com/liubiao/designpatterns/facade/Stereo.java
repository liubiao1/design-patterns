package com.liubiao.designpatterns.facade;

/**
 * @author mc0710
 */
public class Stereo {

    /**
     * 饿汉式
     */
    private static Stereo instanceStereo = new Stereo();

    public static Stereo getStereo() {
        return instanceStereo;
    }

    public void on() {
        System.out.println(" Stereo on ");
    }

    public void off() {
        System.out.println(" Stereo off ");
    }

    public void up() {
        System.out.println(" Screen up .. ");
    }

}
