package com.liubiao.designpatterns.memento;

/**
 * 备忘录模式解决“角色打怪状态变化后，在打怪结束恢复到某个状态” 的问题
 *
 * @author mc0710
 */
public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("打怪前：攻击力100，防御力100");
        caretaker.add(originator.saveStateToMemento());
        originator.setState("打怪中，攻击力80，防御力80");
        caretaker.add(originator.saveStateToMemento());
        originator.setState("打怪完，攻击力60，防御力80");
        caretaker.add(originator.saveStateToMemento());
        System.out.println("当前状态：" + originator.getState());
        System.out.println("恢复打怪前状态：" + caretaker
                .getMemento(0).getState());
    }

}
