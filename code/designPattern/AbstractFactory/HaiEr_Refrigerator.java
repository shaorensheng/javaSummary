package designPattern.AbstractFactory;

/**
 * 海尔冰箱
 *
 * @author srs
 * @date 2019/4/8 11:11
 */
public class HaiEr_Refrigerator implements Refrigerator {
    @Override
    public void storage() {
        System.out.println("用海尔冰箱存储。");
    }
}
