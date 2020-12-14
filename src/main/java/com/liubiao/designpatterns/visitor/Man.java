package com.liubiao.designpatterns.visitor;

/**
 * @author mc0710
 */
public class Man extends AbstractPerson {

    @Override
    void accept(AbstractAction action) {
        action.getManResult(this);
    }

}
