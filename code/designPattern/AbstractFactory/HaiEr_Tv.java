package designPattern.AbstractFactory;

/**
 * 海尔电视机
 * @author srs
 * @date 2019/4/8 10:03
 */
public class HaiEr_Tv implements Tv {
    @Override
    public void watchTv() {
        System.out.println("看海尔电视。");
    }
}
