package com.pattern.template;

/**
 * Created by ren on 2017/8/15.
 */
public class Tea extends RefreshBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("加入柠檬");
    }

    @Override
    protected void brew() {
        System.out.println("80°热水泡制5分钟");
    }
    @Override
    protected boolean isCustomerWantsCondiments() {
        return false;
    }
}
