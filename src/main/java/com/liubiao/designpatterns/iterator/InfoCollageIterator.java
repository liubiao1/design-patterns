package com.liubiao.designpatterns.iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 信息工程学院
 *
 * @author mc0710
 */
public class InfoCollageIterator implements Iterator {

    /**
     * 假设信息工程学院是用List存放
     */
    List<Department> departments;
    /**
     * 遍历位置
     */
    int index = -1;

    public InfoCollageIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (index >= departments.size() - 1) {
            return false;
        }
        index = index + 1;
        return true;
    }

    /**
     * 因为得到next()值的时候， 都会先判断hasNext()，而hasNext()已经加1了
     */
    @Override
    public Object next() {
        return departments.get(index);
    }

    @Override
    public void remove() {

    }

}
