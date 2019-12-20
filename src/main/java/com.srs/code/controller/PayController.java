package com.srs.code.controller;

import com.srs.code.designPattern.strategyPattern.context.PayContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shaorensheng
 * @date 2019/12/20
 */
@RestController
public class PayController {

    @Autowired
    private PayContext payContext;

    @GetMapping("pay")
    public String toPay(@RequestParam(value = "payCode") String payCode){
        return payContext.toPay(payCode);
    }

}
