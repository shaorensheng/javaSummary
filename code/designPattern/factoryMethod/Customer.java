package designPattern.factoryMethod;

/**
 * @author srs
 * @date 2019/3/28 17:05
 */
public class Customer {

    /**
     * 买车
     * @param carFactory
     * @return
     */
    public Car buyCar(CarFactory carFactory){
        return carFactory.createCar();
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        Car jeep = customer.buyCar(new JeepFactory());
        Car mazda = customer.buyCar(new MazdaFactory());
        Car benz = customer.buyCar(new BenzFactory());
    }
}
