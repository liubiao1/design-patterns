package com.liubiao.designpatterns.flyweight;

import java.util.HashMap;

/**
 * @author mc0710
 */
public class WebSiteFactory {
    /**
     * 网站池
     */
    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    /**
     * 根据网站类型取池内对应网站对象
     *
     * @param type 网站类型
     * @return 网站
     */
    public WebSite getWebsite(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebSite(type));
        }
        return pool.get(type);
    }

    /**
     * 得到池内网站数量
     *
     * @return 池内网站数量
     */
    public int getWebsiteNum() {
        return pool.size();
    }


}
