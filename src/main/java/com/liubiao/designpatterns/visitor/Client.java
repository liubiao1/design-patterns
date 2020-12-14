package com.liubiao.designpatterns.visitor;

/**
 * 访问者模式解决“歌手投票问题”
 *
 * @author mc0710
 */
public class Client {

    public static void main(String[] args) {

        // 定义投票集合
        ObjectStructure objectStructure = new ObjectStructure();
        // 初始化投票的人
        objectStructure.add(new Man());
        // 动作，到底投的什么票
        Success success = new Success();
        objectStructure.show(success);
//        Fail fail = new Fail();
//        objectStructure.show(fail);
        // TODO 好处显而易见，在人的种类变化时，如增加小孩群体；在投票评价增加时，比如增加一般，都只需要再增加一个类实现继承对应的抽象类即可就行
    }

}
