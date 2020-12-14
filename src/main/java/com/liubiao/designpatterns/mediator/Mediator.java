package com.liubiao.designpatterns.mediator;

/**
 * 中介者
 *
 * @author mc0710
 */
public abstract class Mediator {

    /**
     * 将同事放入到中介者中
     *
     * @param colleagueName 同事名
     * @param colleague     同事类
     */
    abstract void register(String colleagueName, Colleague colleague);


    /**
     * 得到信息
     *
     * @param stateChange   状态
     * @param colleagueName 同事名
     */
    abstract void getMessage(int stateChange, String colleagueName);

    /**
     * 发送消息
     */
    abstract void sendMessage();

}
