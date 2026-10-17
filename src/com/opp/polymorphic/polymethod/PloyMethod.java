package com.opp.polymorphic.polymethod;

public class PloyMethod {
    public static void main(String[] args) {
        //方法的重载体现多态
        A a = new A();
        //这里我们传入不同的参数，就会调用不同sum方法，就体现多态
        System.out.println(a.sum(1,2));
        System.out.println(a.sum(1,2,3));
        //方法重写体现多态
        B b = new B();
        a.say();
        b.say();
    }
}
