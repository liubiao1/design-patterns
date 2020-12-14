package com.liubiao.designpatterns.organization;

import java.util.ArrayList;
import java.util.List;

/**
 * 学校，学院
 *
 * @author mc0710
 */
public class College extends OrganizationComponent {

    private List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public College(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponent.remove(organizationComponent);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }

    @Override
    protected void printf() {
        System.out.println("~~~~~~~" + getName() + "~~~~~~~");
        for (OrganizationComponent o : organizationComponents) {
            o.printf();
        }
    }
}
