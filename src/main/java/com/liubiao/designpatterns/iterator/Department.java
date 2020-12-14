package com.liubiao.designpatterns.iterator;

/**
 * 系，计算机系，土木工程系等
 *
 * @author mc0710
 */
public class Department {

    private String name;

    private String desc;

    public Department(String name, String desc) {
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
}
