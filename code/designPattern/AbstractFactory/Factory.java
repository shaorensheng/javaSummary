package designPattern.AbstractFactory;

/**
 * 工厂父类
 * Copyright (C) 2017/6/20
 *
 * @author :srs
 * @version:v1.0.0 Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2019/4/8   srs                      v1.0.0        create
 */
public abstract class Factory {

    /**
     * 获取电视机产品
     * @param tvName
     * @return
     */
    public abstract Tv CreateTv(String tvName);


    /**
     * 获取冰箱产品
     * @param refrigeratorName
     * @return
     */
    public abstract Refrigerator CreateRefrigerator(String refrigeratorName);

}
