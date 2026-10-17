package com.opp.extends_.extendsexercise;

public class ExtendsExercise02 {
    //main 方法中： Cc=newC(); 输出么内容?3min
    public static void main(String[] args) {
        C c=new C();
        //先进C类的无参构造，然后走第一句this("hello")，
        // 调用C类的有参构造，然后走有参的super("hahah")，
        // 调用B类的有参构造，然后走B类的无参构造，调用A类的无参构造，
        // 输出：我是 A 类    ；hahah我是 B 类的有参构造；我是 c 类的有参构造；
        // 最后走c类无参构造的最后一句，输出：我是 c 类的无参构造
    }
}
class A{//A 类
    public A() {
        System.out.println("我是 A 类");
    }
}
class B extends A{ //B 类,继承 A 类
    public B() {

        System.out.println("我是 B 类的无参构造");
    }
    public B(String name) {
        System.out.println(name + "我是 B 类的有参构造");
    }
}
class C extends B { //C 类，继承 B类
    public C() {
        //this(参数) 调用本类其他构造器，必须是第一行
        this("hello");//调用 C 类的有参构造
        System.out.println("我是 c 类的无参构造");
    }
    public C(String name) {
        super("hahah");
        System.out.println("我是c类的有参构造");
    }
}