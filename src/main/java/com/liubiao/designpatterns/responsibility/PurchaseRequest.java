package com.liubiao.designpatterns.responsibility;

import java.math.BigDecimal;

/**
 * 审批请求
 *
 * @author mc0710
 */
public class PurchaseRequest {

    private int type = 0;

    private BigDecimal price = BigDecimal.ZERO;

    private int id = 0;

    public PurchaseRequest(int type, BigDecimal price, int id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
