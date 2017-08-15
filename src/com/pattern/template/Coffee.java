package com.pattern.template;

/**
 * 具体子类，提供了咖啡制备的具体实现
 * Created by ren on 2017/8/15.
 */
public class Coffee extends RefreshBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("加入糖和牛奶");
    }

    @Override
    protected void brew() {
        System.out.println("用沸水冲泡咖啡");
    }
}
