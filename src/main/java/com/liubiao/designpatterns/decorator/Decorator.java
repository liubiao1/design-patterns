package com.liubiao.designpatterns.decorator;

import java.math.BigDecimal;

/**
 * 装饰者
 *
 * @author mc0710
 */
public class Decorator extends AbstractDrink {

    AbstractDrink abstractDrink;

    public Decorator(AbstractDrink abstractDrink) {
        this.abstractDrink = abstractDrink;
    }


    @Override
    BigDecimal cost() {
        // 自己价格（配料） + 饮品价格
        return super.getPrice().add(abstractDrink.cost());
    }

    @Override
    public String getDes() {
        // 配料的价格，饮品的信息
        return des + " " + getPrice() + " && " + abstractDrink.getDes();
    }
}
