package com.liubiao.designpatterns.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * 学院集合输出类
 *
 * @author mc0710
 */
public class OutPutImpl {

    List<Collage> collages;

    public OutPutImpl(List<Collage> collages) {
        this.collages = collages;
    }

    public void printCollage() {
        // 取出所有学院
        Iterator<Collage> collageIterator = collages.iterator();
        while (collageIterator.hasNext()) {
            Collage collage = collageIterator.next();
            System.out.println("学院名为：" + collage.getName());
            // 得到迭代器，学院对应的系
            printDepartment(collage.createIterator());
        }
    }

    /**
     * 输出系
     */
    public void printDepartment(Iterator iterator) {
        while (iterator.hasNext()) {
            Department department = (Department) iterator.next();
            System.out.println(department.getName());
        }
    }
}
