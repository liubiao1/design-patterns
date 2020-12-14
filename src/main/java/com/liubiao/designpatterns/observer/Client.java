package com.liubiao.designpatterns.observer;

/**
 * 观战者模式解决 “天气预报项目” 需求
 *
 * @author mc0710
 */
public class Client {

    public static void main(String[] args) {
        // 创建天气数据
        WeatherData weatherData = new WeatherData();
        // 创建观察者
        Baidu baidu = new Baidu();
        // 百度对接气象局，注册
        weatherData.registerObserver(baidu);
        weatherData.setData(1, 2, 3);
    }

}
