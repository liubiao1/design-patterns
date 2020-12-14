package com.liubiao.designpatterns.flyweight;

/**
 * FlyWeight 抽象的享元角色
 *
 * @author mc0710
 */
public interface WebSite {

    /**
     * 用户使用网站
     *
     * @param user 用户
     */
    void use(User user);

}
