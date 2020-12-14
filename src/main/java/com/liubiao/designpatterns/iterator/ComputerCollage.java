package com.liubiao.designpatterns.iterator;


import java.util.Iterator;

/**
 * 计算机系
 *
 * @author mc0710
 */
public class ComputerCollage implements Collage {

    Department[] departments;
    /**
     * 保存个数
     */
    int num = 0;

    public ComputerCollage() {
        departments = new Department[3];
        addDepartment("java工程师", "java");
        addDepartment("IOS工程师", "IOS");
        addDepartment("安卓工程师", "安卓");
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollageIterator(departments);
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[num] = department;
        num += 1;
    }

}
