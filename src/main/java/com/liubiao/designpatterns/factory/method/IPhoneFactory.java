package com.liubiao.designpatterns.factory.method;

import com.liubiao.designpatterns.factory.easy.Phone;

/**
 * 生产不同产品的工厂接口(生产不同手机的工厂是不同的)
 *
 * @author mc0710
 */
public interface IPhoneFactory {

    /**
     * 生产手机
     *
     * @return 生产出来的手机
     */
    Phone make();

}
