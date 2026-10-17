package com.opp.override_.overridedemo;

public class Dog extends Animal{
    //1. 因为Dog 是 Animal子类
    //2. Dog 的 cry 方法和 Animal的 cry定义形式一样(名称、返回类型、参数)
    //3. 这时我们就说 Dog的cry方法，重写了Animal的cry方法
    @Override
    public void cry() {
        System.out.println("小狗汪汪叫");
    }
    //细节：子类方法的返回类型和父类方法返回类型一样，或者是父类返回类型的子类
    //比如 父类返回类型是Object,子类方法返回类型是String
    @Override
    public String m1() {
        return null;
    }
    //这里Object不是String的子类，因此编译错误
//    @Override
//    public Object m2() {
//        return null;
//    }

    @Override
    public BBB m3() {
        return null;
    }
    //细节:子类方法不能缩小父类方法的访问权限
    //public>protected>默认>private
    @Override
    public void eat() {

    }
}
