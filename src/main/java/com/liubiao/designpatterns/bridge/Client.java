package com.liubiao.designpatterns.bridge;

/**
 * 桥接模式解决"手机操作问题"
 *
 * @author mc0710
 */
public class Client {

    public static void main(String[] args) {

        // 小米折叠手机开机了
        Brand xiaoMi = new XiaoMi();
        Phone phone = new FoldedPhone(xiaoMi);
        phone.open();

    }

}
