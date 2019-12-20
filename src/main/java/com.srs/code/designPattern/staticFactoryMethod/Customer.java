package com.srs.code.designPattern.staticFactoryMethod;

import java.text.ParseException;

/**
 * 顾客
 *
 * @author srs
 * @date 2019/3/18 14:17
 */
public class Customer {

    /**
     * 买蛋糕
     * @param cakeName
     * @return
     */
    public Cake buyCake(String cakeName){
        return CakeFactory.createCake(cakeName);
    }

    public static void main(String[] args) throws ParseException {
        Customer customer = new Customer();
        Cake cake = customer.buyCake("巧克力蛋糕");
        System.out.println("顾客买到了"+cake.toString());
    }

}
