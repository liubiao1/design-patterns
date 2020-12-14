package com.liubiao.designpatterns.bridge;

/**
 * 翻盖手机
 *
 * @author mc0710
 */
public class UpRightPhone extends Phone {

    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    void call() {
        super.call();
        System.out.println("翻盖手机");
    }

    @Override
    void open() {
        super.open();
        System.out.println("翻盖手机");
    }

    @Override
    void close() {
        super.close();
        System.out.println("翻盖手机");
    }
}
