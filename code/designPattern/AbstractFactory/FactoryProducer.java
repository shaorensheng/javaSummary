package designPattern.AbstractFactory;

/**
 * 工厂注册类
 *
 * @author shaorensheng
 * @date 2019/4/8 11:17
 */
public class FactoryProducer {

    /**
     * 创建工厂
     * @param factoryName
     * @return
     */
    public static Factory createFactory(String factoryName){
        if (factoryName == null){
            return null;
        }
        Factory factory = null;
        switch (factoryName.toUpperCase()){
            case "TV":
                factory = new Tv_Factory();
                break;
            case "REFRIGERATOR":
                factory = new Refrigerator_Factory();
                break;
        }
        return factory;
    }

}
