package com.liubiao.designpatterns.organization;

/**
 * 学校，系
 *
 * @author mc0710
 */
public class Department extends OrganizationComponent{

    public Department(String name, String desc) {
        super(name, desc);
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    protected void printf() {
        System.out.println(super.getName());
    }
}
