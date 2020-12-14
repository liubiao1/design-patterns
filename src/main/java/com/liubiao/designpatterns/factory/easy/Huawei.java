package com.liubiao.designpatterns.factory.easy;

/**
 * 产品，华为手机
 *
 * @author mc0710
 */
public class Huawei implements Phone {

    public Huawei() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("制造华为手机");
    }
}
