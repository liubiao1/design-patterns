package com.liubiao.designpatterns.interpreter;

import java.util.HashMap;

/**
 * 抽象类表达式
 *
 * @author mc0710
 */
public abstract class AbstractExpression {

    /**
     * 如a + b + c
     *
     * @param val key是变量，比如a,b,c;value是变量对应的值，比如a=1,b=2.c=3
     * @return 结果
     */
    abstract int interpreter(HashMap<String, Integer> val);

}
