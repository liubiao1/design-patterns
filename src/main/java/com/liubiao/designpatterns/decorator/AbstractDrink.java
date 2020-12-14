package com.liubiao.designpatterns.decorator;

import java.math.BigDecimal;

/**
 * @author mc0710
 */
public abstract class AbstractDrink {

    protected String des = "不加任何配料";

    private BigDecimal price = BigDecimal.ZERO;


    /**
     * 具体花费多少由子类实现
     *
     * @return 花费
     */
    abstract BigDecimal cost();

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
