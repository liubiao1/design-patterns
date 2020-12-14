package com.liubiao.designpatterns.memento;

/**
 * 需要保存状态的对象
 *
 * @author mc0710
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateToMemento(Memento memento) {
        state = memento.getState();
    }

}
