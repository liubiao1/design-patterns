package com.liubiao.designpatterns.iterator;

import java.util.ArrayList;

/**
 * 用迭代器模式解决  “在一个页面中展示出学校的院系组成，一个学校有多个学院，一个学院有多个系”
 *
 * @author mc0710
 */
public class Client {

    public static void main(String[] args) {
        // 创建学院
        ArrayList<Collage> collages = new ArrayList<>();

        // 创建系
        ComputerCollage computerCollage = new ComputerCollage();
        InfoCollage infoCollage = new InfoCollage();

        // 将系加入学院
        collages.add(computerCollage);
        collages.add(infoCollage);

        OutPutImpl outPut = new OutPutImpl(collages);

        outPut.printCollage();
    }

}
