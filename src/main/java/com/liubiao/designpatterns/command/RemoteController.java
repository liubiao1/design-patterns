package com.liubiao.designpatterns.command;

/**
 * 遥控器
 *
 * @author mc0710
 */
public class RemoteController {

    /**
     * 按钮个数
     */
    private static int num = 5;
    /**
     * 开按钮组
     */
    Command[] onCommands;
    /**
     * 关按钮组
     */
    Command[] offCommands;
    /**
     * 撤销按钮
     */
    Command undoCommand;

    /**
     * 用构造器初始化按钮组
     */
    public RemoteController() {
        onCommands = new Command[num];
        offCommands = new Command[num];
        for (int i = 0; i < num; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }


    /**
     * 设置需要的命令
     *
     * @param no         命令编号
     * @param onCommand  开命令
     * @param offCommand 关命令
     */
    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    /**
     * 按下开按钮
     *
     * @param no 命令编号
     */
    public void onButtonWasPushed(int no) {
        // 找到按下的开的按钮，并执行其对应的方法
        onCommands[no].execute();
        // 记录本次操作，方便撤销
        undoCommand = onCommands[no];
    }

    /**
     * 按下关按钮
     *
     * @param no 命令编号
     */
    public void offButtonWasPushed(int no) {
        // 找到按下的关的按钮，并执行其对应的方法
        offCommands[no].execute();
        // 记录本次操作，方便撤销
        undoCommand = offCommands[no];
    }

    /**
     * 按下撤销按钮
     *
     * @param no 命令编号
     */
    public void undoButtonWasPushed(int no) {
        // 执行记录的撤销方法
        undoCommand.undo();
    }
}
