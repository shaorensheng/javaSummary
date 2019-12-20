package com.srs.code.designPattern.factoryMethod;

/**
 * @author srs
 * @date 2019/3/28 17:09
 */
public class BenzFactory implements CarFactory {
    @Override
    public Car createCar() {
        BenzCar benzCar = new BenzCar();
        benzCar.getCar();
        return benzCar;
    }
}
