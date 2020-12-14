package com.liubiao.designpatterns.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 守护着对象，负责保存多个备忘录对象
 *
 * @author mc0710
 */
public class Caretaker {

    private List<Memento> mementos = new ArrayList<>();

    public void add(Memento memento) {
        mementos.add(memento);
    }

    public Memento getMemento(int index) {
        return mementos.get(index);
    }

}
