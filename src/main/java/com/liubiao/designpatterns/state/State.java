package com.liubiao.designpatterns.state;

/**
 * 状态接口
 *
 * @author mc0710
 */
public interface State {

    /**
     * 扣积分
     */
    void deduceMoney();

    /**
     * 是否可以抽奖
     *
     * @return true 是
     */
    boolean raffle();

    /**
     * 发放奖品
     */
    void dispensePrize();

}
