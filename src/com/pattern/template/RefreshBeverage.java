package com.pattern.template;

/**
 * 抽象基类，为所有子类提供一个算法框架
 * Created by ren on 2017/8/15.
 */
public abstract class RefreshBeverage {

    /**
     * 封装饮料的模板方法
     * 封装了所有子类共同遵循的算法框架
     */
    public final void prepareBeverageTemplate(){
        //步骤1 将水煮沸
        boilWater();
        //步骤2 泡制饮料
        brew();
        //步骤3 将饮料导入杯中
        pourInCup();
        //步骤4 加入调味料
        if (isCustomerWantsCondiments()){
            addCondiments();
        }

    }



    protected abstract void addCondiments();
    protected abstract void brew();

    protected boolean isCustomerWantsCondiments() {
        return true;
    }
    /**
     * 基本方法：将水煮沸
     */
    private void boilWater() {
        System.out.println("将水煮沸");
    }

    /**
     * 基本方法：倒入杯中
     */
    private void pourInCup() {
        System.out.println("倒入杯中");
    }

}

