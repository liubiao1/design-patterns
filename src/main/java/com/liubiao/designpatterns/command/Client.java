package com.liubiao.designpatterns.command;

/**
 * 命令模式解决智能生活问题
 *
 * @author mc0710
 */
public class Client {

    public static void main(String[] args) {
        // 创建执行者
        LightReceiver lightReceiver = new LightReceiver();
        // 创建命令, 开电灯
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        // 创建命令, 关电灯
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        // 创建执行者
        RemoteController remoteController = new RemoteController();
        // 第一排是电灯按钮命令组
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);
        // 第二排是电视机按钮组  。。。
        // TODO 可见扩展时遥控器是不用动的，符合开闭原则。 只需要创建 TV执行者和TV命令组（开关）
        // 开灯
        remoteController.onButtonWasPushed(0);
        // 关灯
        remoteController.offButtonWasPushed(0);
        // 撤销
        remoteController.undoButtonWasPushed(0);
    }

}
