package com.liubiao.designpatterns.responsibility;

import java.math.BigDecimal;

/**
 * 用责任链模式解决“校园OA系统审批问题”
 *
 * @author mc0710
 */
public class Client {

    public static void main(String[] args) {
        PurchaseRequest request = new PurchaseRequest(0, BigDecimal.valueOf(100000L), 1);
        Approver departmentApprover = new DepartmentApprover("刘主任");
        Approver collegeApprover = new CollegeApprover("赵院长");
        Approver viceSchoolMasterApprover = new ViceSchoolMasterApprover("张副校长");
        Approver schoolMasterApprover = new SchoolMasterApprover("李校长");
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);
        departmentApprover.processRequest(request);
    }

}
