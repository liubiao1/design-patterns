package com.liubiao.designpatterns.organization;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mc0710
 */
public class University extends OrganizationComponent {

    public University(String name, String desc) {
        super(name, desc);
    }

    private List<OrganizationComponent> organizationComponents = new ArrayList<>();

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
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
        System.out.println("~~~~~~~~~~~" + getName() + "~~~~~~~~~~~");
        for (OrganizationComponent o : organizationComponents) {
            o.printf();
        }
    }


}
