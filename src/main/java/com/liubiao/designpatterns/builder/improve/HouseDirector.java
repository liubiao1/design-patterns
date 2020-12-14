package com.liubiao.designpatterns.builder.improve;

/**
 * 指挥者
 *
 * @author mc0710
 */
public class HouseDirector {

    AbstractHouseBuilder abstractHouseBuilder;

    /**
     * 构造器传入
     *
     * @param abstractHouseBuilder 抽象房子建造者
     */
    public HouseDirector(AbstractHouseBuilder abstractHouseBuilder) {
        this.abstractHouseBuilder = abstractHouseBuilder;
    }

    /**
     * setter传入
     *
     * @param abstractHouseBuilder 抽象房子建造者
     */
    public void setAbstractHouseBuilder(AbstractHouseBuilder abstractHouseBuilder) {
        this.abstractHouseBuilder = abstractHouseBuilder;
    }

    /**
     * 建造房子的顺序啥的由指挥者决定
     *
     * @return 房子
     */
    public House constructHouse() {
        abstractHouseBuilder.buildBasic();
        abstractHouseBuilder.buildWalls();
        abstractHouseBuilder.roofed();
        return abstractHouseBuilder.build();
    }
}
