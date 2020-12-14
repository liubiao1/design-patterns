package com.liubiao.designpatterns.observer;

/**
 * 观察者接口
 *
 * @author mc0710
 */
public interface Observer {

    /**
     * 更新
     *
     * @param temperature 温度
     * @param pressure    气压
     * @param humidity    湿度
     */
    void update(float temperature, float pressure, float humidity);

}
