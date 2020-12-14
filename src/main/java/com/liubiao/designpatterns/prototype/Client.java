package com.liubiao.designpatterns.prototype;

/**
 * 原型模式解决克隆羊问题
 *
 * @author mc0710
 */
public class Client {

    public static void main(String[] args) {
        Sheep sheep = new Sheep("Tom", 1, "白色");
        Object object = sheep.clone();
        System.out.println(object);
    }
}
