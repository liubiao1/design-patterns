package com.liubiao.designpatterns.mediator;

/**
 * 中介者模式解决“智能家庭项目”或“租房问题”
 * 中介者的核心思想是，让各个同事Colleague之间0交互，降低耦合度，把同事的信息都交给中介来处理，我这里的同事是只有1个闹钟；
 *
 * @author mc0710
 */
public class Client {

    public static void main(String[] args) {
        // 创建中介者对象
        Mediator mediator = new ConcreteMediator();
        // 创建Alarm并且加入到ConcreteMediator 对象的HashMap
        Alarm alarm = new Alarm(mediator, "Alarm");
        // 闹钟发消息，比如0是响了
        alarm.sendMessage(0);
    }

}
