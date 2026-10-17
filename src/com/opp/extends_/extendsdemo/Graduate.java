package com.opp.extends_.extendsdemo;

public class Graduate extends Student {
    public Graduate(String name, int age, double score) {
        super(name, age, score);
    }
    //Graduate特有方法
    public void testing() {
        System.out.println("Graduate"+getName()+"正在考大学数学");
    }
}
