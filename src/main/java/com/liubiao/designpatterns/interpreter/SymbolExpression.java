package com.liubiao.designpatterns.interpreter;

import java.util.HashMap;

/**
 * 抽象运算符号解释器
 * *** 每个运算符号都和其左右2个数字有关系
 *
 * @author mc0710
 */
public class SymbolExpression extends AbstractExpression {

    protected AbstractExpression left;
    protected AbstractExpression right;

    public SymbolExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }


    /**
     * 由子类实现，这只是个默认实现
     *
     * @param val key是变量，比如a,b,c;value是变量对应的值，比如a=1,b=2.c=3
     * @return 默认实现
     */
    @Override
    int interpreter(HashMap<String, Integer> val) {
        return 0;
    }
}
