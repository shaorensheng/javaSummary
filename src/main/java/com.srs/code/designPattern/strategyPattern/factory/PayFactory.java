package com.srs.code.designPattern.strategyPattern.factory;

import com.srs.code.designPattern.strategyPattern.Pay;
import com.srs.code.designPattern.strategyPattern.enums.PayEnum;

/**
 * @author shaorensheng
 * @date 2019/12/20
 */
public class PayFactory {

    public Pay getPay(String payCode) {
        try {
            String path = PayEnum.valueOf(payCode).getPath();
            return (Pay)Class.forName(path).newInstance();
        }
        catch (Exception e) {
            return null;
        }
    }

}
