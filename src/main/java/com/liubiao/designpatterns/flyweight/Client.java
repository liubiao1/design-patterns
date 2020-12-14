package com.liubiao.designpatterns.flyweight;

/**
 * 享元模式解决“网站外包问题”
 *
 * @author mc0710
 */
public class Client {

    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        WebSite news = webSiteFactory.getWebsite("新闻类");
        news.use(new User("张"));

        WebSite blog = webSiteFactory.getWebsite("博客类");
        blog.use(new User("刘"));

        WebSite news1 = webSiteFactory.getWebsite("新闻类");
        news1.use(new User("李"));

        // 看是几个对象
        System.out.println(webSiteFactory.getWebsiteNum());
    }

}
