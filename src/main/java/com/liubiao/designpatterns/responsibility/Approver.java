package com.liubiao.designpatterns.responsibility;

/**
 * 请求处理者抽象类
 *
 * @author mc0710
 */
public abstract class Approver {

    /**
     * 下一个处理者，当前处理者处理不了时，需要传给下个处理者处理
     */
    Approver approver;

    private String name;

    public Approver(String name) {
        super();
        this.name = name;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    public String getName() {
        return name;
    }


    /**
     * 请求的具体处理交给对应的处理者
     *
     * @param purchaseRequest 审批请求
     */
    abstract boolean processRequest(PurchaseRequest purchaseRequest);
}
