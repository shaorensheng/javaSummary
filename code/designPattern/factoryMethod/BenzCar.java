package designPattern.factoryMethod;

/**
 * @author shaorensheng
 * @date 2019/3/28 17:07
 */
public class BenzCar implements Car {
    @Override
    public void getCar() {
        System.out.println("这是一辆Benz");
    }
}
