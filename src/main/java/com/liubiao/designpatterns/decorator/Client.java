package com.liubiao.designpatterns.decorator;

/**
 * 装饰者模式解决“星巴克点咖啡的问题”
 *
 * @author mc0710
 */
public class Client {

    public static void main(String[] args) {

        // 点咖啡
        AbstractDrink drink = new ShortBlack();
        System.out.println(drink.des + ";" + drink.cost());
        // 加牛奶
        drink = new Milk(drink);
        System.out.println(drink.des + ";" + drink.cost());
        // 再加一份
        drink = new Milk(drink);
        System.out.println(drink.des + ";" + drink.cost());
    }

}
