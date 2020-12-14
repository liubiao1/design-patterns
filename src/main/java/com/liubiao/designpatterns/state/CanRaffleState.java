package com.liubiao.designpatterns.state;

import java.util.Random;

/**
 * 能抽奖状态
 *
 * @author mc0710
 */
public class CanRaffleState implements State {

    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("您已经扣除了积分，不用再扣，可直接抽奖");
    }

    @Override
    public boolean raffle() {
        System.out.println("正在抽奖中");
        Random random = new Random();
        int i = random.nextInt(10);
        if (i == 0) {
            // 中奖了，将状态改为可发放的状态
            activity.setState(activity.getDispenseState());
            return true;
        } else {
            // 没中奖，吧状态改为不可抽奖状态
            activity.setState(activity.getNoRaffleState());
            return false;
        }
    }

    @Override
    public void dispensePrize() {
        System.out.println("请您先抽奖！");
    }
}
