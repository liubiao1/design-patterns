package com.liubiao.designpatterns.mediator;

/**
 * @author mc0710
 */
public abstract class Colleague {

    private Mediator mediator;
    public String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    /**
     * 像中介发消息，核心方法
     *
     * @param stateChane 状态
     */
    abstract void sendMessage(int stateChane);

    /**
     * 得到同事对应的中介
     *
     * @return 得到中介
     */
    Mediator getMediator() {
        return this.mediator;
    }

}
