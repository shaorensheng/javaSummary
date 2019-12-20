package com.srs.code.designPattern.staticFactoryMethod;

/**
 * 咩咩羊蛋糕
 *
 * @author srs
 * @date 2019/3/18 13:53
 */
public class SheepCake implements Cake {
    @Override
    public void getMaterial() {
        System.out.println("巧克力");
    }

    @Override
    public void getShape() {
        System.out.println("圆形");
    }

    @Override
    public void getStyle() {
        System.out.println("羊");
    }

    @Override
    public String toString() {
        getMaterial();
        getShape();
        getStyle();
        return "咩咩羊蛋糕";
    }
}
