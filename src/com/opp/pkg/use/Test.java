package com.opp.pkg.use;
//同名类，不同包只能引用一个
import com.opp.pkg.demo2.Dog;

public class Test {
    public static void main(String[] args) {
        com.opp.pkg.demo1.Dog dog = new com.opp.pkg.demo1.Dog();
        System.out.println(dog);//com.package1.demo1.Dog@5f184fc6
        Dog dog1 = new Dog();
        System.out.println(dog1);//com.package1.demo2.Dog@6f496d9f

    }
}
