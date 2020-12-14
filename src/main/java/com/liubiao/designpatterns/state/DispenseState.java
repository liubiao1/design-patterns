package com.liubiao.designpatterns.state;

/**
 * 发放奖品状态
 *
 * @author mc0710
 */
public class DispenseState implements State {

    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("奖品发放中。。、");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发放中。。、");
        return false;
    }

    @Override
    public void dispensePrize() {
        if (activity.getCount() > 0) {
            System.out.println("恭喜中奖了");
            activity.setState(activity.getNoRaffleState());
            // 剩余奖品数量减1
            activity.count = activity.count - 1;
        } else {
            System.out.println("很遗憾，奖品发放完了");
            activity.setState(activity.getDispenseOutState());
        }
    }
}
