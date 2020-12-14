package com.liubiao.designpatterns.command;

/**
 * 空命令  空执行，目的在于初始化每个按钮，避免了空判断
 *
 * @author mc0710
 */
public class NoCommand implements Command {

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
