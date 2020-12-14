package com.liubiao.designpatterns.visitor;

/**
 * 投成功票
 *
 * @author mc0710
 */
public class Success extends AbstractAction {

    @Override
    void getManResult(Man man) {
        System.out.println("一名男人给该歌手投了成功票");
    }

    @Override
    void getWomanResult(Woman woman) {
        System.out.println("一名女人给该歌手投了成功票");
    }

}
