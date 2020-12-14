package com.liubiao.designpatterns.interpreter;

import java.util.HashMap;

/**
 * 加法解释器
 *
 * @author mc0710
 */
public class AddExpression extends SymbolExpression {

    public AddExpression(AbstractExpression left, AbstractExpression right) {
        super(left, right);
    }

    @Override
    int interpreter(HashMap<String, Integer> val) {
        return super.left.interpreter(val) + super.right.interpreter(val);
    }
}
