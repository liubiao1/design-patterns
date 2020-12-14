package com.liubiao.designpatterns.prototype;

/**
 * 原型接口，只有一个克隆方法
 *
 * @author mc0710
 */
@FunctionalInterface
public interface Prototype {

    /**
     * 克隆方法
     */
    Object clone();

}
