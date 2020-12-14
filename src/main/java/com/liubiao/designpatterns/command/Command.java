package com.liubiao.designpatterns.command;

/**
 * 创建命令接口
 *
 * @author mc0710
 */
public interface Command {

    /**
     * 执行
     */
    void execute();

    /**
     * 撤销命令，命令模式必须要支持撤销
     */
    void undo();
}
