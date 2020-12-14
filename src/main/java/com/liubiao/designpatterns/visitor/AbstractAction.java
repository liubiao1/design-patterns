package com.liubiao.designpatterns.visitor;

/**
 * 测评抽象类
 *
 * @author mc0710
 */
public abstract class AbstractAction {

    /**
     * 得到男性测评
     *
     * @param man 男人
     */
    abstract void getManResult(Man man);

    /**
     * 得到女性测评
     *
     * @param woman 男人
     */
    abstract void getWomanResult(Woman woman);

}
