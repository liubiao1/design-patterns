package com.liubiao.designpatterns.flyweight;

/**
 * ConcreteFlyWeight 具体的享元角色
 *
 * @author mc0710
 */
public class ConcreteWebSite implements WebSite {

    /**
     * 网站类型
     */
    private String type;

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站发布类型type" + type + "使用者为user" + user.getName());
    }


}
