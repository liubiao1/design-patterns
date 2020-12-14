package com.liubiao.designpatterns.bridge;

/**
 * 手机品牌
 *
 * @author mc0710
 */
public interface Brand {

    /**
     * 开机
     */
    void open();

    /**
     * 关机
     */
    void close();

    /**
     * 打电话
     */
    void call();

}
