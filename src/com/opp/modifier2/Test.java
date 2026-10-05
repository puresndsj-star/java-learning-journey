package com.opp.modifier2;

import com.opp.modifier.Demo1;

public class Test {
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        //在不同包下，可以访问public修饰的属性或方法
        //但是不能访问protected，默认，private修饰的属性或方法
        System.out.println(demo1.n1);

        demo1.m1();
        //不能访问demo1.m2() 和demo1.m3()和demo1.m4();

    }
}
