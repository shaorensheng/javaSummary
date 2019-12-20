package com.srs.code.designPattern.strategyPattern.impl;

import com.srs.code.designPattern.strategyPattern.Pay;
import org.springframework.stereotype.Component;

/**
 * @author shaorensheng
 * @date 2019/12/20
 */
@Component
public class WeChatPay implements Pay {

    @Override public String toPay() {
        return "使用微信Pay。。。";
    }
}
