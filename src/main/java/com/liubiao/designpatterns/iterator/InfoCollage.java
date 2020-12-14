package com.liubiao.designpatterns.iterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 信息学院系
 *
 * @author mc0710
 */
public class InfoCollage implements Collage {

    List<Department> departments;

    public InfoCollage() {
        departments = new ArrayList<>();
        addDepartment("网络信息安全", "网络信息安全111");
        addDepartment("电子技术", "电子技术111");
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollageIterator(departments);
    }

    @Override
    public String getName() {
        return "信息学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
       departments.add(department);
    }

}
