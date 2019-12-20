package com.srs.code.designPattern.staticFactoryMethod;

/**
 * Copyright (C) 2017/6/20
 *
 * @author :srs
 * @version:v1.0.0 Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2019/3/18   srs                      v1.0.0        create
 */
public interface Cake {

    /**
     * 原料
     */
    public void getMaterial();

    /**
     * 形状
     */
    public void getShape();

    /**
     * 样式
     */
    public void getStyle();
}
