package com.liubiao.designpatterns.memento;

/**
 * 备忘录对象，负责保存好记录，即Originator内部状态
 *
 * @author mc0710
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
