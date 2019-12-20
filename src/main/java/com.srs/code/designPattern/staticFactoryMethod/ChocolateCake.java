package com.srs.code.designPattern.staticFactoryMethod;

/**
 * 巧克力蛋糕
 *
 * @author srs
 * @date 2019/3/18 13:53
 */
public class ChocolateCake implements Cake {
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
        System.out.println("花");
    }

    @Override
    public String toString() {
        getMaterial();
        getShape();
        getStyle();
        return "巧克力蛋糕";
    }
}
