package com.liubiao.designpatterns.interpreter;

import java.util.HashMap;

/**
 * 变量解释器,对应a,b,c
 *
 * @author mc0710
 */
public class VarExpression extends AbstractExpression {

    private String key;


    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    int interpreter(HashMap<String, Integer> val) {
        return val.get(key);
    }
}
