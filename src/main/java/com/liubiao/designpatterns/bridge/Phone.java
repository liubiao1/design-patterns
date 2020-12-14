package com.liubiao.designpatterns.bridge;

/**
 * 手机 (桥接类)
 *
 * @author mc0710
 */
public abstract class Phone {

    /**
     * 将品牌接口聚合
     */
    Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    void open() {
        this.brand.open();
    }

    void close() {
        this.brand.open();
    }

    void call() {
        this.brand.open();
    }
}
