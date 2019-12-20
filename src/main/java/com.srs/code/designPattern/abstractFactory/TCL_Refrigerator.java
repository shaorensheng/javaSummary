package com.srs.code.designPattern.abstractFactory;

/**
 * TCl冰箱
 *
 * @author srs
 * @date 2019/4/8 11:11
 */
public class TCL_Refrigerator implements Refrigerator {
    @Override
    public void storage() {
        System.out.println("用TCL冰箱存储。");
    }
}
