package com.liubiao.designpatterns.state;

/**
 * 状态模式解决“APP抽奖活动”问题
 *
 * @author mc0710
 */
public class Client {

    public static void main(String[] args) {
        // 初始化奖品数量
        RaffleActivity activity = new RaffleActivity(10);
        for (int i = 0; i < 200; i++) {
            System.out.println("第" + (i + 1) + "次抽奖 *********");
            activity.deduceMoney();
            activity.raffle();
            System.out.println("剩余奖品数量：" + activity.getCount());
        }
    }

}
