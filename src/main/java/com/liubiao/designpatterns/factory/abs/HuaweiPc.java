package com.liubiao.designpatterns.factory.abs;

/**
 * 产品，华为PC
 *
 * @author mc0710
 */
public class HuaweiPc implements IPc {

    public HuaweiPc() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("华为制造的PC");
    }
}
