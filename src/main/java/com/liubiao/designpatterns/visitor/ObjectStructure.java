package com.liubiao.designpatterns.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @author mc0710
 */
public class ObjectStructure {

    /**
     * 存储已投票的人
     */
    private List<AbstractPerson> persons = new LinkedList<>();

    /**
     * 投票
     *
     * @param person 人
     */
    void add(AbstractPerson person) {
        persons.add(person);
    }

    /**
     * 删除
     *
     * @param person 人
     */
    void remove(AbstractPerson person) {
        persons.remove(person);
    }

    /**
     * 显示所有投票结果
     *
     * @param action 动作
     */
    void show(AbstractAction action) {
        for (AbstractPerson person : persons) {
            person.accept(action);
        }
    }
}
