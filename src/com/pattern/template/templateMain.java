package com.pattern.template;

/**
 * Created by ren on 2017/8/15.
 */
public class templateMain {


    public void templatePattern() {
        System.out.println("制备咖啡...");
        RefreshBeverage b1 = new Coffee();
        b1.prepareBeverageTemplate();
        System.out.println("咖啡好了！");

        System.out.println("制备茶...");
        RefreshBeverage b2 = new Tea();
        b2.prepareBeverageTemplate();
        System.out.println("茶好了！");
    }
}
