package designPattern.AbstractFactory;

/**
 * 冰箱工厂类
 * @author srs
 * @date 2019/4/8 11:08
 */
public class Refrigerator_Factory extends Factory {
    @Override
    public Tv CreateTv(String tvName) {
        return null;
    }

    /**
     * 生产冰箱
     * @param refrigeratorName
     * @return
     */
    @Override
    public Refrigerator CreateRefrigerator(String refrigeratorName) {
        if (refrigeratorName == null){
            return null;
        }
        Refrigerator refrigerator = null;
        switch (refrigeratorName.toUpperCase()){
            case "HAIER":
                refrigerator = new HaiEr_Refrigerator();
                break;
            case "HAIXIN":
                refrigerator = new HaiXin_Refrigerator();
                break;
            case "TCL":
                refrigerator = new TCL_Refrigerator();
                break;
        }
        return refrigerator;
    }
}
