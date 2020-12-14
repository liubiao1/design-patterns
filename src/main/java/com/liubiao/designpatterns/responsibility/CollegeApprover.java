package com.liubiao.designpatterns.responsibility;

import java.math.BigDecimal;

/**
 * @author mc0710
 */
public class CollegeApprover extends Approver {

    private BigDecimal min = BigDecimal.valueOf(5000L);
    private BigDecimal max = BigDecimal.valueOf(10000L);

    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    boolean processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice().compareTo(min) == 1 && purchaseRequest.getPrice().compareTo(max) != 1) {
            System.out.println(purchaseRequest.getPrice() + "元，由教学主任审批通过");
            return true;
        } else {
            // 处理不了，给下个处理者处理
            approver.processRequest(purchaseRequest);
            return false;
        }
    }
}
