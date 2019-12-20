package com.srs.code.designPattern.strategyPattern.context;

import com.srs.code.designPattern.strategyPattern.Pay;
import com.srs.code.designPattern.strategyPattern.factory.PayFactory;
import com.srs.code.entiy.PayChannel;
import com.srs.code.mapper.PayChannelMapper;
import com.srs.code.utils.SpringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author shaorensheng
 * @date 2019/12/20
 */
@Component
public class PayContext {

    @Autowired
    private PayChannelMapper payChannelMapper;

    public String toPay(String payCode) {
        if (payCode == null || "".equals(payCode)) {
            return "payCode不能为空";
        }
        //方式一:使用工厂 + 枚举的方式获取对象
//        PayFactory factory = new PayFactory();
//        Pay pay = factory.getPay(payCode);
        //方式二：使用Spring管理bean获取对象
        PayChannel payChannel = payChannelMapper.getPayByPayCode(payCode);
        if (payChannel == null) {
            return "未获取到支付渠道";
        }
        String beanID = payChannel.getBeanID();
        if (beanID == null || "".equals(beanID)) {
            return "渠道异常";
        }
        Pay pay = (Pay) SpringUtils.getBean(beanID);
        if (pay == null) {
            return "未找到支付方式";
        }
        return pay.toPay();
    }

}
