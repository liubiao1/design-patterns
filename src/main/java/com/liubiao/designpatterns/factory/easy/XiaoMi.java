package com.liubiao.designpatterns.factory.easy;

/**
 * 产品，小米手机
 *
 * @author mc0710
 */
public class XiaoMi implements Phone {

    public XiaoMi() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("制造小米手机");
    }
}
