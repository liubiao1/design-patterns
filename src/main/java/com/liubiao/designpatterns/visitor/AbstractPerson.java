package com.liubiao.designpatterns.visitor;

/**
 * 人抽象类
 *
 * @author mc0710
 */
public abstract class AbstractPerson {

    /**
     * 人的动作
     *
     * @param action 动作
     */
    abstract void accept(AbstractAction action);

}
