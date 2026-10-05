package com.opp.constructor;

public class ConstructorDemo1 {
    public static void main(String[] args) {
        //当我们new一个对象时，直接通过构造器指定名字和年龄
        Person1 p1=new Person1("张三",18);//调用第一个构造器
        System.out.println("姓名："+p1.name+"，年龄："+p1.age);
        Person1 p2=new Person1("李四");//调用第二个构造器
        System.out.println("姓名："+p2.name+"，年龄："+p2.age);
        Dog dog1 = new Dog();//调用默认无参构造器

    }
}
//在创建人类的对象时，就直接指定这个对象的年龄和姓名
class Person1{
    String name;
    int age;
    //1.构造器没有返回值
    //2.构造器的名称必须和类名相同
    //3.（String pName,int pAge）是构造器形参列表，规则和成员方法一样
    //第一个构造器
    public Person1(String pName,int pAge){
        System.out.println("构造方法被调用,完成对象的属性初始化");
        name=pName;
        age=pAge;
    }
    //第二个构造器，只指定名字
    public Person1(String pName){
        name=pName;

    }
}
class Dog{
    //如果程序员没有定义构造器，编译器会自动生成一个默认无参构造器（也叫默认构造器）//
    //使用反编译工具查看源码，会发现编译器自动生成的默认构造器是无参的，即：Dog() {}
    //默认构造器的修饰符和类的修饰符一致
    //默认构造器
//    Dog() {
//    }
    //一旦定义了自己的构造器，默认的构造器就覆盖了，就不能再使用默认的无参构造器
    //除非显式地在定义一下，即Dog() {}(这点很重要)
    //带参构造器
    public Dog(String dName) {

    }
    Dog(){//显示的定义一下 无参构造器

    }

}
