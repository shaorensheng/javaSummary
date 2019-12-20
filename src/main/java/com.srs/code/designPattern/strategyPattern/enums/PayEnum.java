package com.srs.code.designPattern.strategyPattern.enums;

/**
 * @author shaorensheng
 * @date 2019/12/20
 */
public enum PayEnum {
    ALI("com.srs.code.designPattern.strategyPattern.impl.AliPay"),
    WECHAT("com.srs.code.designPattern.strategyPattern.impl.WeChatPay"),
    BAIDU("com.srs.code.designPattern.strategyPattern.impl.BaiduPay");


    private String path;

    PayEnum(String path) {
        this.path = path;
    }


    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }}
