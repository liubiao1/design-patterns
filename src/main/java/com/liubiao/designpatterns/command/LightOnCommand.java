package com.liubiao.designpatterns.command;

/**
 * 开点灯命令
 *
 * @author mc0710
 */
public class LightOnCommand implements Command {

    private LightReceiver lightReceiver;


    /**
     * 用构造器来讲 lightReceiver 聚合到当前类中
     *
     * @param lightReceiver 电灯执行者
     */
    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        // 具体是开灯还是关灯，根据业务逻辑来
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
