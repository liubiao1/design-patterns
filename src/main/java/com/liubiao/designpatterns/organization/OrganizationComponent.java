package com.liubiao.designpatterns.organization;

/**
 * Component
 *
 * @author mc0710
 */
public abstract class OrganizationComponent {

    private String name;

    private String desc;

    protected void add(OrganizationComponent organizationComponent) {

    }

    protected void remove(OrganizationComponent organizationComponent) {

    }

    public OrganizationComponent(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 打印，子类自己实现
     */
    protected abstract void printf();

}
