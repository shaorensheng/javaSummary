package com.srs.code.designPattern.staticFactoryMethod;

/**
 * 蛋糕店
 *
 * @author srs
 * @date 2019/3/18 13:59
 */
public class CakeFactory {

    public static Cake createCake(String cakeName){
        Cake cake = null;
        switch (cakeName){
            case "巧克力蛋糕":
                cake = new ChocolateCake();
                break;
            case "水果蛋糕":
                cake = new FruitsCake();
                break;
            case "咩咩羊蛋糕":
                cake = new SheepCake();
                break;
        }
        return cake;
    }

}
