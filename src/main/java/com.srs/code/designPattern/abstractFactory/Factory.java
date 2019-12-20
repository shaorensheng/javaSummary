package com.srs.code.designPattern.abstractFactory;

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
     * 电视机工厂
     * @param tvName
     * @return
     */
    public abstract Tv CreateTv(String tvName);


    /**
     * 冰箱工厂
     * @param refrigeratorName
     * @return
     */
    public abstract Refrigerator CreateRefrigerator(String refrigeratorName);

}
