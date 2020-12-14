package com.liubiao.designpatterns.organization;

/**
 * 组合模式解决“学校院系展示需求”
 *
 * @author mc0710
 */
public class Client {

    public static void main(String[] args) {
        OrganizationComponent university = new University("清华大学", "清华大学11");
        OrganizationComponent computer = new College("计算机学院", "计算机学院22");
        OrganizationComponent info = new College("信息工程学院", "信息工程学院33");
        OrganizationComponent software = new Department("软件工程", "软件工程44");
        computer.add(software);
        OrganizationComponent network = new Department("网络工程", "网络工程55");
        computer.add(network);
        OrganizationComponent communicate = new Department("通信工程", "通信工程66");
        info.add(communicate);
        OrganizationComponent informationEngineering = new Department("网络工程", "网络工程77");
        info.add(informationEngineering);
        university.add(computer);
        university.add(info);

        university.printf();

    }

}


