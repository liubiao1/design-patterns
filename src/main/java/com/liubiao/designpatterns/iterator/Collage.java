package com.liubiao.designpatterns.iterator;

import java.util.Iterator;

/**
 * 学院接口
 *
 * @author mc0710
 */
public interface Collage {

    /**
     * 创建一个迭代器
     *
     * @return 返回一个迭代器
     */
    Iterator createIterator();


    /**
     * 得到学院名
     *
     * @return 学院名
     */
    String getName();

    /**
     * 增加系信息
     *
     * @param name 系名
     * @param desc 系描述
     */
    void addDepartment(String name, String desc);

}
