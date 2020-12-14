package com.liubiao.designpatterns.iterator;

import java.util.Iterator;

/**
 * 计算机系迭代器
 *
 * @author mc0710
 */
public class ComputerCollageIterator implements Iterator {

    /**
     * 假设计算机系是用数组的方式存储的
     */
    Department[] departments;
    /**
     * 遍历起始位置
     */
    int position = 0;

    /**
     * 得到 departments
     */
    public ComputerCollageIterator(Department[] departments) {
        this.departments = departments;
    }

    /**
     * @return 是否有下一个
     */
    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position = position + 1;
        return department;
    }

    @Override
    public void remove() {

    }

}
