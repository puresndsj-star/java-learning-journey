package com.opp.polymorphic.polymorphicdemo;

public class PolymorphicDemo {
    public static void main(String[] args) {
        Master m = new Master("张三");
        m.feed(new Pig("小花"), new Rice("大米"));
        //new Pig() new Rice()是临时对象，用完就销毁
    }
}
