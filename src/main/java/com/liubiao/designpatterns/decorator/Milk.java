package com.liubiao.designpatterns.decorator;

import java.math.BigDecimal;

/**
 * 配料，牛奶
 *
 * @author mc0710
 */
public class Milk extends Decorator {

    public Milk(AbstractDrink abstractDrink) {
        super(abstractDrink);
        setDes("加一份牛奶");
        setPrice(BigDecimal.valueOf(20));
    }

}
