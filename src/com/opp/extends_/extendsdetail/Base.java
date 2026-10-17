package com.opp.extends_.extendsdetail;

public class Base extends TopBase {//父类
    //4个属性
    public int n1;
    protected int n2;
    int n3=300;
    private int n4=400;
    //父类构造器的调用不限于直接父类！将一直往上追溯直到Object类(顶级父类)
    public Base() {
        System.out.println("父类Base()被调用");
    }
    public Base(String name,int age) {
        System.out.println("父类Base(String name,int age)被调用");
    }
    public Base(String name) {
        System.out.println("父类Base(String name)被调用");
    }

    public int getN4() {
        return n4;
    }
    //4个方法
    public void test100() {
        System.out.println("test100");
    }
    protected void test200() {
        System.out.println("test200");
    }
    void test300() {
        System.out.println("test300");
    }
    private void test400() {
        System.out.println("test400");
    }
    //call test400
    public void callTest400() {
        test400();
    }
}
