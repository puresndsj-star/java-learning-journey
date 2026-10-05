package com.opp.thiskeyword;

public class ThisDemo2 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        t1.f2();
        t1.f3();
    }
}
class T1 {
    String name;
    //细节：访问构造器语法：this（参数列表）
    //注意只能在构造器中调用构造器（即只能在构造器中访问另外一个构造器）
    public T1(String name) {
        System.out.println("T1(String name)的有参构造器");
    }
    public T1() {
        //旧jdk特性：在构造器中，this（参数列表）必须在第一行，且只能出现一次
        this("张三"); //调用T1(String name)的有参构造器
        System.out.println("T1的无参构造器");
        //jdk22及以上新特性：新增预览功能，允许在this（参数列表）之前放置不访问实例成员的简单语句
        //this("张三"); //调用T1(String name)的有参构造器

    }

    //细节：访问成员方法的语法：this.方法名（参数列表）
    public void f1() {
        System.out.println("f1()");
    }
    public void f2() {
        System.out.println("f2()");
        //调用本类的成员方法f1()
        //第一种方式
        f1();
        //第二种方式
        this.f1();

    }
    public void f3() {
        String name = "张三";
        //传统方式，按照就近原则访问,成员变量中没有再去访问属性
        System.out.println("name:"+name);
        //this方式访问属性
        System.out.println("name:"+this.name);

    }

}


