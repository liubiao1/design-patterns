package com.liubiao.designpatterns.decorator;

import java.math.BigDecimal;

public class Coffee extends AbstractDrink {

    @Override
    BigDecimal cost() {
        return super.getPrice();
    }
}
