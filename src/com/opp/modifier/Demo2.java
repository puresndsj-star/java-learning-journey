package com.opp.modifier;

public class Demo2 {
    public void say(){
        Demo1 demo1 = new Demo1();
        //在同一个包下，可以访问public,protected和默认修饰属性或方法,不能访问private属性或方法
        System.out.println(demo1.n1);
        System.out.println(demo1.n2);
        System.out.println(demo1.n3);
        demo1.m1();
        demo1.m2();
        demo1.m3();
        //demo1.m4();错误的
    }
}
