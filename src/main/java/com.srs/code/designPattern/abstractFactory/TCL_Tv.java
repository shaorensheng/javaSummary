package com.srs.code.designPattern.abstractFactory;

/**
 * Tcl电视机
 * @author srs
 * @date 2019/4/8 10:03
 */
public class TCL_Tv implements Tv {
    @Override
    public void watchTv() {
        System.out.println("看TCL电视。");
    }
}
