package com.liubiao.designpatterns.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * 中介者具体实现
 *
 * @author mc0710
 */
public class ConcreteMediator extends Mediator {

    private HashMap<String, Colleague> colleagueHashMap;
    private HashMap<String, String> interMap;

    public ConcreteMediator() {
        colleagueHashMap = new HashMap<>();
        this.interMap = new HashMap<>();
    }

    @Override
    void register(String colleagueName, Colleague colleague) {
        colleagueHashMap.put(colleagueName, colleague);
        if (colleague instanceof Alarm) {
            interMap.put("Alarm", colleagueName);
        }
    }

    @Override
    void getMessage(int stateChange, String colleagueName) {
        // 闹钟响了
        if (colleagueHashMap.get(colleagueName) instanceof Alarm) {
            System.out.println("闹钟响了");
        }
    }

    @Override
    void sendMessage() {

    }
}
