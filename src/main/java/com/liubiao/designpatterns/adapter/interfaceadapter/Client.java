package com.liubiao.designpatterns.adapter.interfaceadapter;

/**
 * 接口适配器模式
 *
 * @author mc0710
 */
public class Client {

    private final static int src = 220;

    public static void main(String[] args) {
        AbstractAdapter abstractAdapter = new AbstractAdapter() {
            /**
             * 只需要去覆盖我们需要使用的接口方法
             */
            @Override
            public int operation1() {
                int target = src / 44;
                System.out.println("操作一是返回" + target + "V 电压");
                return target;
            }
        };
    }

}
