package com.liubiao.designpatterns.bridge;

/**
 * 折叠手机
 *
 * @author mc0710
 */
public class FoldedPhone extends Phone {

    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    void call() {
        super.call();
        System.out.println("折叠手机");
    }

    @Override
    void open() {
        super.open();
        System.out.println("折叠手机");
    }

    @Override
    void close() {
        super.close();
        System.out.println("折叠手机");
    }
}
