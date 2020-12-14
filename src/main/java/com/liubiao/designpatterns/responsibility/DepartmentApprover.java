package com.liubiao.designpatterns.responsibility;

import java.math.BigDecimal;

/**
 * @author mc0710
 */
public class DepartmentApprover extends Approver {

    private BigDecimal max = BigDecimal.valueOf(5000L);

    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    boolean processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice().compareTo(max) != 1) {
            System.out.println(purchaseRequest.getPrice() + "元，由院长审批通过");
            return true;
        } else {
            // 处理不了，给下个处理者处理
            approver.processRequest(purchaseRequest);
            return false;
        }
    }
}
