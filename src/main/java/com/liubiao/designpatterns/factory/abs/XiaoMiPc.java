package com.liubiao.designpatterns.factory.abs;

/**
 * 小米的电脑产品
 *
 * @author mc0710
 */
public class XiaoMiPc implements IPc {

    public XiaoMiPc() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("小米制造的电脑产品");
    }
}
