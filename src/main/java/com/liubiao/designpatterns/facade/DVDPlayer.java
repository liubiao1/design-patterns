package com.liubiao.designpatterns.facade;

/**
 * @author mc0710
 */
public class DVDPlayer {

    /**
     * 饿汉式
     */
    private static DVDPlayer instanceDvdPlayer = new DVDPlayer();

    public static DVDPlayer getInstance() {
        return instanceDvdPlayer;
    }

    public void on() {
        System.out.println(" dvd on ");
    }

    public void off() {
        System.out.println(" dvd off ");
    }

    public void play() {
        System.out.println(" dvd is playing ");
    }

}
