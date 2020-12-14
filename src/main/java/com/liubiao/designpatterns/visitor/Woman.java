package com.liubiao.designpatterns.visitor;

/**
 * @author mc0710
 * ** 这里使用了双分派。第一次分配是将具体的状态action作为参数传递到woman中；第二次分派将自己当做参数传到了方法getWomanResult（）中
 */
public class Woman extends AbstractPerson {

    @Override
    void accept(AbstractAction action) {
        action.getWomanResult(this);
    }

}
