package com.liubiao.designpatterns.factory.easy;

/**
 * 简单工厂模式解决 “不通手机制造问题”
 * 
 * @author mc0710
 */
public class Client {

    public static void main(String[] args) {
        PhoneFactory factory = new PhoneFactory();
        factory.makePhone("xiaomi");
    }
    
}
