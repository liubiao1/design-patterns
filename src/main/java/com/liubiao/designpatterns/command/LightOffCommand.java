package com.liubiao.designpatterns.command;

/**
 * 关灯
 *
 * @author mc0710
 */
public class LightOffCommand implements Command {

    private LightReceiver lightReceiver;

    /**
     * 用构造器来讲 lightReceiver 聚合到当前类中
     *
     * @param lightReceiver 电灯执行者
     */
    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.off();
    }

    @Override
    public void undo() {
        lightReceiver.on();
    }
}
