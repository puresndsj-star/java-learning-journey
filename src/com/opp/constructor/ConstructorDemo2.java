package com.opp.constructor;

public class ConstructorDemo2 {
    public static void main(String[] args) {
        Person2 p1 = new Person2();
        //下面输出 name=null，age=18
        System.out.println("p1的name:"+p1.name+"，age:"+p1.age);
        //下面输出 name=张三，age=18
        Person2 p2 = new Person2("张三", 18);
        System.out.println("p2的name:"+p2.name+"，age:"+p2.age);

    }
}
/*
在前面定义的Person类中添加两个构造器：
第一个无参构造器：利用构造器设置所有人的age属性初始值都为18。
第二个带pName和pAge两个参数的构造器：使得每次创建Person对象的同时初始化对象的age属性值和name属性值。
分别使用不同的构造器，创建对象。
 */
class Person2{
    String name;
    int age;
    Person2(){
        System.out.println("无参构造器被调用");
        age = 18;
    }
     public Person2(String pName,int pAge){
         System.out.println("有参构造器被调用");
        name = pName;
        age = pAge;
    }
}

