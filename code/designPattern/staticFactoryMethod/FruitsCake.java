package designPattern.staticFactoryMethod;

/**
 * 巧克力蛋糕
 *
 * @author srs
 * @date 2019/3/18 13:53
 */
public class FruitsCake implements Cake {
    @Override
    public void getMaterial() {
        System.out.println("水果");
    }

    @Override
    public void getShape() {
        System.out.println("方形");
    }

    @Override
    public void getStyle() {
        System.out.println("九宫格");
    }

    @Override
    public String toString() {
        getMaterial();
        getShape();
        getStyle();
        return "水果蛋糕";
    }
}
