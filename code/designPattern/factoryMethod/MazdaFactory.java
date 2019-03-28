package designPattern.factoryMethod;

/**
 * @author shaorensheng
 * @date 2019/3/28 17:09
 */
public class MazdaFactory implements CarFactory {
    @Override
    public Car createCar() {
        MazdaCar mazdaCar = new MazdaCar();
        mazdaCar.getCar();
        return mazdaCar;
    }
}
