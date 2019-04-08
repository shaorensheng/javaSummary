package designPattern.factoryMethod;

/**
 * @author srs
 * @date 2019/3/28 17:09
 */
public class JeepFactory implements CarFactory {
    @Override
    public Car createCar() {
        JeepCar jeepCar = new JeepCar();
        jeepCar.getCar();
        return jeepCar;
    }
}
