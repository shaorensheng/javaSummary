package com.srs.code.designPattern.abstractFactory;

/**
 * 海信电视机
 * @author srs
 * @date 2019/4/8 10:03
 */
public class HaiXin_Tv implements Tv {
    @Override
    public void watchTv() {
        System.out.println("看海信电视。");
    }
}
