package com.liubiao.designpatterns.interpreter;

import java.util.HashMap;

/**
 * 减法解释器
 *
 * @author mc0710
 */
public class SubExpression extends SymbolExpression {

    public SubExpression(AbstractExpression left, AbstractExpression right) {
        super(left, right);
    }

    @Override
    int interpreter(HashMap<String, Integer> val) {
        return super.left.interpreter(val) - super.left.interpreter(val);
    }
}
