package com.srs.code.designPattern.abstractFactory;

/**
 * 海信冰箱
 *
 * @author srs
 * @date 2019/4/8 11:11
 */
public class HaiXin_Refrigerator implements Refrigerator {
    @Override
    public void storage() {
        System.out.println("用海信冰箱存储。");
    }
}
