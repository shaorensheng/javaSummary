package designPattern.AbstractFactory;

/**
 * 顾客类
 *
 * @author shaorensheng
 * @date 2019/4/8 11:16
 */
public class Customer {

    /**
     * 创建工厂，获取产品
     * @param args
     */
    public static void main(String[] args) {
        //创建TV工厂
        Factory tv = FactoryProducer.createFactory("TV");
        //获取电视产品
        Tv haier_tv = tv.CreateTv("haier");
        Tv haixin_tv = tv.CreateTv("haixin");
        Tv tcl_tv = tv.CreateTv("tcl");
        haier_tv.watchTv();
        haixin_tv.watchTv();
        tcl_tv.watchTv();
        //创建冰箱工厂
        Factory refrigerator = FactoryProducer.createFactory("refrigerator");
        //获取冰箱产品
        Refrigerator haier_refrigerator = refrigerator.CreateRefrigerator("haier");
        Refrigerator haixin_refrigerator = refrigerator.CreateRefrigerator("haixin");
        Refrigerator tcl_refrigerator = refrigerator.CreateRefrigerator("tcl");
        haier_refrigerator.storage();
        haixin_refrigerator.storage();
        tcl_refrigerator.storage();

    }

}
