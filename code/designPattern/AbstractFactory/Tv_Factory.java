package designPattern.AbstractFactory;

/**
 * 电视机工厂
 *
 * @author srs
 * @date 2019/4/8 10:10
 */
public class Tv_Factory extends Factory {
    /**
     * 生产电视
     * @param tvName
     * @return
     */
    @Override
    public Tv CreateTv(String tvName) {
        if (tvName == null){
            return null;
        }
        Tv tv = null;
        switch (tvName.toUpperCase()){
            case "HAIER":
                tv = new HaiEr_Tv();
                break;
            case "HAIXIN":
                tv = new HaiXin_Tv();
                break;
            case "TCL":
                tv = new TCL_Tv();
                break;
        }
        return tv;
    }

    @Override
    public Refrigerator CreateRefrigerator(String refrigeratorName) {
        return null;
    }
}
