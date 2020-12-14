package com.liubiao.designpatterns.adapter.interfaceadapter;

/**
 * 将InterfaceAdapter 的方法进行默认实现
 *
 * @author mc0710
 */
public abstract class AbstractAdapter implements DCOutput {


    @Override
    public int operation1() {
        return 0;
    }

    @Override
    public int operation2() {
        return 0;
    }

    @Override
    public int operation3() {
        return 0;
    }
}
