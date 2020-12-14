package com.liubiao.designpatterns.factory.abs;

import com.liubiao.designpatterns.factory.easy.Phone;

/**
 *
 *
 * @author mc0710
 */
public interface IFactory {

    Phone makePhone();

    IPc makePc();

}
