package com.liubiao.designpatterns.observer;


/**
 * @author mc0710
 */
public interface Subject {

    /**
     * 注册
     *
     * @param o 观察者
     */
    void registerObserver(Observer o);

    /**
     * 移除
     *
     * @param o 观察者
     */
    void removeObserver(Observer o);

    /**
     * 通知
     */
    void notifyObserver();

}
