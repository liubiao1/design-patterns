package com.liubiao.designpatterns.decorator;

import java.math.BigDecimal;

public class ShortBlack extends Coffee {

    @Override
    BigDecimal cost() {
        return BigDecimal.valueOf(10);
    }
}
