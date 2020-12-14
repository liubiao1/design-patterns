package com.liubiao.designpatterns.mediator;

/**
 * 闹钟
 *
 * @author mc0710
 */
public class Alarm extends Colleague {

    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        // 建立Alarm和中介对应的关系
        mediator.register(name, this);
    }

    @Override
    void sendMessage(int stateChane) {
        this.getMediator().getMessage(stateChane, this.name);
    }

    void sendAlarm(int stateChane) {
        sendMessage(stateChane);
    }
}
